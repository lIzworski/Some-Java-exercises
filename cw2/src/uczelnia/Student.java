package uczelnia;

public class Student {
    private String imie;
    private String nazwisko;
    private String numerIndeksu;

    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setNumerIndeksu(String numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public Student(String imie, String nazwisko, String numerIndeksu)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
    }

    public String GetDane()
    {
        return "Imie: " + imie + " Nazwisko: " + nazwisko + " numer indeksu: " + numerIndeksu;
    }
}