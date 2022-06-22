package uczelnia;

public class WykladowcaZlecenie extends Wykladowca implements IKsiegowy{

    public double getIloscGodzin() {
        return iloscGodzin;
    }

    public void setIloscGodzin(double iloscGodzin) {
        this.iloscGodzin = iloscGodzin;
    }

    private double iloscGodzin;

    public WykladowcaZlecenie(String NazwaKursu,String imie, String nazwisko, String stanowisko, double wynagrodzenie, double godziny, Ksiegowy ksiegowy) {
        super(NazwaKursu,imie, nazwisko, stanowisko, wynagrodzenie, ksiegowy);
        this.iloscGodzin = godziny;
    }

    @Override
    public double ObliczWyplate() {
        return getWynagrodzenie() * getIloscGodzin();
    }

    @Override
    public void WypiszKsiegowego() {
        System.out.println(getKsiegowy().GetDane());
    }
}
