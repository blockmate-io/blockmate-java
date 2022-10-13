/*
 * Blockmate
 * Blockmate API OpenAPI documentation
 *
 * The version of the OpenAPI document: 0.0.1
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BalanceResponseAccountsInnerState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-13T07:52:13.151942+02:00[Europe/Vienna]")
public class BalanceResponseAccountsInnerState {
  public static final String SERIALIZED_NAME_LAST_SYNC = "last_sync";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC)
  private String lastSync;

  public BalanceResponseAccountsInnerState() {
  }

  public BalanceResponseAccountsInnerState lastSync(String lastSync) {
    
    this.lastSync = lastSync;
    return this;
  }

   /**
   * null if initial sync was not yet done
   * @return lastSync
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-07-21T09:21:37.384496+00:00", value = "null if initial sync was not yet done")

  public String getLastSync() {
    return lastSync;
  }


  public void setLastSync(String lastSync) {
    this.lastSync = lastSync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceResponseAccountsInnerState balanceResponseAccountsInnerState = (BalanceResponseAccountsInnerState) o;
    return Objects.equals(this.lastSync, balanceResponseAccountsInnerState.lastSync);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSync);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceResponseAccountsInnerState {\n");
    sb.append("    lastSync: ").append(toIndentedString(lastSync)).append("\n");
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

