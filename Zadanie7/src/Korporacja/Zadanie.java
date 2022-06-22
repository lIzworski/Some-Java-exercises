package Korporacja;

public class Zadanie {
    private int numerZadania = 0;
    private String nazwa;
    private String tresc;
    private Programista programista;
    private boolean czyZostaloZrobione;
    private int wymaganyPoziomUmiejetnosci;
    private int bonusDoUmiejetnosciPoWykonaniuZadania;

    public int getNumerZadania() {
        return numerZadania;
    }

    public void setNumerZadania(int numerZadania) {
        this.numerZadania = numerZadania;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public Programista getProgramista() {
        return programista;
    }

    public void setProgramista(Programista programista) {
        this.programista = programista;
    }

    public boolean isCzyZostaloZrobione() {
        return czyZostaloZrobione;
    }

    public void setCzyZostaloZrobione(boolean czyZostaloZrobione) {
        this.czyZostaloZrobione = czyZostaloZrobione;
    }

    public int getWymaganyPoziomUmiejetnosci() {
        return wymaganyPoziomUmiejetnosci;
    }

    public void setWymaganyPoziomUmiejetnosci(int wymaganyPoziomUmiejetnosci) {
        this.wymaganyPoziomUmiejetnosci = wymaganyPoziomUmiejetnosci;
    }

    public int getBonusDoUmiejetnosciPoWykonaniuZadania() {
        return bonusDoUmiejetnosciPoWykonaniuZadania;
    }

    public void setBonusDoUmiejetnosciPoWykonaniuZadania(int bonusDoUmiejetnosciPoWykonaniuZadania) {
        this.bonusDoUmiejetnosciPoWykonaniuZadania = bonusDoUmiejetnosciPoWykonaniuZadania;
    }

    public Zadanie(int numerZadania,String nazwa, String tresc, Programista programista, boolean czyZostaloZrobione, int wymaganyPoziomUmiejetnosci, int bonusDoUmiejetnosciPoWykonaniuZadania) {
        this.numerZadania = numerZadania;
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.programista = programista;
        this.czyZostaloZrobione = czyZostaloZrobione;
        this.wymaganyPoziomUmiejetnosci = wymaganyPoziomUmiejetnosci;
        this.bonusDoUmiejetnosciPoWykonaniuZadania = bonusDoUmiejetnosciPoWykonaniuZadania;
    }
}
