/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod&#39;s hosts file.
 */
@ApiModel(description = "HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.")

public class V1HostAlias {
  @SerializedName("hostnames")
  private List<String> hostnames = null;

  @SerializedName("ip")
  private String ip = null;

  public V1HostAlias hostnames(List<String> hostnames) {
    this.hostnames = hostnames;
    return this;
  }

  public V1HostAlias addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<String>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Hostnames for the above IP address.
   * @return hostnames
  **/
  @ApiModelProperty(value = "Hostnames for the above IP address.")
  public List<String> getHostnames() {
    return hostnames;
  }

  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }

  public V1HostAlias ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IP address of the host file entry.
   * @return ip
  **/
  @ApiModelProperty(value = "IP address of the host file entry.")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostAlias v1HostAlias = (V1HostAlias) o;
    return Objects.equals(this.hostnames, v1HostAlias.hostnames) &&
        Objects.equals(this.ip, v1HostAlias.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostnames, ip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostAlias {\n");
    
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

}

