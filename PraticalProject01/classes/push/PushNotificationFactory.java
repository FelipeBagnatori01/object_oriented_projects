package PraticalProject01.classes.push;

import PraticalProject01.interfaces.NotificationInterface;

public class PushNotificationFactory {
    public static NotificationInterface create() {
        return new PushNotification();
    }
}
