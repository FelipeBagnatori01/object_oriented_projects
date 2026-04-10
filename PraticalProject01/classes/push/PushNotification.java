package PraticalProject01.classes.push;

import PraticalProject01.interfaces.Notification;

public class PushNotification implements Notification{
    public void send() {
        System.out.println("Sending push notification");
    }

    public void recieve() {
        System.out.println("Receiving push notification");
    }
}
