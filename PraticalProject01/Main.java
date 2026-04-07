package PraticalProject01;

import PraticalProject01.email.EmailNotificationFactory;
import PraticalProject01.push.PushNotificationFactory;
import PraticalProject01.sms.SmsNotificationFactory;

public class Main {
    public static void main(String[] args) {
        SystemSettings.getInstance("MyApp", "server.example.com", 3);
        
        Notification emailNotif = EmailNotificationFactory.create();
        Notification pushNotif = PushNotificationFactory.create();
        Notification smsNotif = SmsNotificationFactory.create();
        
        System.out.println("Notifications created: " + emailNotif + ", " + pushNotif + ", " + smsNotif);
    }
}
