package PraticalProject01.push;

import PraticalProject01.Notification;

public class PushNotification extends Notification{
    public void send() {
        System.out.println("Sending push notification");
    }

    public void recieve() {
        System.out.println("Receiving push notification");
    }
}
