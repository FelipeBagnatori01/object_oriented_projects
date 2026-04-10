package PraticalProject01;

import PraticalProject01.adapters.SmsAdapter;
import PraticalProject01.classes.email.EmailNotification;
import PraticalProject01.classes.email.EmailNotificationFactory;
import PraticalProject01.classes.push.PushNotification;
import PraticalProject01.classes.push.PushNotificationFactory;
import PraticalProject01.classes.sms.SmsNotification;
import PraticalProject01.classes.sms.SmsNotificationFactory;
import PraticalProject01.proxys.NotificationProxy;
import PraticalProject01.classes.user.User;

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
        System.out.println("Using Adapter: ");
        SmsNotification smsNotif = (SmsNotification) SmsNotificationFactory.create();
        SmsAdapter smsNew = new SmsAdapter(smsNotif);
        smsNew.sendX();
        smsNew.recieveX();
        
        System.out.println("\n=== Testing Notification Proxy ===");
        User admin = new User("Admin", "John", "john@example.com", 30);
        User regular = new User("Regular", "Jane", "jane@example.com", 25);
        
        EmailNotification email = (EmailNotification) EmailNotificationFactory.create();
        NotificationProxy proxyAdmin = new NotificationProxy(email, admin);
        NotificationProxy proxyRegular = new NotificationProxy(email, regular);
        
        System.out.println("Admin user sending notifications:");
        proxyAdmin.send();
        proxyAdmin.send();
        proxyAdmin.send();
        proxyAdmin.recieve();
        proxyAdmin.recieve();
        System.out.println("\nLog Result: ");
        proxyAdmin.logNumbers();
        
        System.out.println("\nRegular user trying to view logs:");
        proxyRegular.send();
        System.out.println("\nLog Result: ");
        proxyRegular.logNumbers();
        
        System.out.println("\n=== All tests completed ===");
    }
}
