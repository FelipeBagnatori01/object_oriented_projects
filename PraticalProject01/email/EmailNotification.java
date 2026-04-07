package PraticalProject01.email;

import PraticalProject01.Notification;

class EmailNotification extends Notification {
    public void send() {
        System.out.println("Sending email notification");
    }

    public void recieve() {
        System.out.println("Receiving email notification");
    }
}
