/*
 * Blockmate
 * Blockmate API OpenAPI documentation
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.blockmate.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * AccountProviderHintFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountProviderHintFields extends HashMap<String, String> {
  public static final String SERIALIZED_NAME_API_KEY = "api_key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_API_SECRET = "api_secret";
  @SerializedName(SERIALIZED_NAME_API_SECRET)
  private String apiSecret;

  public static final String SERIALIZED_NAME_API_PASSPHRASE = "api_passphrase";
  @SerializedName(SERIALIZED_NAME_API_PASSPHRASE)
  private String apiPassphrase;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private String wallet;

  public AccountProviderHintFields() {

  }

  public AccountProviderHintFields apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "API Key", value = "")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public AccountProviderHintFields apiSecret(String apiSecret) {
    
    this.apiSecret = apiSecret;
    return this;
  }

   /**
   * Get apiSecret
   * @return apiSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "API Secret", value = "")

  public String getApiSecret() {
    return apiSecret;
  }


  public void setApiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
  }


  public AccountProviderHintFields apiPassphrase(String apiPassphrase) {
    
    this.apiPassphrase = apiPassphrase;
    return this;
  }

   /**
   * Get apiPassphrase
   * @return apiPassphrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "API Passphrase", value = "")

  public String getApiPassphrase() {
    return apiPassphrase;
  }


  public void setApiPassphrase(String apiPassphrase) {
    this.apiPassphrase = apiPassphrase;
  }


  public AccountProviderHintFields description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Account description", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AccountProviderHintFields wallet(String wallet) {
    
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Address", value = "")

  public String getWallet() {
    return wallet;
  }


  public void setWallet(String wallet) {
    this.wallet = wallet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountProviderHintFields accountProviderHintFields = (AccountProviderHintFields) o;
    return Objects.equals(this.apiKey, accountProviderHintFields.apiKey) &&
        Objects.equals(this.apiSecret, accountProviderHintFields.apiSecret) &&
        Objects.equals(this.apiPassphrase, accountProviderHintFields.apiPassphrase) &&
        Objects.equals(this.description, accountProviderHintFields.description) &&
        Objects.equals(this.wallet, accountProviderHintFields.wallet) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, apiSecret, apiPassphrase, description, wallet, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountProviderHintFields {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
    sb.append("    apiPassphrase: ").append(toIndentedString(apiPassphrase)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

