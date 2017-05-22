/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.wireless;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RatePlan extends Resource {
    private static final long serialVersionUID = 263617052418126L;

    /**
     * Create a RatePlanReader to execute read.
     * 
     * @return RatePlanReader capable of executing the read
     */
    public static RatePlanReader reader() {
        return new RatePlanReader();
    }

    /**
     * Create a RatePlanFetcher to execute fetch.
     * 
     * @param pathSid The sid
     * @return RatePlanFetcher capable of executing the fetch
     */
    public static RatePlanFetcher fetcher(final String pathSid) {
        return new RatePlanFetcher(pathSid);
    }

    /**
     * Create a RatePlanCreator to execute create.
     * 
     * @return RatePlanCreator capable of executing the create
     */
    public static RatePlanCreator creator() {
        return new RatePlanCreator();
    }

    /**
     * Create a RatePlanUpdater to execute update.
     * 
     * @param pathSid The sid
     * @return RatePlanUpdater capable of executing the update
     */
    public static RatePlanUpdater updater(final String pathSid) {
        return new RatePlanUpdater(pathSid);
    }

    /**
     * Create a RatePlanDeleter to execute delete.
     * 
     * @param pathSid The sid
     * @return RatePlanDeleter capable of executing the delete
     */
    public static RatePlanDeleter deleter(final String pathSid) {
        return new RatePlanDeleter(pathSid);
    }

    /**
     * Converts a JSON String into a RatePlan object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return RatePlan object represented by the provided JSON
     */
    public static RatePlan fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RatePlan.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a RatePlan object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return RatePlan object represented by the provided JSON
     */
    public static RatePlan fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RatePlan.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String uniqueName;
    private final String accountSid;
    private final String friendlyName;
    private final Boolean dataEnabled;
    private final String dataMetering;
    private final Integer dataLimit;
    private final Boolean messagingEnabled;
    private final Boolean voiceEnabled;
    private final Boolean nationalRoamingEnabled;
    private final List<String> internationalRoaming;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private RatePlan(@JsonProperty("sid")
                     final String sid, 
                     @JsonProperty("unique_name")
                     final String uniqueName, 
                     @JsonProperty("account_sid")
                     final String accountSid, 
                     @JsonProperty("friendly_name")
                     final String friendlyName, 
                     @JsonProperty("data_enabled")
                     final Boolean dataEnabled, 
                     @JsonProperty("data_metering")
                     final String dataMetering, 
                     @JsonProperty("data_limit")
                     final Integer dataLimit, 
                     @JsonProperty("messaging_enabled")
                     final Boolean messagingEnabled, 
                     @JsonProperty("voice_enabled")
                     final Boolean voiceEnabled, 
                     @JsonProperty("national_roaming_enabled")
                     final Boolean nationalRoamingEnabled, 
                     @JsonProperty("international_roaming")
                     final List<String> internationalRoaming, 
                     @JsonProperty("date_created")
                     final String dateCreated, 
                     @JsonProperty("date_updated")
                     final String dateUpdated, 
                     @JsonProperty("url")
                     final URI url) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.dataEnabled = dataEnabled;
        this.dataMetering = dataMetering;
        this.dataLimit = dataLimit;
        this.messagingEnabled = messagingEnabled;
        this.voiceEnabled = voiceEnabled;
        this.nationalRoamingEnabled = nationalRoamingEnabled;
        this.internationalRoaming = internationalRoaming;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

    /**
     * Returns The The sid.
     * 
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The unique_name.
     * 
     * @return The unique_name
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The friendly_name.
     * 
     * @return The friendly_name
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The The data_enabled.
     * 
     * @return The data_enabled
     */
    public final Boolean getDataEnabled() {
        return this.dataEnabled;
    }

    /**
     * Returns The The data_metering.
     * 
     * @return The data_metering
     */
    public final String getDataMetering() {
        return this.dataMetering;
    }

    /**
     * Returns The The data_limit.
     * 
     * @return The data_limit
     */
    public final Integer getDataLimit() {
        return this.dataLimit;
    }

    /**
     * Returns The The messaging_enabled.
     * 
     * @return The messaging_enabled
     */
    public final Boolean getMessagingEnabled() {
        return this.messagingEnabled;
    }

    /**
     * Returns The The voice_enabled.
     * 
     * @return The voice_enabled
     */
    public final Boolean getVoiceEnabled() {
        return this.voiceEnabled;
    }

    /**
     * Returns The The national_roaming_enabled.
     * 
     * @return The national_roaming_enabled
     */
    public final Boolean getNationalRoamingEnabled() {
        return this.nationalRoamingEnabled;
    }

    /**
     * Returns The The international_roaming.
     * 
     * @return The international_roaming
     */
    public final List<String> getInternationalRoaming() {
        return this.internationalRoaming;
    }

    /**
     * Returns The The date_created.
     * 
     * @return The date_created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date_updated.
     * 
     * @return The date_updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RatePlan other = (RatePlan) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(uniqueName, other.uniqueName) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(dataEnabled, other.dataEnabled) && 
               Objects.equals(dataMetering, other.dataMetering) && 
               Objects.equals(dataLimit, other.dataLimit) && 
               Objects.equals(messagingEnabled, other.messagingEnabled) && 
               Objects.equals(voiceEnabled, other.voiceEnabled) && 
               Objects.equals(nationalRoamingEnabled, other.nationalRoamingEnabled) && 
               Objects.equals(internationalRoaming, other.internationalRoaming) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            uniqueName,
                            accountSid,
                            friendlyName,
                            dataEnabled,
                            dataMetering,
                            dataLimit,
                            messagingEnabled,
                            voiceEnabled,
                            nationalRoamingEnabled,
                            internationalRoaming,
                            dateCreated,
                            dateUpdated,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("uniqueName", uniqueName)
                          .add("accountSid", accountSid)
                          .add("friendlyName", friendlyName)
                          .add("dataEnabled", dataEnabled)
                          .add("dataMetering", dataMetering)
                          .add("dataLimit", dataLimit)
                          .add("messagingEnabled", messagingEnabled)
                          .add("voiceEnabled", voiceEnabled)
                          .add("nationalRoamingEnabled", nationalRoamingEnabled)
                          .add("internationalRoaming", internationalRoaming)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .toString();
    }
}