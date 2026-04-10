package PraticalProject01.classes.sms;

import PraticalProject01.interfaces.NotificationInterface;

public class SmsNotificationFactory {
    public static NotificationInterface create() {
        return new SmsNotification();
    }
}
