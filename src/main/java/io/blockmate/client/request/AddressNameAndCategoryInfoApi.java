package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.GetAddressNameInfoMulti200ResponseValue;
import io.blockmate.client.model.GetAddressNameInfoSingle200Response;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AddressNameAndCategoryInfoApi {
  /**
   * Get address name and category info for multiple addresses
   * 
   * @param chain Blockchain identifier (required)
   * @param requestBody Addresses for which name and category should be returned (maximum of 5000 in one request) (optional)
   * @return Call&lt;Map&lt;String, GetAddressNameInfoMulti200ResponseValue&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v1/addressname/multi")
  Call<Map<String, GetAddressNameInfoMulti200ResponseValue>> getAddressNameInfoMulti(
    @retrofit2.http.Query("chain") String chain, @retrofit2.http.Body List<String> requestBody
  );

  /**
   * Get address name and category info for single address
   * 
   * @param address Address for which name and category should be returned (required)
   * @param chain Blockchain identifier (required)
   * @return Call&lt;GetAddressNameInfoSingle200Response&gt;
   */
  @GET("v1/addressname/simple")
  Call<GetAddressNameInfoSingle200Response> getAddressNameInfoSingle(
    @retrofit2.http.Query("address") String address, @retrofit2.http.Query("chain") String chain
  );

}
