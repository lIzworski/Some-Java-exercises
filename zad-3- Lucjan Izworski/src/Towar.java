public class Towar {
    private int id;
    private String nazwa;
    private int ilosc;
    private int zwiększilosc;

    public int getZwiększilosc() {
        return zwiększilosc;
    }

    public void setZwiększilosc(int zwiększilosc) {
        this.zwiększilosc = zwiększilosc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }



    public Towar(int id, String nazwa, int ilosc) {
        this.id = id;
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }
}
