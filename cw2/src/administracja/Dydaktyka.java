package administracja;

import uczelnia.Kurs;
import uczelnia.Student;
import uczelnia.Wyklad;
import uczelnia.Wykladowca;

public class Dydaktyka {
    public static Kurs[] Kursy;
    public static Wyklad[] Wyklady;
    public static int IloscKursow;
    public static int IloscWykladow;
    static
    {
        IloscKursow = 0;
        IloscWykladow = 0;
        Kursy = new Kurs[10];
        Wyklady = new Wyklad[10];
    }
    public static <iloscGodzin, minGodzin> void DodajKurs(String nazwa, int Godzin,  int minGodzin, Wykladowca wykladowca, Student[]uczestnicy)
    {
        Kursy[IloscKursow] = new Kurs(nazwa, Godzin, minGodzin, wykladowca);
        Kursy[IloscKursow].setUczestnicy(uczestnicy);
        IloscKursow++;
    }
    public static <iloscGodzin, minGodzin> void DodajWyklad(Kurs kurs, int CzasTrwania, Student[]uczestnicy)
    {
        Wyklady[IloscWykladow] = new Wyklad(kurs, CzasTrwania, uczestnicy);
        IloscWykladow++;
    }
}
