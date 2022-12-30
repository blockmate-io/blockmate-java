package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.GetAnalytics200Response;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AnalyticsApi {
  /**
   * Get analytics focused on gaming
   * Get analytics focused on gaming. All empty values are omitted from the response. Values are recalculated once per day.
   * @param accountProvider URL value from account_providers method (required)
   * @param accountId Account ID (required)
   * @return Call&lt;GetAnalytics200Response&gt;
   */
  @GET("v1/analytics/{account_provider}/account/{account_id}/stats")
  Call<GetAnalytics200Response> getAnalytics(
    @retrofit2.http.Path("account_provider") String accountProvider, @retrofit2.http.Path("account_id") String accountId
  );

}
