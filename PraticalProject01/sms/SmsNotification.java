package PraticalProject01.sms;

import PraticalProject01.Notification;

public class SmsNotification extends Notification {
    public void send() {
        System.out.println("Sending sms notification");
    }

    public void recieve() {
        System.out.println("Receiving sms notification");
    }
}
