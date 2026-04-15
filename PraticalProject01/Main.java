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
import PraticalProject01.classes.homeTheater.HomeTheater;
import PraticalProject01.classes.coffeeshop.drinks.Beverage;
import PraticalProject01.classes.coffeeshop.drinks.Espresso;
import PraticalProject01.classes.coffeeshop.drinks.Cappuccino;
import PraticalProject01.classes.coffeeshop.drinks.Tea;
import PraticalProject01.classes.coffeeshop.decorators.Milk;
import PraticalProject01.classes.coffeeshop.decorators.WhippedCream;
import PraticalProject01.classes.coffeeshop.decorators.Cinnamon;
import PraticalProject01.classes.coffeeshop.decorators.ChocolateSyrup;

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
        
        System.out.println("\n=== Testing Home Theater Facade ===");
        HomeTheater homeTheater = new HomeTheater();

        System.out.println("\n-- Watch movie on Cinema --");
        homeTheater.startMovieCinema();
        homeTheater.endMovie();

        System.out.println("\n-- Watch movie on TV --");
        homeTheater.startMovieTv();
        homeTheater.endMovie();

        System.out.println("\n-- Listen to music --");
        homeTheater.listenToMusic();
        homeTheater.endMovie();

        System.out.println("\n=== Testing Coffee Shop - Decorator Pattern ===");

        // Pedido 1: Espresso simples
        Beverage drink1 = new Espresso();
        System.out.println("Pedido 1: " + drink1);

        // Pedido 2: Cappuccino com Leite e Chantilly
        Beverage drink2 = new Cappuccino();
        drink2 = new Milk(drink2);
        drink2 = new WhippedCream(drink2);
        System.out.println("Pedido 2: " + drink2);

        // Pedido 3: Chá com Canela e Calda de Chocolate
        Beverage drink3 = new Tea();
        drink3 = new Cinnamon(drink3);
        drink3 = new ChocolateSyrup(drink3);
        System.out.println("Pedido 3: " + drink3);

        // Pedido 4: Espresso com todos os adicionais
        Beverage drink4 = new Espresso();
        drink4 = new Milk(drink4);
        drink4 = new WhippedCream(drink4);
        drink4 = new Cinnamon(drink4);
        drink4 = new ChocolateSyrup(drink4);
        System.out.println("Pedido 4: " + drink4);

        System.out.println("\n=== All tests completed ===");
    }
}
