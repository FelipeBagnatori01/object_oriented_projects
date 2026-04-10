package PraticalProject01.adapters;

import PraticalProject01.classes.sms.SmsNotification;
import PraticalProject01.interfaces.NotificationXInterface;

public class SmsAdapter implements NotificationXInterface{
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
