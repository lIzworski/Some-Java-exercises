package Korporacja;

import java.util.ArrayList;
import java.util.List;

public class Programista extends Pracownik{
    private double premia;
    private Kierownik kierownik;
    private List<Zadanie> zadania;
    private int umiejetnosci;


    public int getUmiejetnosci() {
        return umiejetnosci;
    }

    public void setUmiejetnosci(int umiejetnosci) {
        this.umiejetnosci = umiejetnosci;
    }
    
    private List<Zadanie> getZadania() {
        return zadania;
    }

    public void setZadania(List<Zadanie> zadania) {
        this.zadania = zadania;
    }

    public Kierownik getKierownik() {
        return kierownik;
    }

    public void setKierownik(Kierownik kierownik) {
        this.kierownik = kierownik;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }

    public Programista(String imie, String nazwisko, double wynagrodzenie, String czasZatrudnienia, String typUmowy){
        super(imie, nazwisko, czasZatrudnienia,wynagrodzenie,typUmowy, "Programista");
        zadania = new ArrayList<>();
    }

    public void DajPremie(double premia){
        if(getTypUmowy().equals("Umowa o prace")){
            setPremia(getPremia()+ premia);
        }
    }



}
