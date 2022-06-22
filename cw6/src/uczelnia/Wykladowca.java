package uczelnia;

public abstract class Wykladowca extends Pracownik{

    public String getNazwaKursu() {
        return NazwaKursu;
    }

    public void setNazwaKursu(String nazwaKursu) {
        NazwaKursu = nazwaKursu;
    }

    private String NazwaKursu;

    public Wykladowca(String NazwaKursu,String imie, String nazwisko, String stanowisko, double wynagrodzenie, Ksiegowy ksiegowy) {
        super(imie, nazwisko, stanowisko, wynagrodzenie, ksiegowy);
        this.NazwaKursu = NazwaKursu;
    }

    @Override
    public String GetDane() {
        return super.GetDane() + " Nazwa kursu: " + getNazwaKursu();
    }

    public abstract double ObliczWyplate();


}
