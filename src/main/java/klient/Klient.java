package klient;

import facade.FacadePortal;
import template.FiltrSQL1;
import template.FiltrSQL2;
import template.FiltrSQL3;

import java.io.File;
import java.util.Arrays;

public class Klient {

    public static void main(String[] args) {
        FacadePortal.facadeDB();
        FacadePortal.facadeFactory();
        FacadePortal.facadeAdapter(Arrays.asList(
                new File("C:\\Users\\Daniil\\IdeaProjects\\Adapter\\src\\main\\resources\\patients.json"),
                new File("C:\\Users\\Daniil\\IdeaProjects\\Adapter\\src\\main\\resources\\patients.xml"))
        );
        FacadePortal.facadeTemplate(new FiltrSQL1());
        FacadePortal.facadeTemplate(new FiltrSQL2());
        FacadePortal.facadeTemplate(new FiltrSQL3());
    }

}
