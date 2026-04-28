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
import PraticalProject01.classes.temperature.City;
import PraticalProject01.classes.observers.WeatherStation;
import PraticalProject01.classes.reports.PopularityReport;
import PraticalProject01.classes.reports.ProfitReport;
import PraticalProject01.classes.reports.visitor.HtmlVisitor;
import PraticalProject01.classes.reports.visitor.PdfVisitor;

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

        System.out.println("\n=== Testing Observer Pattern - Weather Station ===");

        WeatherStation station = new WeatherStation();

        City saoPaulo = new City("São Paulo", 28.5, 55.0, 20.0, 12.3);
        saoPaulo.addObserver(station);

        City saoJoseDosCampos = new City("São Jose dos Campos", 25.0, 85.0, 55.0, 18.7);
        saoJoseDosCampos.addObserver(station);

        City campinas = new City("Campinas", 30.2, 70.0, 65.0, 9.5);
        campinas.addObserver(station);

        System.out.println("\n-- Initial readings --");
        saoPaulo.notifyObservers();
        saoJoseDosCampos.notifyObservers();
        campinas.notifyObservers();

        System.out.println("\n-- Updating Sao Paulo temperature --");
        saoPaulo.setTemperature(22.0);
        saoPaulo.notifyObservers();

        System.out.println("\n=== Testing Visitor Pattern - Reports ===");

        ProfitReport profitReport = new ProfitReport("Lucros T1 2026", "A receita superou as expectativas em 15%.");
        PopularityReport popularityReport = new PopularityReport("Popularidade de Produtos", "O Produto A ficou em 1º lugar em vendas.");

        HtmlVisitor htmlVisitor = new HtmlVisitor();
        PdfVisitor pdfVisitor = new PdfVisitor();

        System.out.println("\n-- Exporting reports as HTML --");
        profitReport.accept(htmlVisitor);
        popularityReport.accept(htmlVisitor);

        System.out.println("\n-- Exporting reports as PDF --");
        profitReport.accept(pdfVisitor);
        popularityReport.accept(pdfVisitor);

        System.out.println("\n=== All tests completed ===");
    }
}
