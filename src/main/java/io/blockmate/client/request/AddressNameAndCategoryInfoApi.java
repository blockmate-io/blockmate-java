package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.GetAddressNameInfo200Response;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AddressNameAndCategoryInfoApi {
  /**
   * Get address name and category info
   * 
   * @param address Address for wich name and category should be returned (required)
   * @param chain Blockchain identifier (required)
   * @return Call&lt;GetAddressNameInfo200Response&gt;
   */
  @GET("v1/addressname/simple")
  Call<GetAddressNameInfo200Response> getAddressNameInfo(
    @retrofit2.http.Query("address") String address, @retrofit2.http.Query("chain") String chain
  );

}
