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
import java.math.BigDecimal;

/**
 * ExchangeRate
 */
@ApiModel(description = "ExchangeRate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-12T18:04:32.906834+02:00[Europe/Vienna]")
public class ExchangeRate {
  public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
  private String currencyPair;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public ExchangeRate() {
  }

  public ExchangeRate currencyPair(String currencyPair) {
    
    this.currencyPair = currencyPair;
    return this;
  }

   /**
   * Get currencyPair
   * @return currencyPair
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ETH/USD", required = true, value = "")

  public String getCurrencyPair() {
    return currencyPair;
  }


  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }


  public ExchangeRate date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-06-30", required = true, value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public ExchangeRate rate(Double rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1053.9613", required = true, value = "")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRate exchangeRate = (ExchangeRate) o;
    return Objects.equals(this.currencyPair, exchangeRate.currencyPair) &&
        Objects.equals(this.date, exchangeRate.date) &&
        Objects.equals(this.rate, exchangeRate.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyPair, date, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRate {\n");
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
