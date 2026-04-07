package PraticalProject01;

class EmailNotificationFactory {
    public static Notification create() {
        return new EmailNotification();
    }
}