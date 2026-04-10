package PraticalProject01.classes.email;

import PraticalProject01.interfaces.Notification;

public class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending email notification");
    }

    public void recieve() {
        System.out.println("Receiving email notification");
    }
}
