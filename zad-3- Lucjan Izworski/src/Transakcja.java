public class Transakcja {
    private int id;
    private Towar towar;
    private Klient klient;
    private int ilosc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Towar getTowar() {
        return towar;
    }

    public void setTowar(Towar towar) {
        this.towar = towar;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Transakcja(int id, Towar towar, Klient klient, int ilosc){
        this.id = id;
        this.towar = towar;
        this.klient = klient;
        this.ilosc = ilosc;
    }
}
