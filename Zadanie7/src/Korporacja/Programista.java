package Korporacja;

import java.util.List;

public class Programista extends Pracownik{

    private double premia;
    private Kierownik kierownik;

    private int umiejetnosci;

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }

    public Kierownik getKierownik() {
        return kierownik;
    }

    public void setKierownik(Kierownik kierownik) {
        this.kierownik = kierownik;
    }

    public int getUmiejetnosci() {
        return umiejetnosci;
    }

    public void setUmiejetnosci(int umiejetnosci) {
        this.umiejetnosci = umiejetnosci;
    }

    public Programista(String imie, String nazwisko, String rodzajUmowy, String typStanowiska, double wynagrodzenie, int umiejetnosci) {
        super(imie, nazwisko, "Umowa o pracę", "Programista", wynagrodzenie);
        this.umiejetnosci = umiejetnosci;
    }
    public void DajPremie(double premia){
        if(getRodzajUmowy().equals("Umowa o pracę")){
            setPremia(getPremia()+premia);
        }
    }

}
