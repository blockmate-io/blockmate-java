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
import io.blockmate.client.model.AddressRiskReportDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddressRiskReport
 */
@ApiModel(description = "AddressRiskReport")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddressRiskReport {
  public static final String SERIALIZED_NAME_CASE_ID = "case_id";
  @SerializedName(SERIALIZED_NAME_CASE_ID)
  private String caseId;

  public static final String SERIALIZED_NAME_REQUEST_DATETIME = "request_datetime";
  @SerializedName(SERIALIZED_NAME_REQUEST_DATETIME)
  private String requestDatetime;

  public static final String SERIALIZED_NAME_RESPONSE_DATETIME = "response_datetime";
  @SerializedName(SERIALIZED_NAME_RESPONSE_DATETIME)
  private String responseDatetime;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private String chain;

  public static final String SERIALIZED_NAME_RISK = "risk";
  @SerializedName(SERIALIZED_NAME_RISK)
  private Integer risk;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private AddressRiskReportDetails details;

  public AddressRiskReport() {
  }

  public AddressRiskReport caseId(String caseId) {
    
    this.caseId = caseId;
    return this;
  }

   /**
   * Get caseId
   * @return caseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7c656013-5e9b-4c71-8322-6562c5a9b34c", value = "")

  public String getCaseId() {
    return caseId;
  }


  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }


  public AddressRiskReport requestDatetime(String requestDatetime) {
    
    this.requestDatetime = requestDatetime;
    return this;
  }

   /**
   * Get requestDatetime
   * @return requestDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-10-04T12:32:44Z", value = "")

  public String getRequestDatetime() {
    return requestDatetime;
  }


  public void setRequestDatetime(String requestDatetime) {
    this.requestDatetime = requestDatetime;
  }


  public AddressRiskReport responseDatetime(String responseDatetime) {
    
    this.responseDatetime = responseDatetime;
    return this;
  }

   /**
   * Get responseDatetime
   * @return responseDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-10-04T12:32:44Z", value = "")

  public String getResponseDatetime() {
    return responseDatetime;
  }


  public void setResponseDatetime(String responseDatetime) {
    this.responseDatetime = responseDatetime;
  }


  public AddressRiskReport address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xc50e6db1637423819edbccb20b15654338d65501", required = true, value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressRiskReport chain(String chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "eth", required = true, value = "")

  public String getChain() {
    return chain;
  }


  public void setChain(String chain) {
    this.chain = chain;
  }


  public AddressRiskReport risk(Integer risk) {
    
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * minimum: 0
   * maximum: 100
   * @return risk
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "85", required = true, value = "")

  public Integer getRisk() {
    return risk;
  }


  public void setRisk(Integer risk) {
    this.risk = risk;
  }


  public AddressRiskReport details(AddressRiskReportDetails details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddressRiskReportDetails getDetails() {
    return details;
  }


  public void setDetails(AddressRiskReportDetails details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressRiskReport addressRiskReport = (AddressRiskReport) o;
    return Objects.equals(this.caseId, addressRiskReport.caseId) &&
        Objects.equals(this.requestDatetime, addressRiskReport.requestDatetime) &&
        Objects.equals(this.responseDatetime, addressRiskReport.responseDatetime) &&
        Objects.equals(this.address, addressRiskReport.address) &&
        Objects.equals(this.chain, addressRiskReport.chain) &&
        Objects.equals(this.risk, addressRiskReport.risk) &&
        Objects.equals(this.details, addressRiskReport.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseId, requestDatetime, responseDatetime, address, chain, risk, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressRiskReport {\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    requestDatetime: ").append(toIndentedString(requestDatetime)).append("\n");
    sb.append("    responseDatetime: ").append(toIndentedString(responseDatetime)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

