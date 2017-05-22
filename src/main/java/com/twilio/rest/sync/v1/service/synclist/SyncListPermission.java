/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.sync.v1.service.synclist;

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
public class SyncListPermission extends Resource {
    private static final long serialVersionUID = 53631144313647L;

    /**
     * Create a SyncListPermissionFetcher to execute fetch.
     * 
     * @param pathServiceSid The service_sid
     * @param pathListSid Sync List SID or unique name.
     * @param pathIdentity Identity of the user to whom the Sync List Permission
     *                     applies.
     * @return SyncListPermissionFetcher capable of executing the fetch
     */
    public static SyncListPermissionFetcher fetcher(final String pathServiceSid, 
                                                    final String pathListSid, 
                                                    final String pathIdentity) {
        return new SyncListPermissionFetcher(pathServiceSid, pathListSid, pathIdentity);
    }

    /**
     * Create a SyncListPermissionDeleter to execute delete.
     * 
     * @param pathServiceSid The service_sid
     * @param pathListSid Sync List SID or unique name.
     * @param pathIdentity Identity of the user to whom the Sync List Permission
     *                     applies.
     * @return SyncListPermissionDeleter capable of executing the delete
     */
    public static SyncListPermissionDeleter deleter(final String pathServiceSid, 
                                                    final String pathListSid, 
                                                    final String pathIdentity) {
        return new SyncListPermissionDeleter(pathServiceSid, pathListSid, pathIdentity);
    }

    /**
     * Create a SyncListPermissionReader to execute read.
     * 
     * @param pathServiceSid The service_sid
     * @param pathListSid Sync List SID or unique name.
     * @return SyncListPermissionReader capable of executing the read
     */
    public static SyncListPermissionReader reader(final String pathServiceSid, 
                                                  final String pathListSid) {
        return new SyncListPermissionReader(pathServiceSid, pathListSid);
    }

    /**
     * Create a SyncListPermissionUpdater to execute update.
     * 
     * @param pathServiceSid Sync Service Instance SID.
     * @param pathListSid Sync List SID or unique name.
     * @param pathIdentity Identity of the user to whom the Sync List Permission
     *                     applies.
     * @param read Read access.
     * @param write Write access.
     * @param manage Manage access.
     * @return SyncListPermissionUpdater capable of executing the update
     */
    public static SyncListPermissionUpdater updater(final String pathServiceSid, 
                                                    final String pathListSid, 
                                                    final String pathIdentity, 
                                                    final Boolean read, 
                                                    final Boolean write, 
                                                    final Boolean manage) {
        return new SyncListPermissionUpdater(pathServiceSid, pathListSid, pathIdentity, read, write, manage);
    }

    /**
     * Converts a JSON String into a SyncListPermission object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return SyncListPermission object represented by the provided JSON
     */
    public static SyncListPermission fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncListPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a SyncListPermission object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return SyncListPermission object represented by the provided JSON
     */
    public static SyncListPermission fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncListPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String serviceSid;
    private final String listSid;
    private final String identity;
    private final Boolean read;
    private final Boolean write;
    private final Boolean manage;
    private final URI url;

    @JsonCreator
    private SyncListPermission(@JsonProperty("account_sid")
                               final String accountSid, 
                               @JsonProperty("service_sid")
                               final String serviceSid, 
                               @JsonProperty("list_sid")
                               final String listSid, 
                               @JsonProperty("identity")
                               final String identity, 
                               @JsonProperty("read")
                               final Boolean read, 
                               @JsonProperty("write")
                               final Boolean write, 
                               @JsonProperty("manage")
                               final Boolean manage, 
                               @JsonProperty("url")
                               final URI url) {
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.listSid = listSid;
        this.identity = identity;
        this.read = read;
        this.write = write;
        this.manage = manage;
        this.url = url;
    }

    /**
     * Returns The Twilio Account SID..
     * 
     * @return Twilio Account SID.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The Sync Service Instance SID..
     * 
     * @return Sync Service Instance SID.
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The Sync List SID..
     * 
     * @return Sync List SID.
     */
    public final String getListSid() {
        return this.listSid;
    }

    /**
     * Returns The Identity of the user to whom the Sync List Permission applies..
     * 
     * @return Identity of the user to whom the Sync List Permission applies.
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns The Read access..
     * 
     * @return Read access.
     */
    public final Boolean getRead() {
        return this.read;
    }

    /**
     * Returns The Write access..
     * 
     * @return Write access.
     */
    public final Boolean getWrite() {
        return this.write;
    }

    /**
     * Returns The Manage access..
     * 
     * @return Manage access.
     */
    public final Boolean getManage() {
        return this.manage;
    }

    /**
     * Returns The URL of this Sync List Permission..
     * 
     * @return URL of this Sync List Permission.
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

        SyncListPermission other = (SyncListPermission) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(listSid, other.listSid) && 
               Objects.equals(identity, other.identity) && 
               Objects.equals(read, other.read) && 
               Objects.equals(write, other.write) && 
               Objects.equals(manage, other.manage) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            serviceSid,
                            listSid,
                            identity,
                            read,
                            write,
                            manage,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("serviceSid", serviceSid)
                          .add("listSid", listSid)
                          .add("identity", identity)
                          .add("read", read)
                          .add("write", write)
                          .add("manage", manage)
                          .add("url", url)
                          .toString();
    }
}