import administracja.*;
import uczelnia.*;

public class Cw44 {

    public static void main(String[] args) {
	// write your code here
        Rekrutacja.DodajOsobe("Adam", "Sandler", 1, false);
        Rekrutacja.DodajOsobe("Senryk", "Knot", 2, false);
        Rekrutacja.DodajOsobe("Anna", "Konieczna", 3, false);
        Rekrutacja.DodajOsobe("Jakub", "Oswald", 4, false);
        Rekrutacja.DodajOsobe("Tomasz", "Jaki", 5, false);
        System.out.println("Studenci:");
        Rekrutacja.WyswietlStudentow();

        Rekrutacja.DodajOsobe("Patryk", "Kojot", 1, true);
        Rekrutacja.DodajOsobe("Witold", "Kosciuszko", 2, true);
        System.out.println("\nWykladowcy:");
        Rekrutacja.WyswietlWykladowcow();

        Dydaktyka.DodajKurs("Programowanie", 40, 30, Rekrutacja.Wykladowcy[1], new Student[] {Rekrutacja.Studenci[0], Rekrutacja.Studenci[1], Rekrutacja.Studenci[2]});
        Dydaktyka.DodajKurs("Bazy danych", 60, 30, Rekrutacja.Wykladowcy[1], new Student[] {Rekrutacja.Studenci[0], Rekrutacja.Studenci[1], Rekrutacja.Studenci[2]});
        Dydaktyka.DodajWyklad(Dydaktyka.Kursy[0], 25, new Student[] {Rekrutacja.Studenci[0], Rekrutacja.Studenci[1], Rekrutacja.Studenci[2]});
        Dydaktyka.DodajWyklad(Dydaktyka.Kursy[0], 10, new Student[] {Rekrutacja.Studenci[0], Rekrutacja.Studenci[1]});

        Dydaktyka.WypelnijWyniki();
        Dydaktyka.WypiszWyniki();
        System.out.println();

        IT.WypelnijStudentow();
        IT.WypiszStudentow();
        IT.Studenci.remove(Rekrutacja.Studenci[2]);
        System.out.println();
        IT.WypiszStudentow();
        IT.StudenciPoImieniu();
        IT.WypelnijKursy();
        IT.WypiszKursy();
        IT.WypiszZaDlugieKursy();
        IT.WypelnijWyklady();
        IT.WypiszWyklady();
        IT.WypiszZaDlugieWyklady();
        IT.WypelnijWykladowcow();
        IT.Wyklady.remove(Dydaktyka.Wyklady[1]);
        IT.Wykladowcy.remove(Rekrutacja.Wykladowcy[0]);
    }
}
