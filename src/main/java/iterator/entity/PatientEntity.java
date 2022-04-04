package iterator.entity;

import java.util.StringJoiner;

public class PatientEntity extends Entity {

    private String pesel;
    private String adres;

    public PatientEntity(String imie, String nazwisko, String pesel, String adres) {
        super(imie, nazwisko);
        this.pesel = pesel;
        this.adres = adres;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "PatientEntity{" +
                "pesel='" + pesel + '\'' +
                ", adres='" + adres + '\'' +
                "} " + super.toString();
    }
}
