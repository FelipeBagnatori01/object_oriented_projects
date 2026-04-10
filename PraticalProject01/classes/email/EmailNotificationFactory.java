package PraticalProject01.classes.email;

import PraticalProject01.interfaces.NotificationInterface;

public class EmailNotificationFactory {
    public static NotificationInterface create() {
        return new EmailNotification();
    }
}