package kalendarz;

import pomoce.Czasowa;
import pomoce.DataCzas;

abstract public class Wydarzenie {
    private String Nazwa;

    public Wydarzenie(String nazwa) {
        Nazwa = nazwa;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    abstract public DataCzas CzasRozpoczecia();
    abstract public DataCzas CzasZakonczenia();
    abstract public String PrzedzailTrwaniaWydarzenia();
    abstract public double CzasTrwaniaWydarzeniaWGodzinach();
    public double CzasTrwaniaWydarzeniaWDniach()
    {
        return CzasTrwaniaWydarzeniaWGodzinach()/24;
    }

}
