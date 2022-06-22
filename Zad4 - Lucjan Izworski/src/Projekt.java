public class Projekt {
    private String nazwa;
    private int czasTrwania;
    private String opis;
    private String język;
    private String kraj;
    private String miejscowosc;

    public Projekt(String nazwa, int czasTrwania, String opis, String język, String kraj, String miejscowosc) {
        this.nazwa = nazwa;
        this.czasTrwania = czasTrwania;
        this.opis = opis;
        this.język = język;
        this.kraj = kraj;
        this.miejscowosc = miejscowosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public void setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getJezyk() {
        return język;
    }

    public void setJęzyk(String język) {
        this.język = język;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }
}
