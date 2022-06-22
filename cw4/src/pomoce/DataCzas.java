package pomoce;

public class DataCzas extends Czasowa{
    private Czas Czas;
    private Data Data;


    public Czas getCzas() {
        return Czas;
    }
    public void setCzas(Czas czas) {
        Czas = czas;
    }
    public Data getData() {
        return Data;
    }
    public void setData(Data data) {
        Data = data;
    }

    public DataCzas(int rok, int miesiac, int dzien, int godzina, int minuta)
    {
        Czas = new Czas(godzina, minuta);
        Data = new Data(rok, miesiac, dzien);

    }

    public DataCzas(Data data, Czas czas)
    {
        //1 metoda uzycie jednego konstruktora
        this(data.getRok(), data.getMiesiac(), data.getDzien(), czas.getGodzina(), czas.getMinuta());
        //2 metoda przypisanie argumentow
        //this.Czas = czas;
        //this.Data = data;
    }
    @Override
    public String GetDane()
    {
        return getData().GetDane() + " " + getCzas().GetDane();
    }
}