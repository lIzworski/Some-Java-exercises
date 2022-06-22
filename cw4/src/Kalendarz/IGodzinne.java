package Kalendarz;

import pomoce.*;

public interface IGodzinne
{
    public Data getData();
    public Czas getCzasRozpoczecia();
    public Czas getCzasZakonczenia();
    public boolean CzySieNaklada(IGodzinne godzinne);
}
