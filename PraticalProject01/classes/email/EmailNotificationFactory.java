package PraticalProject01.classes.email;

import PraticalProject01.interfaces.Notification;

public class EmailNotificationFactory {
    public static Notification create() {
        return new EmailNotification();
    }
}