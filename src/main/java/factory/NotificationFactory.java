package factory;

public class NotificationFactory {
    public enum NotificationChannel {
        SMS, EMAIL, PUSH,
    }

    public Notification createNotification(NotificationChannel channel) {
        if (channel == null) {
            return null;
        }

        return switch (channel) {
            case SMS -> new SMSNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
        };
    }
}
