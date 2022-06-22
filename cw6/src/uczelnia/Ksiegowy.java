package uczelnia;

public class Ksiegowy extends Pracownik {

    public Ksiegowy(String imie, String nazwisko, String stanowisko, double wynagrodzenie, Ksiegowy ksiegowy) {
        super(imie, nazwisko, Ksiegowy.class.getSimpleName(), wynagrodzenie, ksiegowy);
    }

    public void WyplacPieniadze(Wykladowca wykladowca){
        System.out.println("Wyplacono: " + wykladowca.ObliczWyplate() + " dla " + wykladowca.GetDane());
    }
}
