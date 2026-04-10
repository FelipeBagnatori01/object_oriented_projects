package PraticalProject01.classes.push;

import PraticalProject01.Notification;

public class PushNotificationFactory {
    public static Notification create() {
        return new PushNotification();
    }
}
