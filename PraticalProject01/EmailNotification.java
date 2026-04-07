package PraticalProject01;

class EmailNotification extends Notification {
    public void send() {
        System.out.println("Sending email notification");
    }

    public void recieve() {
        System.out.println("Receiving email notification");
    }

    public String toString() {
        return "Email";
    }
}
