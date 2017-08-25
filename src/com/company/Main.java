package com.company;

public class Main {

    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification("Uhhhhhhhhhh","This is also the other body","Parker","google");
        TextNotification textNotification = new TextNotification("Here us a text notification","This is the body","Parker","ATT");

        emailNotification.transport();
        textNotification.transport();

        Object emailNotificationClone = emailNotification.clone();

        System.out.println(emailNotification.equals(emailNotificationClone));

        emailNotification.equals(emailNotificationClone);
    }

}
