package fasade;

import factory.NotificationService;
import singleton.TestDB;

public class FasadePortal{
    public static void fasadeDB(){
        TestDB.testDB();
    }
    public static void fasadeFactory(){
        NotificationService.notificaionService();
    }
}
