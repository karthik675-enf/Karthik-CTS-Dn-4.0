public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(baseNotifier);
        Notifier slackAndSMS = new SlackNotifierDecorator(smsNotifier);

        System.out.println("Notification through Email + SMS + Slack:");
        slackAndSMS.send("Your order has been shipped.");
    }
}
