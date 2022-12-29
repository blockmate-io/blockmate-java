package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.GetAddressFromDomain200Response;
import io.blockmate.client.model.GetDomainFromAddress200Response;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EnsApi {
  /**
   * Get address for specified ENS domain
   * 
   * @param domain ENS domain for which Ethereum address should be returned (required)
   * @return Call&lt;GetAddressFromDomain200Response&gt;
   */
  @GET("v1/ens/addressFromDomain")
  Call<GetAddressFromDomain200Response> getAddressFromDomain(
    @retrofit2.http.Query("domain") String domain
  );

  /**
   * Get domain and metadata for specified ENS address
   * 
   * @param address Ethereum address for which domain and metadata should be returned (required)
   * @return Call&lt;GetDomainFromAddress200Response&gt;
   */
  @GET("v1/ens/domainFromAddress")
  Call<GetDomainFromAddress200Response> getDomainFromAddress(
    @retrofit2.http.Query("address") String address
  );

}
