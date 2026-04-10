package PraticalProject01.classes.email;

import PraticalProject01.interfaces.NotificationInterface;

public class EmailNotification implements NotificationInterface {
    public void send() {
        System.out.println("Sending email notification");
    }

    public void recieve() {
        System.out.println("Receiving email notification");
    }
}
