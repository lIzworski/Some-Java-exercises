package pomoce;

public class DataCzas extends Czasowa {
    private Czas Czas;
    private Data Data;

    public DataCzas(int rok, int miesiac, int dzien, int godzina, int minuta) {
        Czas = new Czas(godzina, minuta);
        Data = new Data(rok,miesiac,dzien);
    }

    public DataCzas(Data data, Czas czas) {
        Czas = czas;
        Data = data;
//        this(data.getRok(),data.ge)
    }

    public pomoce.Czas getCzas() {
        return Czas;
    }

    public void setCzas(pomoce.Czas czas) {
        Czas = czas;
    }

    public pomoce.Data getData() {
        return Data;
    }

    public void setData(pomoce.Data data) {
        Data = data;
    }

    @Override
    public String GetDane() {
        return getData().GetDane() + " " + getCzas().GetDane();
    }
}
