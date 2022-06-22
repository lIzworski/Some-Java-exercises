package administracja;

import uczelnia.*;

public class Rekrutacja {
    private final static int MaxStudentow = 10;
    public static int IloscStudentow;
    public static int IloscWykladowcow;
    public static Wykladowca[] Wykladowcy;
    public static Student[] Studenci;
    public static double[] Oceny;

    static
    {
        IloscStudentow = 0;
        IloscWykladowcow = 0;
        Wykladowcy = new Wykladowca[MaxStudentow];
        Studenci = new Student[MaxStudentow];
        Oceny = new double[] {1, 2, 3, 3.5, 4, 4.5, 5, 5.5};
    }

    public static void DodajOsobe(String imie, String nazwisko, int numer, boolean czyWykladowaca)
    {
        if (czyWykladowaca)
        {
            Wykladowcy[IloscWykladowcow] = new Wykladowca(imie, nazwisko, numer+"");
            IloscWykladowcow++;
        }
        else
        {
            Studenci[IloscStudentow] = new Student(imie, nazwisko, numer + "");
            IloscStudentow++;
        }
    }
    public static void WyswietlStudentow()
    {
        for (Student e: Studenci)
        {
            if (e == null)
                continue;
            System.out.println(e.GetDane());
        }
    }
    public static void WyswietlWykladowcow()
    {
        for (int i = 0; i < IloscWykladowcow; i++)
        {
            System.out.println(Wykladowcy[i].GetDane());
        }
    }
}