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

/**
 * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
 */
@ApiModel(description = "Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.")

public class V1alpha1Subject {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  public V1alpha1Subject apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion holds the API group and version of the referenced subject. Defaults to \&quot;v1\&quot; for ServiceAccount subjects. Defaults to \&quot;rbac.authorization.k8s.io/v1alpha1\&quot; for User and Group subjects.
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion holds the API group and version of the referenced subject. Defaults to \"v1\" for ServiceAccount subjects. Defaults to \"rbac.authorization.k8s.io/v1alpha1\" for User and Group subjects.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1alpha1Subject kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind of object being referenced. Values defined by this API group are \&quot;User\&quot;, \&quot;Group\&quot;, and \&quot;ServiceAccount\&quot;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind of object being referenced. Values defined by this API group are \"User\", \"Group\", and \"ServiceAccount\". If the Authorizer does not recognized the kind value, the Authorizer should report an error.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1alpha1Subject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object being referenced.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object being referenced.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1alpha1Subject namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of the referenced object.  If the object kind is non-namespace, such as \&quot;User\&quot; or \&quot;Group\&quot;, and this value is not empty the Authorizer should report an error.
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace of the referenced object.  If the object kind is non-namespace, such as \"User\" or \"Group\", and this value is not empty the Authorizer should report an error.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Subject v1alpha1Subject = (V1alpha1Subject) o;
    return Objects.equals(this.apiVersion, v1alpha1Subject.apiVersion) &&
        Objects.equals(this.kind, v1alpha1Subject.kind) &&
        Objects.equals(this.name, v1alpha1Subject.name) &&
        Objects.equals(this.namespace, v1alpha1Subject.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Subject {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

