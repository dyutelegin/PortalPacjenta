package facade;

import adapter.AdapterService;
import factory.NotificationService;
import singleton.TestDB;
import template.AbstractTemplateSQL;

import java.io.File;
import java.util.List;

public class FacadePortal {
    public static void facadeDB() {
        TestDB.testDB();
    }

    public static void facadeFactory() {
        NotificationService.notificationService();
    }

    public static void facadeAdapter(List<File> files) {
        AdapterService bs = new AdapterService();
        bs.adapterService(files);
    }

    public static void facadeTemplate(AbstractTemplateSQL abstractTemplateSQL) {
        abstractTemplateSQL.templateMetod();
    }

    public static void facadeIterator() {

    }
}
