package PraticalProject01.email;

import PraticalProject01.Notification;

public class EmailNotificationFactory {
    public static Notification create() {
        return new EmailNotification();
    }
}