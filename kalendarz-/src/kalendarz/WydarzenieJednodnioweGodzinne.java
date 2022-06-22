package kalendarz;

import pomoce.Czas;
import pomoce.Czasowa;
import pomoce.Data;
import pomoce.DataCzas;

public class WydarzenieJednodnioweGodzinne extends WydarzenieJednodniowe implements Igodzinne{
    private Czas CzasRozpoczecia;
    private Czas CzasZakonczenia;

    public WydarzenieJednodnioweGodzinne(String nazwa, pomoce.Data data, Czas czasRozpoczecia, Czas czasZakonczenia) {
        super(nazwa, data);
        CzasRozpoczecia = czasRozpoczecia;
        CzasZakonczenia = czasZakonczenia;
    }

    public Czas getCzasRozpoczecia() {
        return CzasRozpoczecia;
    }

    public void setCzasRozpoczecia(Czas czasRozpoczecia) {
        CzasRozpoczecia = czasRozpoczecia;
    }

    public Czas getCzasZakonczenia() {
        return CzasZakonczenia;
    }

    public void setCzasZakonczenia(Czas czasZakonczenia) {
        CzasZakonczenia = czasZakonczenia;
    }

    @Override
    public DataCzas CzasRozpoczecia() {
        return new DataCzas(getData(), getCzasRozpoczecia());
    }

    @Override
    public DataCzas CzasZakonczenia() {
        return new DataCzas(getData(),getCzasZakonczenia());
    }

    @Override
    public String PrzedzailTrwaniaWydarzenia() {
        return getData().GetDane() + " " + this.CzasRozpoczecia.GetDane() + " - " + this.CzasZakonczenia.GetDane();
    }

    @Override
    public double CzasTrwaniaWydarzeniaWGodzinach() {
        double czas = CzasZakonczenia.getGodzina() - getCzasRozpoczecia().getGodzina();
        if(getCzasRozpoczecia().getMinuta() < getCzasZakonczenia().getMinuta())
        {
            czas += (getCzasZakonczenia().getMinuta() - getCzasRozpoczecia().getMinuta()/60);
        }
        else {
            czas += (getCzasRozpoczecia().getMinuta() - getCzasZakonczenia().getMinuta()/60);
        }
        return czas;
    }

    @Override
    public boolean CzySieNaklada(Igodzinne godzinne) {
        //Bierzemy pod uwage tylko godziny do poprawy
        // do generalnej naprawy
        if(godzinne.getData().getRok() == getData().getRok() &&
        godzinne.getData().getMiesiac() == getData().getMiesiac() &&
        godzinne.getData().getDzien() == getData().getDzien()) {
            if(getCzasRozpoczecia().getGodzina() < godzinne.getCzasZakonczenia().getGodzina())
            {
                return true;
            } else if (getCzasZakonczenia().getGodzina() > godzinne.getCzasRozpoczecia().getGodzina())
            {
                return true;
            }
        }
        return false;
    }
}
