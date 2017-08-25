package com.company;

import java.time.LocalDateTime;

public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "This is protected.";


    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "this is a status";

    }



    public String getSubject() {
        return subject;
    }

    public String getBody() {

        return body;
    }

    public LocalDateTime getcreatedAt() {

        return createdAt;
    }

    public String getStatus() {
        System.out.println(this.status);
        return this.status;
    }

    public abstract void transport() throws NoTransportException;

    protected void blarg() {
 System.out.println("This is some more blarg\n");
    }


}
