package PraticalProject01.classes.sms;

import PraticalProject01.interfaces.Notification;

public class SmsNotificationFactory {
    public static Notification create() {
        return new SmsNotification();
    }
}
