/*
 * DeepBox
 * DeepBox API Documentation
 *
 * OpenAPI spec version: 1.0
 * Contact: info@deepcloud.swiss
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.deepbox.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.deepbox.io.swagger.client.model.Event;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
/**
 * WebhookInfo
 */



public class WebhookInfo {
  @JsonProperty("webhookId")
  private UUID webhookId = null;

  @JsonProperty("timestamp")
  private DateTime timestamp = null;

  @JsonProperty("events")
  private List<Event> events = null;

  public WebhookInfo webhookId(UUID webhookId) {
    this.webhookId = webhookId;
    return this;
  }

   /**
   * Get webhookId
   * @return webhookId
  **/
  @Schema(description = "")
  public UUID getWebhookId() {
    return webhookId;
  }

  public void setWebhookId(UUID webhookId) {
    this.webhookId = webhookId;
  }

  public WebhookInfo timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(description = "")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public WebhookInfo events(List<Event> events) {
    this.events = events;
    return this;
  }

  public WebhookInfo addEventsItem(Event eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @Schema(description = "")
  public List<Event> getEvents() {
    return events;
  }

  public void setEvents(List<Event> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookInfo webhookInfo = (WebhookInfo) o;
    return Objects.equals(this.webhookId, webhookInfo.webhookId) &&
        Objects.equals(this.timestamp, webhookInfo.timestamp) &&
        Objects.equals(this.events, webhookInfo.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookId, timestamp, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookInfo {\n");
    
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
