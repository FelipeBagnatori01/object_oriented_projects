package PraticalProject01;

import PraticalProject01.email.EmailNotificationFactory;
import PraticalProject01.push.PushNotificationFactory;
import PraticalProject01.sms.SmsNotificationFactory;
import PraticalProject01.email.EmailNotification;
import PraticalProject01.push.PushNotification;
import PraticalProject01.sms.SmsNotification;

public class Main {
    public static void main(String[] args) {
        SystemSettings.getInstance("MyApp", "server.example.com", 3);
        
        System.out.println("=== Testing Email Notification ===");
        EmailNotification emailNotif = (EmailNotification) EmailNotificationFactory.create();
        emailNotif.send();
        emailNotif.recieve();
        
        System.out.println("\n=== Testing Push Notification ===");
        PushNotification pushNotif = (PushNotification) PushNotificationFactory.create();
        pushNotif.send();
        pushNotif.recieve();
        
        System.out.println("\n=== Testing SMS Notification ===");
        SmsNotification smsNotif = (SmsNotification) SmsNotificationFactory.create();
        smsNotif.send();
        smsNotif.recieve();
        
        System.out.println("\n=== All tests completed ===");
    }
}
