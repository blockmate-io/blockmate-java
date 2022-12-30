package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.Analytics;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AnalyticsApi {
  /**
   * Get analytics focused on gaming for specified account and provider
   * Get analytics focused on gaming for specified account and provider. All empty values are omitted from the response. Values are recalculated once per day.
   * @param accountProvider URL value from account_providers method (required)
   * @param accountId Account ID (required)
   * @return Call&lt;Analytics&gt;
   */
  @GET("v1/analytics/{account_provider}/account/{account_id}/stats")
  Call<Analytics> getAccountAnalytics(
    @retrofit2.http.Path("account_provider") String accountProvider, @retrofit2.http.Path("account_id") String accountId
  );

  /**
   * Get analytics focused on gaming for whole project
   * Get analytics focused on gaming for whole project. All empty values are omitted from the response. Values are recalculated once per day.
   * @return Call&lt;Map&lt;String, Analytics&gt;&gt;
   */
  @GET("v1/analytics/project/stats")
  Call<Map<String, Analytics>> getProjectAnalytics();
    

  /**
   * Get analytics focused on gaming for specified provider
   * Get analytics focused on gaming for specified provider. All empty values are omitted from the response. Values are recalculated once per day.
   * @param accountProvider URL value from account_providers method (required)
   * @return Call&lt;Map&lt;String, Analytics&gt;&gt;
   */
  @GET("v1/analytics/{account_provider}/stats")
  Call<Map<String, Analytics>> getProviderAnalytics(
    @retrofit2.http.Path("account_provider") String accountProvider
  );

  /**
   * Get analytics focused on gaming for this user
   * Get analytics focused on gaming for this user. All empty values are omitted from the response. Values are recalculated once per day.
   * @return Call&lt;Map&lt;String, Analytics&gt;&gt;
   */
  @GET("v1/analytics/user/stats")
  Call<Map<String, Analytics>> getUserAnalytics();
    

}
