package kalendarz;

import pomoce.*;
import pomoce.Czasowa;

public interface Igodzinne {
    public Data getData();
    public Czas  getCzasRozpoczecia();
    public Czas getCzasZakonczenia();
    public boolean CzySieNaklada(Igodzinne godzinne);
}
