package io.blockmate.client.request;

import io.blockmate.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.blockmate.client.model.Account;
import io.blockmate.client.model.AccountProvider;
import io.blockmate.client.model.AccountProviderHint;
import io.blockmate.client.model.Balance200Response;
import java.time.LocalDate;
import io.blockmate.client.model.Transactions200Response;
import io.blockmate.client.model.UserAPIAuthenticateProject400Response;
import io.blockmate.client.model.UserAPIAuthenticateProject401Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AggregatedInfoApi {
  /**
   * Get list of account providers hints
   * 
   * @return Call&lt;AccountProviderHint&gt;
   */
  @GET("v1/aggregate/account_provider_hints")
  Call<AccountProviderHint> accountProviderHintsList();
    

  /**
   * Get list of account providers
   * 
   * @return Call&lt;AccountProvider&gt;
   */
  @GET("v1/aggregate/account_providers")
  Call<AccountProvider> accountProvidersList();
    

  /**
   * List accounts
   * 
   * @return Call&lt;List&lt;Account&gt;&gt;
   */
  @GET("v1/aggregate/accounts")
  Call<List<Account>> accounts();
    

  /**
   * Get balance
   * 
   * @param currency Currency to convert to.  (optional)
   * @return Call&lt;Balance200Response&gt;
   */
  @GET("v1/aggregate/balance")
  Call<Balance200Response> balance(
    @retrofit2.http.Query("currency") String currency
  );

  /**
   * Get transactions
   * 
   * @param since Set time from which the transactions will be get. The parameter is passed as-is to backend services. The default value is 30 days before the actual date or 30 days before the date specified in \&quot;until\&quot; parameter.  (optional)
   * @param until Set time to which the transactions will be get. The parameter is passed as-is to backend services. The default value is the actual date.  (optional)
   * @param currency Currency to convert to.  (optional)
   * @param accountFilter Filter results to only provided account. When omitted, it returns all transactions from all accounts.  (optional)
   * @return Call&lt;Transactions200Response&gt;
   */
  @GET("v1/aggregate/transactions")
  Call<Transactions200Response> transactions(
    @retrofit2.http.Query("since") LocalDate since, @retrofit2.http.Query("until") LocalDate until, @retrofit2.http.Query("currency") String currency, @retrofit2.http.Query("account-filter") String accountFilter
  );

}
