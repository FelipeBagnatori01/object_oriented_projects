package PraticalProject01.adapters;

import PraticalProject01.classes.sms.SmsNotification;

public class SmsAdapter implements NotificationX{
    private SmsNotification notification;

    public SmsAdapter(SmsNotification notification) {
        this.notification = notification;
    }

    public void sendX() {
        notification.send();
    }

    public void recieveX() {
        notification.recieve();
    }
}
