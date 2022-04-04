package template;

public abstract class AbstractTemplateSQL {
    public void templateMetod() {
        this.showWynik("Wynik zapytania SQL z tabeli Doktor albo Pacjent");
    }
    public void showWynik (String Imie) {
        System.out.println("Jakiś wynik..."+Imie);
    }
}
