package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.ConnectAccount200Response;
import io.blockmate.client.model.ConnectAccount400Response;
import io.blockmate.client.model.ConnectAccount405Response;
import io.blockmate.client.model.ConnectAccountRequest;
import io.blockmate.client.model.DeleteAccount404Response;
import io.blockmate.client.model.GetAccountHint200Response;
import io.blockmate.client.model.GetAccountHint403Response;
import io.blockmate.client.model.GetAccountHint404Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserAccountManagementApi {
  /**
   * Connect new account
   * 
   * @param accountProvider URL value from account_providers method (required)
   * @param connectAccountRequest OK (optional)
   * @return Call&lt;ConnectAccount200Response&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v1/{account_provider}/connect")
  Call<ConnectAccount200Response> connectAccount(
    @retrofit2.http.Path("account_provider") String accountProvider, @retrofit2.http.Body ConnectAccountRequest connectAccountRequest
  );

  /**
   * Delete account
   * 
   * @param accountProvider URL value from account_providers method (required)
   * @param accountId Account ID (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("v1/{account_provider}/account/{account_id}")
  Call<Void> deleteAccount(
    @retrofit2.http.Path("account_provider") String accountProvider, @retrofit2.http.Path("account_id") String accountId
  );

  /**
   * Get account hint
   * 
   * @param accountProvider URL value from account_providers method (required)
   * @return Call&lt;GetAccountHint200Response&gt;
   */
  @GET("v1/{account_provider}/connect")
  Call<GetAccountHint200Response> getAccountHint(
    @retrofit2.http.Path("account_provider") String accountProvider
  );

}
