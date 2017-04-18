/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.chat.v2.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
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
public class Role extends Resource {
    private static final long serialVersionUID = 136946012216407L;

    public enum RoleType {
        CHANNEL("channel"),
        DEPLOYMENT("deployment");

        private final String value;

        private RoleType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a RoleType from a string.
         * @param value string value
         * @return generated RoleType
         */
        @JsonCreator
        public static RoleType forValue(final String value) {
            return Promoter.enumFromString(value, RoleType.values());
        }
    }

    /**
     * Create a RoleFetcher to execute fetch.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSid The sid
     * @return RoleFetcher capable of executing the fetch
     */
    public static RoleFetcher fetcher(final String pathServiceSid, 
                                      final String pathSid) {
        return new RoleFetcher(pathServiceSid, pathSid);
    }

    /**
     * Create a RoleDeleter to execute delete.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSid The sid
     * @return RoleDeleter capable of executing the delete
     */
    public static RoleDeleter deleter(final String pathServiceSid, 
                                      final String pathSid) {
        return new RoleDeleter(pathServiceSid, pathSid);
    }

    /**
     * Create a RoleCreator to execute create.
     * 
     * @param pathServiceSid The service_sid
     * @param friendlyName The friendly_name
     * @param type The type
     * @param permission The permission
     * @return RoleCreator capable of executing the create
     */
    public static RoleCreator creator(final String pathServiceSid, 
                                      final String friendlyName, 
                                      final Role.RoleType type, 
                                      final List<String> permission) {
        return new RoleCreator(pathServiceSid, friendlyName, type, permission);
    }

    /**
     * Create a RoleReader to execute read.
     * 
     * @param pathServiceSid The service_sid
     * @return RoleReader capable of executing the read
     */
    public static RoleReader reader(final String pathServiceSid) {
        return new RoleReader(pathServiceSid);
    }

    /**
     * Create a RoleUpdater to execute update.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSid The sid
     * @param permission The permission
     * @return RoleUpdater capable of executing the update
     */
    public static RoleUpdater updater(final String pathServiceSid, 
                                      final String pathSid, 
                                      final List<String> permission) {
        return new RoleUpdater(pathServiceSid, pathSid, permission);
    }

    /**
     * Converts a JSON String into a Role object using the provided ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Role object represented by the provided JSON
     */
    public static Role fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Role.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Role object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Role object represented by the provided JSON
     */
    public static Role fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Role.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final String friendlyName;
    private final Role.RoleType type;
    private final List<String> permissions;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private Role(@JsonProperty("sid")
                 final String sid, 
                 @JsonProperty("account_sid")
                 final String accountSid, 
                 @JsonProperty("service_sid")
                 final String serviceSid, 
                 @JsonProperty("friendly_name")
                 final String friendlyName, 
                 @JsonProperty("type")
                 final Role.RoleType type, 
                 @JsonProperty("permissions")
                 final List<String> permissions, 
                 @JsonProperty("date_created")
                 final String dateCreated, 
                 @JsonProperty("date_updated")
                 final String dateUpdated, 
                 @JsonProperty("url")
                 final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.friendlyName = friendlyName;
        this.type = type;
        this.permissions = permissions;
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
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The service_sid.
     * 
     * @return The service_sid
     */
    public final String getServiceSid() {
        return this.serviceSid;
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
     * Returns The The type.
     * 
     * @return The type
     */
    public final Role.RoleType getType() {
        return this.type;
    }

    /**
     * Returns The The permissions.
     * 
     * @return The permissions
     */
    public final List<String> getPermissions() {
        return this.permissions;
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

        Role other = (Role) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(type, other.type) && 
               Objects.equals(permissions, other.permissions) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            serviceSid,
                            friendlyName,
                            type,
                            permissions,
                            dateCreated,
                            dateUpdated,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("serviceSid", serviceSid)
                          .add("friendlyName", friendlyName)
                          .add("type", type)
                          .add("permissions", permissions)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .toString();
    }
}