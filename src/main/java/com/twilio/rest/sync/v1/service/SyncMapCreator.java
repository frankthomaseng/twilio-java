/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.sync.v1.service;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class SyncMapCreator extends Creator<SyncMap> {
    private final String pathServiceSid;
    private String uniqueName;

    /**
     * Construct a new SyncMapCreator.
     * 
     * @param pathServiceSid The service_sid
     */
    public SyncMapCreator(final String pathServiceSid) {
        this.pathServiceSid = pathServiceSid;
    }

    /**
     * The unique_name.
     * 
     * @param uniqueName The unique_name
     * @return this
     */
    public SyncMapCreator setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Created SyncMap
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public SyncMap create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.SYNC.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Maps",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("SyncMap creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }

            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }

        return SyncMap.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
        }
    }
}