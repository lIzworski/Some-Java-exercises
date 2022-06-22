package uczelnia;

public abstract class Pracownik extends Czlowiek
{
    private String stanowisko;
    private double wynagrodzenie;
    Ksiegowy ksiegowy;


    public Ksiegowy getKsiegowy() {
        return ksiegowy;
    }

    public void setKsiegowy(Ksiegowy ksiegowy) {
        this.ksiegowy = ksiegowy;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }


    public Pracownik(String imie, String nazwisko, String stanowisko, double wynagrodzenie, Ksiegowy ksiegowy)
    {
        super(imie, nazwisko);
        this.stanowisko = this.getClass().getSimpleName();
        this.wynagrodzenie = wynagrodzenie;
        this.ksiegowy = ksiegowy;
    }

    //Nadpisujemy metode
    @Override
    public String GetDane()
    {
        return super.GetDane() + " " + getStanowisko()+ " " + getWynagrodzenie();
    }
}