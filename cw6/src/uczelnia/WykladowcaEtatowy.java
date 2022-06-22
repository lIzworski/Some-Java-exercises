package uczelnia;

public class WykladowcaEtatowy extends Wykladowca{
    public WykladowcaEtatowy(String NazwaKursu,String imie, String nazwisko, String stanowisko, double wynagrodzenie, Ksiegowy ksiegowy) {
        super(NazwaKursu,imie, nazwisko, stanowisko, wynagrodzenie, ksiegowy);
    }

    @Override
    public double ObliczWyplate() {
        return getWynagrodzenie();
    }
}
