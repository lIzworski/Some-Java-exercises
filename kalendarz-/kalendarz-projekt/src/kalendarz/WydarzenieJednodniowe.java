package kalendarz;

import pomoce.*;

public class WydarzenieJednodniowe extends Wydarzenie{

    private Data Data;

    public WydarzenieJednodniowe(String nazwa, pomoce.Data data) {
        super(nazwa);
        Data = data;
    }

    public Data getData() {
        return Data;
    }

    public void setData(Data data) {
        Data = data;
    }

    @Override
    public DataCzas CzasRozpoczecia() {
        return new DataCzas(getData(), new Czas(0,0));
    }

    @Override
    public DataCzas CzasZakonczenia() {
        return CzasRozpoczecia();
    }

    @Override
    public String PrzedzailTrwaniaWydarzenia() {
        return getData().GetDane();
    }

    @Override
    public double CzasTrwaniaWydarzeniaWGodzinach() {
        return 24;
    }
}
