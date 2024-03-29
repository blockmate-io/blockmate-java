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
import io.blockmate.client.model.RiskReportCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionRiskReportDetailsValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionRiskReportDetailsValue {
  public static final String SERIALIZED_NAME_OWN_CATEGORIES = "own_categories";
  @SerializedName(SERIALIZED_NAME_OWN_CATEGORIES)
  private List<RiskReportCategory> ownCategories = null;

  public static final String SERIALIZED_NAME_SOURCE_OF_FUNDS_CATEGORIES = "source_of_funds_categories";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_FUNDS_CATEGORIES)
  private List<RiskReportCategory> sourceOfFundsCategories = null;

  public TransactionRiskReportDetailsValue() {
  }

  public TransactionRiskReportDetailsValue ownCategories(List<RiskReportCategory> ownCategories) {
    
    this.ownCategories = ownCategories;
    return this;
  }

  public TransactionRiskReportDetailsValue addOwnCategoriesItem(RiskReportCategory ownCategoriesItem) {
    if (this.ownCategories == null) {
      this.ownCategories = new ArrayList<>();
    }
    this.ownCategories.add(ownCategoriesItem);
    return this;
  }

   /**
   * Get ownCategories
   * @return ownCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RiskReportCategory> getOwnCategories() {
    return ownCategories;
  }


  public void setOwnCategories(List<RiskReportCategory> ownCategories) {
    this.ownCategories = ownCategories;
  }


  public TransactionRiskReportDetailsValue sourceOfFundsCategories(List<RiskReportCategory> sourceOfFundsCategories) {
    
    this.sourceOfFundsCategories = sourceOfFundsCategories;
    return this;
  }

  public TransactionRiskReportDetailsValue addSourceOfFundsCategoriesItem(RiskReportCategory sourceOfFundsCategoriesItem) {
    if (this.sourceOfFundsCategories == null) {
      this.sourceOfFundsCategories = new ArrayList<>();
    }
    this.sourceOfFundsCategories.add(sourceOfFundsCategoriesItem);
    return this;
  }

   /**
   * Get sourceOfFundsCategories
   * @return sourceOfFundsCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RiskReportCategory> getSourceOfFundsCategories() {
    return sourceOfFundsCategories;
  }


  public void setSourceOfFundsCategories(List<RiskReportCategory> sourceOfFundsCategories) {
    this.sourceOfFundsCategories = sourceOfFundsCategories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRiskReportDetailsValue transactionRiskReportDetailsValue = (TransactionRiskReportDetailsValue) o;
    return Objects.equals(this.ownCategories, transactionRiskReportDetailsValue.ownCategories) &&
        Objects.equals(this.sourceOfFundsCategories, transactionRiskReportDetailsValue.sourceOfFundsCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownCategories, sourceOfFundsCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRiskReportDetailsValue {\n");
    sb.append("    ownCategories: ").append(toIndentedString(ownCategories)).append("\n");
    sb.append("    sourceOfFundsCategories: ").append(toIndentedString(sourceOfFundsCategories)).append("\n");
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

