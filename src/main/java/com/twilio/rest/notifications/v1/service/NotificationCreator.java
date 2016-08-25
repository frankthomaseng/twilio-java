/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.notifications.v1.service;

import com.twilio.base.Creator;
import com.twilio.converter.Converter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.util.List;
import java.util.Map;

public class NotificationCreator extends Creator<Notification> {
    private final String serviceSid;
    private List<String> identity;
    private List<String> tag;
    private String body;
    private Notification.Priority priority;
    private Integer ttl;
    private String title;
    private String sound;
    private String action;
    private String data;
    private String apn;
    private String gcm;
    private String sms;
    private Map<String, Object> facebookMessenger;

    /**
     * Construct a new NotificationCreator.
     * 
     * @param serviceSid The service_sid
     */
    public NotificationCreator(final String serviceSid) {
        this.serviceSid = serviceSid;
    }

    /**
     * The identity.
     * 
     * @param identity The identity
     * @return this
     */
    public NotificationCreator setIdentity(final List<String> identity) {
        this.identity = identity;
        return this;
    }

    /**
     * The identity.
     * 
     * @param identity The identity
     * @return this
     */
    public NotificationCreator setIdentity(final String identity) {
        return setIdentity(Promoter.listOfOne(identity));
    }

    /**
     * The tag.
     * 
     * @param tag The tag
     * @return this
     */
    public NotificationCreator setTag(final List<String> tag) {
        this.tag = tag;
        return this;
    }

    /**
     * The tag.
     * 
     * @param tag The tag
     * @return this
     */
    public NotificationCreator setTag(final String tag) {
        return setTag(Promoter.listOfOne(tag));
    }

    /**
     * The body.
     * 
     * @param body The body
     * @return this
     */
    public NotificationCreator setBody(final String body) {
        this.body = body;
        return this;
    }

    /**
     * The priority.
     * 
     * @param priority The priority
     * @return this
     */
    public NotificationCreator setPriority(final Notification.Priority priority) {
        this.priority = priority;
        return this;
    }

    /**
     * The ttl.
     * 
     * @param ttl The ttl
     * @return this
     */
    public NotificationCreator setTtl(final Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * The title.
     * 
     * @param title The title
     * @return this
     */
    public NotificationCreator setTitle(final String title) {
        this.title = title;
        return this;
    }

    /**
     * The sound.
     * 
     * @param sound The sound
     * @return this
     */
    public NotificationCreator setSound(final String sound) {
        this.sound = sound;
        return this;
    }

    /**
     * The action.
     * 
     * @param action The action
     * @return this
     */
    public NotificationCreator setAction(final String action) {
        this.action = action;
        return this;
    }

    /**
     * The data.
     * 
     * @param data The data
     * @return this
     */
    public NotificationCreator setData(final String data) {
        this.data = data;
        return this;
    }

    /**
     * The apn.
     * 
     * @param apn The apn
     * @return this
     */
    public NotificationCreator setApn(final String apn) {
        this.apn = apn;
        return this;
    }

    /**
     * The gcm.
     * 
     * @param gcm The gcm
     * @return this
     */
    public NotificationCreator setGcm(final String gcm) {
        this.gcm = gcm;
        return this;
    }

    /**
     * The sms.
     * 
     * @param sms The sms
     * @return this
     */
    public NotificationCreator setSms(final String sms) {
        this.sms = sms;
        return this;
    }

    /**
     * The facebook_messenger.
     * 
     * @param facebookMessenger The facebook_messenger
     * @return this
     */
    public NotificationCreator setFacebookMessenger(final Map<String, Object> facebookMessenger) {
        this.facebookMessenger = facebookMessenger;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Created Notification
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Notification execute(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.NOTIFICATIONS.toString(),
            "/v1/Services/" + this.serviceSid + "/Notifications",
            client.getRegion()
        );
        
        addPostParams(request);
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("Notification creation failed: Unable to connect to server");
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
        
        return Notification.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (identity != null) {
            for (String prop : identity) {
                request.addPostParam("Identity", prop);
            }
        }
        
        if (tag != null) {
            for (String prop : tag) {
                request.addPostParam("Tag", prop);
            }
        }
        
        if (body != null) {
            request.addPostParam("Body", body);
        }
        
        if (priority != null) {
            request.addPostParam("Priority", priority.toString());
        }
        
        if (ttl != null) {
            request.addPostParam("Ttl", ttl.toString());
        }
        
        if (title != null) {
            request.addPostParam("Title", title);
        }
        
        if (sound != null) {
            request.addPostParam("Sound", sound);
        }
        
        if (action != null) {
            request.addPostParam("Action", action);
        }
        
        if (data != null) {
            request.addPostParam("Data", data);
        }
        
        if (apn != null) {
            request.addPostParam("Apn", apn);
        }
        
        if (gcm != null) {
            request.addPostParam("Gcm", gcm);
        }
        
        if (sms != null) {
            request.addPostParam("Sms", sms);
        }
        
        if (facebookMessenger != null) {
            request.addPostParam("FacebookMessenger", Converter.mapToJson(facebookMessenger));
        }
    }
}