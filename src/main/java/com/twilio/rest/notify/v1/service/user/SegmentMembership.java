/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.notify.v1.service.user;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SegmentMembership extends Resource {
    private static final long serialVersionUID = 241012819747560L;

    /**
     * Create a SegmentMembershipCreator to execute create.
     * 
     * @param pathServiceSid The service_sid
     * @param pathIdentity The identity
     * @param segment The segment
     * @return SegmentMembershipCreator capable of executing the create
     */
    public static SegmentMembershipCreator creator(final String pathServiceSid, 
                                                   final String pathIdentity, 
                                                   final String segment) {
        return new SegmentMembershipCreator(pathServiceSid, pathIdentity, segment);
    }

    /**
     * Create a SegmentMembershipDeleter to execute delete.
     * 
     * @param pathServiceSid The service_sid
     * @param pathIdentity The identity
     * @param pathSegment The segment
     * @return SegmentMembershipDeleter capable of executing the delete
     */
    public static SegmentMembershipDeleter deleter(final String pathServiceSid, 
                                                   final String pathIdentity, 
                                                   final String pathSegment) {
        return new SegmentMembershipDeleter(pathServiceSid, pathIdentity, pathSegment);
    }

    /**
     * Create a SegmentMembershipFetcher to execute fetch.
     * 
     * @param pathServiceSid The service_sid
     * @param pathIdentity The identity
     * @param pathSegment The segment
     * @return SegmentMembershipFetcher capable of executing the fetch
     */
    public static SegmentMembershipFetcher fetcher(final String pathServiceSid, 
                                                   final String pathIdentity, 
                                                   final String pathSegment) {
        return new SegmentMembershipFetcher(pathServiceSid, pathIdentity, pathSegment);
    }

    /**
     * Converts a JSON String into a SegmentMembership object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return SegmentMembership object represented by the provided JSON
     */
    public static SegmentMembership fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SegmentMembership.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a SegmentMembership object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return SegmentMembership object represented by the provided JSON
     */
    public static SegmentMembership fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SegmentMembership.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String serviceSid;
    private final String identity;
    private final String segment;
    private final URI url;

    @JsonCreator
    private SegmentMembership(@JsonProperty("account_sid")
                              final String accountSid, 
                              @JsonProperty("service_sid")
                              final String serviceSid, 
                              @JsonProperty("identity")
                              final String identity, 
                              @JsonProperty("segment")
                              final String segment, 
                              @JsonProperty("url")
                              final URI url) {
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.identity = identity;
        this.segment = segment;
        this.url = url;
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
     * Returns The The identity.
     * 
     * @return The identity
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns The The segment.
     * 
     * @return The segment
     */
    public final String getSegment() {
        return this.segment;
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

        SegmentMembership other = (SegmentMembership) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(identity, other.identity) && 
               Objects.equals(segment, other.segment) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            serviceSid,
                            identity,
                            segment,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("serviceSid", serviceSid)
                          .add("identity", identity)
                          .add("segment", segment)
                          .add("url", url)
                          .toString();
    }
}