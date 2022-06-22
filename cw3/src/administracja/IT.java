package administracja;

import uczelnia.Kurs;
import uczelnia.Student;
import uczelnia.Wyklad;
import uczelnia.Wykladowca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IT {
    public static List<Student> Studenci;
    public static List<Kurs> Kursy;
    public static List<Wyklad> Wyklady;
    public static List<Wykladowca> Wykladowcy;
    static {
        Studenci = new ArrayList<>();
        Kursy = new ArrayList<>();
        Wyklady = new ArrayList<>();
        Wykladowcy = new ArrayList<>();
    }
    public static void WypelnijStudentow()
    {
        for(int i = 0; i < Rekrutacja.IloscStudentow; i++)
        {
            Studenci.add(Rekrutacja.Studenci[i]);
        }
    }
    public static void WypiszStudentow()
    {
        for (Kurs kurs : Kursy)
        {
            System.out.println(kurs.GetDane());
        }
    }
    public static void WypiszKursy()
    {
        for (Kurs kurs : Kursy)
        {
            System.out.println(kurs.GetDane());
        }
    }
    public static void WypelnijKursy()
    {
        for(int i = 0; i < Dydaktyka.IloscKursow; i++)
        {
            Kursy.add(Dydaktyka.Kursy[i]);
        }
    }
    public static void WypiszWyklady()
    {
        for (Wyklad wyklad : Wyklady)
        {
            System.out.println(wyklad.getCzasTrwania());
        }
    }
    public static void WypelnijWyklady()
    {
        for(int i = 0; i < Dydaktyka.IloscWykladow; i++)
        {
            Wyklady.add(Dydaktyka.Wyklady[i]);
        }
    }
    public static void WypiszWykladowcow()
    {
        for (Wykladowca wykladowca : Wykladowcy)
        {
            System.out.println(wykladowca.GetDane());
        }
    }
    public static void WypelnijWykladowcow()
    {
        for(int i = 0; i < Rekrutacja.IloscWykladowcow; i++)
        {
            Wykladowcy.add(Rekrutacja.Wykladowcy[i]);
        }
    }
    public static void StudenciPoImieniu()
    {
        Studenci.sort(Comparator.comparing(Student::getImie));
    }
    public static void WypiszWykladyWykladowcy(String nazwisko)
    {
        //Wykladowcy.stream().filter(item -> item.getNazwisko().equals(nazwisko)).toList().indexOf(0);
        System.out.println("Wyklady wykladowcy o nazwisko" + nazwisko);
        for (Wyklad wyklad : Wyklady.stream().filter(item -> item.getKurs().getWykladowca().getNazwisko().equals(nazwisko)).toList())
        {
            System.out.println("Wypisujemy dane wykladu" + wyklad.getKurs().getNazwa() + " " + wyklad.getCzasTrwania() + "h");
        }
    }
    public static void WypiszZaDlugieKursy()
    {
        System.out.println("Za dlugie kursy");
        for (Kurs kurs : Kursy.stream().filter(item -> item.getGodzin() > 50).toList())
        {
            System.out.println(kurs.getNazwa());
        }
    }
    public static void WypiszZaDlugieWyklady()
    {
        System.out.println("Za dlugie wyklady");
        for (Wyklad wyklad : Wyklady.stream().filter(item -> item.getCzasTrwania() > 50).toList())
        {
            System.out.println(wyklad.getKurs().getNazwa() + " "+wyklad.getCzasTrwania());
        }
    }

}
