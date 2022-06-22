package Korporacja;

public class Zadanie {
    private String nazwa;
    private String tresc;
    private Programista programista;
    private boolean czyZostaloZrobione;

    public boolean isCzyZostaloZrobione() {
        return czyZostaloZrobione;
    }

    public void setCzyZostaloZrobione(boolean czyZostaloZrobione) {
        this.czyZostaloZrobione = czyZostaloZrobione;
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

    public Zadanie(String nazwa, String tresc, Programista programista) {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.programista = programista;
    }
}
