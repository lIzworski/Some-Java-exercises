package Kalendarz;

import pomoce.*;


public class WydarzenieJedniodnioweGodzinne extends WydarzenieJedniodniowe implements IGodzinne {
    private Czas CzasRozpoczecia;
    private Czas CzasZakonczenia;

    public Czas getCzasRozpoczecia() {
        return CzasRozpoczecia;
    }
    public WydarzenieJedniodnioweGodzinne(String nazwa, Data data, Czas czasRozpoczecia, Czas czasZakonczenia)
    {
        super(nazwa, data);
        this.CzasRozpoczecia = czasRozpoczecia;
        this.CzasZakonczenia = czasZakonczenia;
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
        return new DataCzas(getData(), getCzasZakonczenia());
    }
    @Override
    public boolean CzySieNaklada(IGodzinne godzinne) {
        //bierzemy pod uwage tylko godziny!!! Do poprawy
        if (godzinne.getData().getRok() == getData().getRok() &&
                godzinne.getData().getMiesiac() == getData().getMiesiac()
                && godzinne.getData().getDzien() == getData().getDzien()
        ) {
            if (getCzasRozpoczecia().getGodzina() < godzinne.getCzasZakonczenia().getGodzina()) {
                if (getCzasRozpoczecia().getMinuta() < godzinne.getCzasZakonczenia().getMinuta())
                    return true;
            }
        } else if (getCzasZakonczenia().getGodzina() > godzinne.getCzasRozpoczecia().getGodzina()) {
            return true;
        }

        return false;

    }
    @Override
    public pomoce.Data getData() {
        return getData();
    }

    @Override
    public String PrzedzalTrwaniaWydarzenia() {
        return getData().GetDane() + " " + getCzasRozpoczecia().GetDane() +" - "+ getCzasZakonczenia().GetDane();
    }

    @Override
    public double CzasTrwaniaWydarzeniaWGodzinach() {
        double czas = CzasZakonczenia.getGodzina() - CzasRozpoczecia.getGodzina() ;
        if(getCzasRozpoczecia().getMinuta()< CzasZakonczenia.getMinuta())
        {
            czas += (CzasZakonczenia.getMinuta() - getCzasRozpoczecia().getMinuta())/60;
        }
        else
        {
            czas -= (getCzasRozpoczecia().getMinuta() - getCzasZakonczenia().getMinuta())/60;
        }
        return czas;
    }
}
