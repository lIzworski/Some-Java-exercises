package Kalendarz;

import pomoce.*;

import java.util.ArrayList;
import java.util.List;

public class Kalendarz {
    private String Nazwa;
    private List<Wydarzenie> Wydarzenia;

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public List<Wydarzenie> getWydarzenia() {
        return Wydarzenia;
    }

    public void setWydarzenia(List<Wydarzenie> wydarzenia) {
        Wydarzenia = wydarzenia;
    }

    public Kalendarz(String nazwa)
    {
        this.Nazwa = nazwa;
        Wydarzenia = new ArrayList<>();
    }

    public List<Wydarzenie> GetWydarzeniaZDnia(Data data) {
       return Wydarzenia.stream().filter(item -> item.CzasRozpoczecia().getData().getRok() == data.getRok()&&
                item.CzasRozpoczecia().getData().getMiesiac() == data.getMiesiac() &&
                item.CzasRozpoczecia().getData().getDzien() == data.getDzien()).toList();
    }
}
