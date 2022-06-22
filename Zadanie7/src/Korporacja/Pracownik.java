package Korporacja;

public abstract class Pracownik {

    private String imie;
    private String nazwisko;
    private String rodzajUmowy;
    private String typStanowiska;
    private double wynagrodzenie;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getRodzajUmowy() {
        return rodzajUmowy;
    }

    public void setRodzajUmowy(String rodzajUmowy) {
        this.rodzajUmowy = rodzajUmowy;
    }


    public String getTypStanowiska() {
        return typStanowiska;
    }

    public void setTypStanowiska(String typStanowiska) {
        this.typStanowiska = typStanowiska;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public Pracownik(String imie, String nazwisko, String rodzajUmowy, String typStanowiska, double wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rodzajUmowy = rodzajUmowy;
        this.typStanowiska = typStanowiska;
        this.wynagrodzenie = wynagrodzenie;
    }
}
