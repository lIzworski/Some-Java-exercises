package Korporacja;

public class Przedmiot {

    private int numerPrzedmiotu = 0;
    private String nazwa;
    private boolean dozwolone;
    private String odpowiedz;

    public int getNumerPrzedmiotu() {
        return numerPrzedmiotu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public boolean isDozwolone() {
        return dozwolone;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public Przedmiot(String nazwa, boolean dozwolone, String odpowiedz) {
        this.nazwa = nazwa;
        this.dozwolone = dozwolone;
        this.odpowiedz = odpowiedz;
        numerPrzedmiotu += 1;
    }


}
