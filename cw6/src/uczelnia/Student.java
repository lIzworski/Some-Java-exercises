package uczelnia;

public abstract class Student extends Czlowiek
{
    private String nrAlbumu;

    public String getNrAlbumu() {
        return nrAlbumu;
    }

    public void setNrAlbumu(String nrAlbumu) {
        this.nrAlbumu = nrAlbumu;
    }

    public Student(String imie, String nazwisko, String nrAlbumu)
    {
        super(imie, nazwisko);
        this.nrAlbumu = nrAlbumu;
    }
}