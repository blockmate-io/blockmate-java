package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.ExchangeRate;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExchangeRateInfoApi {
  /**
   * Get current exchange rate
   * 
   * @param pairs Currency pairs for which exchange rate should be returned (required)
   * @return Call&lt;List&lt;ExchangeRate&gt;&gt;
   */
  @GET("v1/exchangerate/current")
  Call<List<ExchangeRate>> getCurrentExchangeRate(
    @retrofit2.http.Query("pairs") String pairs
  );

  /**
   * Get historical exchange rate
   * 
   * @param pair Currency pair for which exchange rates should be returned (required)
   * @param days Historical dates for which exchange rates should be returned (required)
   * @return Call&lt;List&lt;ExchangeRate&gt;&gt;
   */
  @GET("v1/exchangerate/history")
  Call<List<ExchangeRate>> getHistoricalExchangeRate(
    @retrofit2.http.Query("pair") String pair, @retrofit2.http.Query("days") String days
  );

}
