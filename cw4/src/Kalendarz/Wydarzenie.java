package Kalendarz;

import pomoce.Czasowa;
import pomoce.DataCzas;

abstract public class Wydarzenie {
    private String Nazwa;

    public String getNazwa()
    {
        return Nazwa;
    }
    public Wydarzenie(String nazwa)
    {
        this.Nazwa = nazwa;
    }
    public void setNazwa(String nazwa)
    {
        Nazwa = nazwa;
    }
    abstract public DataCzas CzasRozpoczecia();
    abstract public DataCzas CzasZakonczenia();
    abstract public String PrzedzalTrwaniaWydarzenia();

    abstract public double CzasTrwaniaWydarzeniaWGodzinach();
    public double CzasTrwaniaWydarzeniaWDniach()
    {
        return CzasTrwaniaWydarzeniaWGodzinach() / 24;
    }

}
