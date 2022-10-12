package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.UserAPIAuthenticateProject200Response;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AuthenticationApi {
  /**
   * Authenticate developer
   * 
   * @return Call&lt;UserAPIAuthenticateProject200Response&gt;
   */
  @GET("v1/auth/developer")
  Call<UserAPIAuthenticateProject200Response> userAPIAuthenticateDeveloper();
    

  /**
   * Authenticate project
   * 
   * @return Call&lt;UserAPIAuthenticateProject200Response&gt;
   */
  @GET("v1/auth")
  Call<UserAPIAuthenticateProject200Response> userAPIAuthenticateProject();
    

}
