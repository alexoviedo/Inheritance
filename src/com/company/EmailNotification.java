package com.company;


public class EmailNotification extends Notification{
    private String recipient;
    private String smtpProvider;


    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        blarg();

    }



    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println("the subject is " + getSubject() +
                "\nthe body is " + getBody() +
                "\nthe recipient is " + getRecipient() +
                "\nthe smtp Provider is " + getSmtpProvider() +
                "\nthe status is " + getStatus()+"\n");}

    @Override
    public String getStatus() {
        status = "this is a new status";
        System.out.println(status);
        return this.status;

    }

    @Override
    public void blarg() {
        System.out.println("\n\nHave some blarg!!!\n");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (!recipient.equals(that.recipient)) return false;
        return smtpProvider.equals(that.smtpProvider);
    }


    @Override
    protected Object clone() {
        return new EmailNotification(getSubject(), getBody(), getRecipient(), getSmtpProvider());
    }
}




