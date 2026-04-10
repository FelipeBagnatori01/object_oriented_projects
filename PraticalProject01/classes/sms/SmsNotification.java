package PraticalProject01.classes.sms;

import PraticalProject01.interfaces.NotificationInterface;

public class SmsNotification implements NotificationInterface {
    public void send() {
        System.out.println("Sending sms notification");
    }

    public void recieve() {
        System.out.println("Receiving sms notification");
    }
}
