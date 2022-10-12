package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.AuthUser200Response;
import io.blockmate.client.model.CreateUserRequest;
import io.blockmate.client.model.DeleteUser200Response;
import io.blockmate.client.model.DeleteUser404Response;
import io.blockmate.client.model.GetUser404Response;
import io.blockmate.client.model.User;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserManagementApi {
  /**
   * Authenticate user
   * 
   * @param id User id (required)
   * @return Call&lt;AuthUser200Response&gt;
   */
  @GET("v1/users/{id}/auth")
  Call<AuthUser200Response> authUser(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Create user
   * 
   * @param createUserRequest User (optional)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v1/users")
  Call<User> createUser(
    @retrofit2.http.Body CreateUserRequest createUserRequest
  );

  /**
   * Delete user
   * 
   * @param id User id (required)
   * @return Call&lt;DeleteUser200Response&gt;
   */
  @DELETE("v1/users/{id}")
  Call<DeleteUser200Response> deleteUser(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get user
   * 
   * @param id User id (required)
   * @return Call&lt;User&gt;
   */
  @GET("v1/users/{id}")
  Call<User> getUser(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List users
   * 
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("v1/users")
  Call<List<User>> listUsers();
    

  /**
   * Update user
   * 
   * @param id User id (required)
   * @param createUserRequest User (optional)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v1/users/{id}")
  Call<User> updateUser(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body CreateUserRequest createUserRequest
  );

}
