package kalendarz;

import pomoce.Data;

import java.util.ArrayList;
import java.util.List;

public class Kalendarz {
    private String Nazwa;
    private List<Wydarzenie> Wydarzenia;

    public Kalendarz(String nazwa) {
        Nazwa = nazwa;
        Wydarzenia = new ArrayList<>();
    }

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

    public List<Wydarzenie> GetWydarzeniaZDnia(Data data)
    {
        return  Wydarzenia.stream().filter(item -> item.CzasRozpoczecia().getData().getRok() == data.getRok() &&
                item.CzasRozpoczecia().getData().getMiesiac() == data.getMiesiac() &&
                item.CzasRozpoczecia().getData().getDzien() == data.getDzien()).toList();
    }
}
