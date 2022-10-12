package io.blockmate.client.auth;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class ApiKeyAuth implements Interceptor {
    private final String location;
    private final String paramName;

    private String apiKey;

    public ApiKeyAuth(String location, String paramName) {
        this.location = location;
        this.paramName = paramName;
    }

    public String getLocation() {
        return location;
    }

    public String getParamName() {
        return paramName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        String paramValue;
        Request request = chain.request();

        if ("query".equals(location)) {
            String newQuery = request.url().uri().getQuery();
            paramValue = paramName + "=" + apiKey;
            if (newQuery == null) {
                newQuery = paramValue;
            } else {
                newQuery += "&" + paramValue;
            }

            URI newUri;
            try {
                newUri = new URI(request.url().uri().getScheme(), request.url().uri().getAuthority(),
                    request.url().uri().getPath(), newQuery, request.url().uri().getFragment());
            } catch (URISyntaxException e) {
                throw new IOException(e);
            }

            request = request.newBuilder().url(newUri.toURL()).build();
        } else if ("header".equals(location)) {
            request = request.newBuilder()
                    .addHeader(paramName, apiKey)
                    .build();
        } else if ("cookie".equals(location)) {
            request = request.newBuilder()
                    .addHeader("Cookie", String.format("%s=%s", paramName, apiKey))
                    .build();
        }
        return chain.proceed(request);
    }
}
