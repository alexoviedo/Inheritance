package com.company;

public class TextNotification extends Notification{
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        blarg();

    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smsProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println(
                "the subject is " + getSubject()
                        + "\nthe body is " + getBody()
                        + "\nthe recipient is " + getRecipient()
                        + "\nthe smtp Provider is " + getSmtpProvider()
                        + "\nthe status is " + getStatus()+"\n");}
    }


