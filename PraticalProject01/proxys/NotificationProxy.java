package PraticalProject01.proxys;

import PraticalProject01.classes.user.User;
import PraticalProject01.interfaces.NotificationInterface;

public class NotificationProxy implements NotificationInterface{
    private User user;
    private int notificationsSent;
    private int notificationsRecieved;
    private NotificationInterface base;

    public NotificationProxy(NotificationInterface base, User user){
        this.base = base;
        this.notificationsSent = 0;
        this.notificationsRecieved = 0;
        this.user = user;
    }

    public void send() {
        notificationsSent++;
        base.send();
    }

    public void recieve() {
        notificationsRecieved++;
        base.recieve();
    }

    public void logNumbers() {
        if (user.getUserType() == "Admin"){
            System.out.println("Total recieved notifications: " + notificationsRecieved);
            System.out.println("Total sent notifications: " + notificationsSent);
        } else {
            System.out.println("You dont have permission - 401");
        }
    }
}
