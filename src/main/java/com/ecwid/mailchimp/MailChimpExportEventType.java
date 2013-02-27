package com.ecwid.mailchimp;

/**
 * Created with IntelliJ IDEA.
 * User: ergin
 * Date: 2/27/13
 * Time: 3:00 PM
 * To change this template use File | Settings | File Templates.
 */
public enum MailChimpExportEventType {
    exportlist("list"),
    exportcampaignactivity("campaignSubscriberActivity");

    private final String name;

    MailChimpExportEventType(String name) {
        this.name = name;
    }

    public String value() {
        return name;
    }
}

