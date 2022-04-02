package klient;

import facade.FacadePortal;

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
    }

}
