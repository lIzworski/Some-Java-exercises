
package uczelnia;

public class Wykladowca {
    private String imie;
    private String nazwisko;
    private String numerPracownika;

    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNumerPracownika(String numerPracownika) {
        this.numerPracownika = numerPracownika;
    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }

    public String getNumerPracownika() {
        return numerPracownika;
    }

    public Wykladowca(String imie, String nazwisko, String numerPracownika)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerPracownika = numerPracownika;
    }
    public String GetDane()
    {
        return "Imie: " + imie + " Nazwisko: " + nazwisko + " numer indeksu: " + numerPracownika;
    }
}