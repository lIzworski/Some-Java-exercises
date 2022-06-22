package cw22;

import administracja.Rekrutacja;

public class Cw22 {
    public static void main (String[]args)
    {

        Rekrutacja.DodajOsobe("Adam", "Sandler", 1,false);
        Rekrutacja.DodajOsobe("Henryk", "Knot", 2,false);
        Rekrutacja.DodajOsobe("Anna", "Konieczna", 3,false);
        Rekrutacja.DodajOsobe("Jakub", "Oswald", 4,false);
        Rekrutacja.DodajOsobe("Tomasz", "Jaki", 5,false);
        System.out.println("\nStudenci");
        Rekrutacja.WyswietlStudentow();

        Rekrutacja.DodajOsobe("Patryk", "Kojot", 1,true);
        Rekrutacja.DodajOsobe("Witold", "Kościuszko", 2,true);
        System.out.println("\nWykładowcy");
        Rekrutacja.WyswietlWykladowcow();
    }
}
