package Kalendarz;

import pomoce.Czas;
import pomoce.Czasowa;
import pomoce.Data;
import pomoce.DataCzas;

public class WydarzenieJedniodniowe extends Wydarzenie
{
    private Data Data;

    public pomoce.Data getData() {
        return Data;
    }
    public void setData(pomoce.Data data) {
        Data = data;
    }
    public WydarzenieJedniodniowe(String nazwa, Data data)
    {
        super(nazwa);
        this.Data = data;
    }

    @Override
    public DataCzas CzasRozpoczecia() {
        return new DataCzas(getData(), new Czas(0, 0));
    }

    @Override
    public DataCzas CzasZakonczenia() {
        return CzasRozpoczecia();
    }

    @Override
    public String PrzedzalTrwaniaWydarzenia() {
        return getData().GetDane();
    }

    @Override
    public double CzasTrwaniaWydarzeniaWGodzinach() {
        return 24;
    }


}
