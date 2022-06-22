package pomoce;

public class Data extends Czasowa {
    private  int Rok;
    private int Miesiac;
    private int Dzien;

    public Data(int rok, int miesiac, int dzien) {
        Rok = rok;
        Miesiac = miesiac;
        Dzien = dzien;
    }

    public int getRok() {
        return Rok;
    }

    public void setRok(int rok) {
        Rok = rok;
    }

    public int getMiesiac() {
        return Miesiac;
    }

    public void setMiesiac(int miesiac) {
        Miesiac = miesiac;
    }

    public int getDzien() {
        return Dzien;
    }

    public void setDzien(int dzien) {
        Dzien = dzien;
    }

    @Override
    public String GetDane() {
        return getRok() + "-" + getMiesiac() + "-" + getDzien();
    }
}
