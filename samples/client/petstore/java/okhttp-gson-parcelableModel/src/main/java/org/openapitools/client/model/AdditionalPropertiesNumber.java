/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import java.util.HashMap;
import java.util.Map;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * AdditionalPropertiesNumber
 */

public class AdditionalPropertiesNumber extends HashMap<String, BigDecimal> implements Parcelable {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public AdditionalPropertiesNumber() {
    super();
  }
  public AdditionalPropertiesNumber name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesNumber additionalPropertiesNumber = (AdditionalPropertiesNumber) o;
    return Objects.equals(this.name, additionalPropertiesNumber.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesNumber {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public void writeToParcel(Parcel out, int flags) {
    super.writeToParcel(out, flags);
    out.writeValue(name);
  }

  AdditionalPropertiesNumber(Parcel in) {
    super(in);
    name = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<AdditionalPropertiesNumber> CREATOR = new Parcelable.Creator<AdditionalPropertiesNumber>() {
    public AdditionalPropertiesNumber createFromParcel(Parcel in) {
      return new AdditionalPropertiesNumber(in);
    }
    public AdditionalPropertiesNumber[] newArray(int size) {
      return new AdditionalPropertiesNumber[size];
    }
  };
}

