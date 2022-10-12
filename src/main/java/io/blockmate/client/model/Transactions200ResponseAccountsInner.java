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
import io.blockmate.client.model.BalanceResponseAccountsInnerState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Transactions200ResponseAccountsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-12T18:04:32.906834+02:00[Europe/Vienna]")
public class Transactions200ResponseAccountsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    WALLET("crypto_wallet"),
    
    EXCHANGE("crypto_exchange"),
    
    NFT("crypto_nft");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private BalanceResponseAccountsInnerState state;

  public Transactions200ResponseAccountsInner() {
  }

  public Transactions200ResponseAccountsInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0940bb4a-0940-11ed-9ed1-00155d5116f0", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Transactions200ResponseAccountsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My account", required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Transactions200ResponseAccountsInner verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public Transactions200ResponseAccountsInner type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "crypto_wallet", required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Transactions200ResponseAccountsInner state(BalanceResponseAccountsInnerState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BalanceResponseAccountsInnerState getState() {
    return state;
  }


  public void setState(BalanceResponseAccountsInnerState state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transactions200ResponseAccountsInner transactions200ResponseAccountsInner = (Transactions200ResponseAccountsInner) o;
    return Objects.equals(this.id, transactions200ResponseAccountsInner.id) &&
        Objects.equals(this.description, transactions200ResponseAccountsInner.description) &&
        Objects.equals(this.verified, transactions200ResponseAccountsInner.verified) &&
        Objects.equals(this.type, transactions200ResponseAccountsInner.type) &&
        Objects.equals(this.state, transactions200ResponseAccountsInner.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, verified, type, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transactions200ResponseAccountsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
