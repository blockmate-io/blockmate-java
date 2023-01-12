package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.AddressRiskReport;
import io.blockmate.client.model.GetAddressRiskScore200Response;
import io.blockmate.client.model.GetTransactionRiskScore200Response;
import io.blockmate.client.model.TransactionRiskReport;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RiskInfoApi {
  /**
   * Get address risk score
   * 
   * @param address Address for which risk should be returned (optional)
   * @param chain Blockchain identifier (optional)
   * @return Call&lt;GetAddressRiskScore200Response&gt;
   */
  @GET("v1/risk/score")
  Call<GetAddressRiskScore200Response> getAddressRiskScore(
    @retrofit2.http.Query("address") String address, @retrofit2.http.Query("chain") String chain
  );

  /**
   * Get address risk score case
   * 
   * @param caseId Case identifier (required)
   * @return Call&lt;AddressRiskReport&gt;
   */
  @GET("v1/risk/score/details/{case_id}")
  Call<AddressRiskReport> getAddressRiskScoreCase(
    @retrofit2.http.Path("case_id") String caseId
  );

  /**
   * Get address risk score details
   * 
   * @param address Address for which risk should be returned (optional)
   * @param chain Blockchain identifier (optional)
   * @return Call&lt;AddressRiskReport&gt;
   */
  @GET("v1/risk/score/details")
  Call<AddressRiskReport> getAddressRiskScoreDetails(
    @retrofit2.http.Query("address") String address, @retrofit2.http.Query("chain") String chain
  );

  /**
   * Get multiple risk scores for addresses
   * 
   * @param chain Blockchain identifier (optional)
   * @param requestBody Addresses for which risk should be returned (maximum of 5000 in one request) (optional)
   * @return Call&lt;Map&lt;String, Integer&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("v1/risk/score")
  Call<Map<String, Integer>> getMultipleAddressRiskScore(
    @retrofit2.http.Query("chain") String chain, @retrofit2.http.Body List<String> requestBody
  );

  /**
   * Get transaction risk score
   * 
   * @param transaction Transaction hash for which risk should be returned (optional)
   * @param chain Blockchain identifier (optional)
   * @return Call&lt;GetTransactionRiskScore200Response&gt;
   */
  @GET("v1/risk/transaction/score")
  Call<GetTransactionRiskScore200Response> getTransactionRiskScore(
    @retrofit2.http.Query("transaction") String transaction, @retrofit2.http.Query("chain") String chain
  );

  /**
   * Get transaction risk score case
   * 
   * @param caseId Case identifier (required)
   * @return Call&lt;TransactionRiskReport&gt;
   */
  @GET("v1/risk/transaction/score/details/{case_id}")
  Call<TransactionRiskReport> getTransactionRiskScoreCase(
    @retrofit2.http.Path("case_id") String caseId
  );

  /**
   * Get transaction risk score details
   * 
   * @param transaction Transaction hash for which risk should be returned (optional)
   * @param chain Blockchain identifier (optional)
   * @return Call&lt;TransactionRiskReport&gt;
   */
  @GET("v1/risk/transaction/score/details")
  Call<TransactionRiskReport> getTransactionRiskScoreDetails(
    @retrofit2.http.Query("transaction") String transaction, @retrofit2.http.Query("chain") String chain
  );

}
