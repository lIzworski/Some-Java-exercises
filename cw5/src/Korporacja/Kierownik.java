package Korporacja;

public class Kierownik extends  Pracownik {
    public Kierownik(String imie, String nazwisko, double wynagrodzenie, String czasZatrudnienia){
        super(imie, nazwisko, czasZatrudnienia,wynagrodzenie,"Umowa o prace", "Kierownik");
    }
}
