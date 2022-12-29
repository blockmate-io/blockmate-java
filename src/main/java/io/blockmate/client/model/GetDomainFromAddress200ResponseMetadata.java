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
import io.blockmate.client.model.GetDomainFromAddress200ResponseMetadataAttributesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetDomainFromAddress200ResponseMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDomainFromAddress200ResponseMetadata {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<GetDomainFromAddress200ResponseMetadataAttributesInner> attributes = null;

  public static final String SERIALIZED_NAME_BACKGROUND_IMAGE = "background_image";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_IMAGE)
  private String backgroundImage;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_IS_NORMALIZED = "is_normalized";
  @SerializedName(SERIALIZED_NAME_IS_NORMALIZED)
  private Boolean isNormalized;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_LENGTH = "name_length";
  @SerializedName(SERIALIZED_NAME_NAME_LENGTH)
  private Integer nameLength;

  public static final String SERIALIZED_NAME_SEGMENT_LENGTH = "segment_length";
  @SerializedName(SERIALIZED_NAME_SEGMENT_LENGTH)
  private Integer segmentLength;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public GetDomainFromAddress200ResponseMetadata() {
  }

  public GetDomainFromAddress200ResponseMetadata attributes(List<GetDomainFromAddress200ResponseMetadataAttributesInner> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public GetDomainFromAddress200ResponseMetadata addAttributesItem(GetDomainFromAddress200ResponseMetadataAttributesInner attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetDomainFromAddress200ResponseMetadataAttributesInner> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<GetDomainFromAddress200ResponseMetadataAttributesInner> attributes) {
    this.attributes = attributes;
  }


  public GetDomainFromAddress200ResponseMetadata backgroundImage(String backgroundImage) {
    
    this.backgroundImage = backgroundImage;
    return this;
  }

   /**
   * Get backgroundImage
   * @return backgroundImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://metadata.ens.domains/mainnet/avatar/alice.eth", value = "")

  public String getBackgroundImage() {
    return backgroundImage;
  }


  public void setBackgroundImage(String backgroundImage) {
    this.backgroundImage = backgroundImage;
  }


  public GetDomainFromAddress200ResponseMetadata description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alice.eth, an ENS name.", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetDomainFromAddress200ResponseMetadata image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://metadata.ens.domains/mainnet/0x57f1887a8BF19b14fC0dF6Fd9B2acc9Af147eA85/0x9c0257114eb9399a2985f8e75dad7600c5d89fe3824ffa99ec1c3eb8bf3b0501/image", value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public GetDomainFromAddress200ResponseMetadata imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://metadata.ens.domains/mainnet/0x57f1887a8BF19b14fC0dF6Fd9B2acc9Af147eA85/0x9c0257114eb9399a2985f8e75dad7600c5d89fe3824ffa99ec1c3eb8bf3b0501/image", value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public GetDomainFromAddress200ResponseMetadata isNormalized(Boolean isNormalized) {
    
    this.isNormalized = isNormalized;
    return this;
  }

   /**
   * Get isNormalized
   * @return isNormalized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsNormalized() {
    return isNormalized;
  }


  public void setIsNormalized(Boolean isNormalized) {
    this.isNormalized = isNormalized;
  }


  public GetDomainFromAddress200ResponseMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alice.eth", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetDomainFromAddress200ResponseMetadata nameLength(Integer nameLength) {
    
    this.nameLength = nameLength;
    return this;
  }

   /**
   * Get nameLength
   * @return nameLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getNameLength() {
    return nameLength;
  }


  public void setNameLength(Integer nameLength) {
    this.nameLength = nameLength;
  }


  public GetDomainFromAddress200ResponseMetadata segmentLength(Integer segmentLength) {
    
    this.segmentLength = segmentLength;
    return this;
  }

   /**
   * Get segmentLength
   * @return segmentLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getSegmentLength() {
    return segmentLength;
  }


  public void setSegmentLength(Integer segmentLength) {
    this.segmentLength = segmentLength;
  }


  public GetDomainFromAddress200ResponseMetadata url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://app.ens.domains/name/alice.eth", value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public GetDomainFromAddress200ResponseMetadata version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDomainFromAddress200ResponseMetadata getDomainFromAddress200ResponseMetadata = (GetDomainFromAddress200ResponseMetadata) o;
    return Objects.equals(this.attributes, getDomainFromAddress200ResponseMetadata.attributes) &&
        Objects.equals(this.backgroundImage, getDomainFromAddress200ResponseMetadata.backgroundImage) &&
        Objects.equals(this.description, getDomainFromAddress200ResponseMetadata.description) &&
        Objects.equals(this.image, getDomainFromAddress200ResponseMetadata.image) &&
        Objects.equals(this.imageUrl, getDomainFromAddress200ResponseMetadata.imageUrl) &&
        Objects.equals(this.isNormalized, getDomainFromAddress200ResponseMetadata.isNormalized) &&
        Objects.equals(this.name, getDomainFromAddress200ResponseMetadata.name) &&
        Objects.equals(this.nameLength, getDomainFromAddress200ResponseMetadata.nameLength) &&
        Objects.equals(this.segmentLength, getDomainFromAddress200ResponseMetadata.segmentLength) &&
        Objects.equals(this.url, getDomainFromAddress200ResponseMetadata.url) &&
        Objects.equals(this.version, getDomainFromAddress200ResponseMetadata.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, backgroundImage, description, image, imageUrl, isNormalized, name, nameLength, segmentLength, url, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDomainFromAddress200ResponseMetadata {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    isNormalized: ").append(toIndentedString(isNormalized)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameLength: ").append(toIndentedString(nameLength)).append("\n");
    sb.append("    segmentLength: ").append(toIndentedString(segmentLength)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

