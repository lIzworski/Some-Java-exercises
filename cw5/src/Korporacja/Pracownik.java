package Korporacja;

import java.util.ArrayList;
import java.util.List;

public abstract class Pracownik {
    private String imie;
    private String nazwisko;
    private double wynagrodzenie;
    private String typUmowy;
    private String czasZatrudnienia;
    private String stanowisko;


    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

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

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getTypUmowy() {
        return typUmowy;
    }

    public void setTypUmowy(String typUmowy) {
        this.typUmowy = typUmowy;
    }

    public String getCzasZatrudnienia() {
        return czasZatrudnienia;
    }

    public void setCzasZatrudnienia(String czasZatrudnienia) {
        this.czasZatrudnienia = czasZatrudnienia;
    }

    public Pracownik(String imie, String nazwisko, String czasZatrudnienia, double wynagrodzenie, String typUmowy, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
        this.typUmowy = typUmowy;
        this.czasZatrudnienia = czasZatrudnienia;
        this.stanowisko = stanowisko;
    }

}
