package factory;

import java.util.ArrayList;

public class NotificationService {
    public static void notificaionService(){
        var notificationFactory = new NotificationFactory();
        var notificationList = new ArrayList<Notification>();

        notificationList.add(notificationFactory.createNotification(NotificationFactory.NotificationChannel.SMS));
        notificationList.add(notificationFactory.createNotification(NotificationFactory.NotificationChannel.EMAIL));
        notificationList.add(notificationFactory.createNotification(NotificationFactory.NotificationChannel.PUSH));

        notificationList.forEach(Notification::notifyUser);
    }
}
