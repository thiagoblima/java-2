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
import io.kubernetes.client.models.V1EventSeries;
import io.kubernetes.client.models.V1EventSource;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Event is a report of an event somewhere in the cluster.
 */
@ApiModel(description = "Event is a report of an event somewhere in the cluster.")

public class V1Event {
  @SerializedName("action")
  private String action = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("eventTime")
  private DateTime eventTime = null;

  @SerializedName("firstTimestamp")
  private DateTime firstTimestamp = null;

  @SerializedName("involvedObject")
  private V1ObjectReference involvedObject = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("lastTimestamp")
  private DateTime lastTimestamp = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("related")
  private V1ObjectReference related = null;

  @SerializedName("reportingComponent")
  private String reportingComponent = null;

  @SerializedName("reportingInstance")
  private String reportingInstance = null;

  @SerializedName("series")
  private V1EventSeries series = null;

  @SerializedName("source")
  private V1EventSource source = null;

  @SerializedName("type")
  private String type = null;

  public V1Event action(String action) {
    this.action = action;
    return this;
  }

   /**
   * What action was taken/failed regarding to the Regarding object.
   * @return action
  **/
  @ApiModelProperty(value = "What action was taken/failed regarding to the Regarding object.")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public V1Event apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1Event count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of times this event has occurred.
   * @return count
  **/
  @ApiModelProperty(value = "The number of times this event has occurred.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public V1Event eventTime(DateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time when this Event was first observed.
   * @return eventTime
  **/
  @ApiModelProperty(value = "Time when this Event was first observed.")
  public DateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(DateTime eventTime) {
    this.eventTime = eventTime;
  }

  public V1Event firstTimestamp(DateTime firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
    return this;
  }

   /**
   * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
   * @return firstTimestamp
  **/
  @ApiModelProperty(value = "The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)")
  public DateTime getFirstTimestamp() {
    return firstTimestamp;
  }

  public void setFirstTimestamp(DateTime firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
  }

  public V1Event involvedObject(V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
    return this;
  }

   /**
   * The object that this event is about.
   * @return involvedObject
  **/
  @ApiModelProperty(required = true, value = "The object that this event is about.")
  public V1ObjectReference getInvolvedObject() {
    return involvedObject;
  }

  public void setInvolvedObject(V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
  }

  public V1Event kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1Event lastTimestamp(DateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

   /**
   * The time at which the most recent occurrence of this event was recorded.
   * @return lastTimestamp
  **/
  @ApiModelProperty(value = "The time at which the most recent occurrence of this event was recorded.")
  public DateTime getLastTimestamp() {
    return lastTimestamp;
  }

  public void setLastTimestamp(DateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }

  public V1Event message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human-readable description of the status of this operation.
   * @return message
  **/
  @ApiModelProperty(value = "A human-readable description of the status of this operation.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1Event metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1Event reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
   * @return reason
  **/
  @ApiModelProperty(value = "This should be a short, machine understandable string that gives the reason for the transition into the object's current status.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1Event related(V1ObjectReference related) {
    this.related = related;
    return this;
  }

   /**
   * Optional secondary object for more complex actions.
   * @return related
  **/
  @ApiModelProperty(value = "Optional secondary object for more complex actions.")
  public V1ObjectReference getRelated() {
    return related;
  }

  public void setRelated(V1ObjectReference related) {
    this.related = related;
  }

  public V1Event reportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
    return this;
  }

   /**
   * Name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;.
   * @return reportingComponent
  **/
  @ApiModelProperty(value = "Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.")
  public String getReportingComponent() {
    return reportingComponent;
  }

  public void setReportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
  }

  public V1Event reportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

   /**
   * ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;.
   * @return reportingInstance
  **/
  @ApiModelProperty(value = "ID of the controller instance, e.g. `kubelet-xyzf`.")
  public String getReportingInstance() {
    return reportingInstance;
  }

  public void setReportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }

  public V1Event series(V1EventSeries series) {
    this.series = series;
    return this;
  }

   /**
   * Data about the Event series this event represents or nil if it&#39;s a singleton Event.
   * @return series
  **/
  @ApiModelProperty(value = "Data about the Event series this event represents or nil if it's a singleton Event.")
  public V1EventSeries getSeries() {
    return series;
  }

  public void setSeries(V1EventSeries series) {
    this.series = series;
  }

  public V1Event source(V1EventSource source) {
    this.source = source;
    return this;
  }

   /**
   * The component reporting this event. Should be a short machine understandable string.
   * @return source
  **/
  @ApiModelProperty(value = "The component reporting this event. Should be a short machine understandable string.")
  public V1EventSource getSource() {
    return source;
  }

  public void setSource(V1EventSource source) {
    this.source = source;
  }

  public V1Event type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of this event (Normal, Warning), new types could be added in the future
   * @return type
  **/
  @ApiModelProperty(value = "Type of this event (Normal, Warning), new types could be added in the future")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Event v1Event = (V1Event) o;
    return Objects.equals(this.action, v1Event.action) &&
        Objects.equals(this.apiVersion, v1Event.apiVersion) &&
        Objects.equals(this.count, v1Event.count) &&
        Objects.equals(this.eventTime, v1Event.eventTime) &&
        Objects.equals(this.firstTimestamp, v1Event.firstTimestamp) &&
        Objects.equals(this.involvedObject, v1Event.involvedObject) &&
        Objects.equals(this.kind, v1Event.kind) &&
        Objects.equals(this.lastTimestamp, v1Event.lastTimestamp) &&
        Objects.equals(this.message, v1Event.message) &&
        Objects.equals(this.metadata, v1Event.metadata) &&
        Objects.equals(this.reason, v1Event.reason) &&
        Objects.equals(this.related, v1Event.related) &&
        Objects.equals(this.reportingComponent, v1Event.reportingComponent) &&
        Objects.equals(this.reportingInstance, v1Event.reportingInstance) &&
        Objects.equals(this.series, v1Event.series) &&
        Objects.equals(this.source, v1Event.source) &&
        Objects.equals(this.type, v1Event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, apiVersion, count, eventTime, firstTimestamp, involvedObject, kind, lastTimestamp, message, metadata, reason, related, reportingComponent, reportingInstance, series, source, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Event {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
    sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingComponent: ").append(toIndentedString(reportingComponent)).append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

