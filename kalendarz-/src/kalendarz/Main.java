package kalendarz;

import pomoce.Czas;
import pomoce.Czasowa;
import pomoce.Data;
import pomoce.DataCzas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Czasowa> czasy = new ArrayList<>();
        czasy.add(new Czas(5,10));
        czasy.add(new Data(1999,8,15));
        czasy.add(new DataCzas(2001,9,10,15,11));

        for (Czasowa czasowa: czasy) {
            System.out.println(czasowa.GetDane());
        }

        Kalendarz kalendarz = new Kalendarz("Kalendarz pracownika");

        kalendarz.getWydarzenia().add(new WydarzenieJednodniowe("Konsultacje", new Data(2022,1,1)));
        kalendarz.getWydarzenia().add(new WydarzenieJednodniowe("Konsultacje 2", new Data(2022,1,1)));
        kalendarz.getWydarzenia().add(new WydarzenieJednodniowe("Negocjacje", new Data(2022,1,11)));

        kalendarz.GetWydarzeniaZDnia(new Data(2022,1,10));
        System.out.println("");

        for (Wydarzenie c1 : kalendarz.GetWydarzeniaZDnia(new Data(2022, 1, 10)))
        {
            System.out.println("Nazwa: " + c1.getNazwa() + "\nCzas rozpoczecia: " + c1.CzasRozpoczecia().GetDane() +
                    "\nCzas zakonczenia: " + c1.CzasZakonczenia().GetDane());
        }

        System.out.println("");

        kalendarz.getWydarzenia().add(new WydarzenieJednodnioweGodzinne("Podpisanie umowy", new Data(2022, 1, 10) ,
                new Czas(8, 0), new Czas(10, 0)));
        kalendarz.getWydarzenia().add(new WydarzenieJednodnioweGodzinne("Podpisanie umowy", new Data(2022, 1, 10) ,
                new Czas(11, 0), new Czas(13, 0)));
        for (Wydarzenie c1 : kalendarz.GetWydarzeniaZDnia(new Data(2022, 1, 10)))
        {
            System.out.println("Nazwa: " + c1.getNazwa() + "\nCzas rozpoczecia: " + c1.CzasRozpoczecia().GetDane() +
                    "\nCzas zakonczenia: " + c1.CzasZakonczenia().GetDane());
        }

        Wydarzenie wydarzenie = kalendarz.getWydarzenia().get(3);
        Wydarzenie wydarzenie1 = kalendarz.getWydarzenia().get(4);
        //Sprawdzamy czy wydarfzenia są typu WydarzenieJednodnioweGodzinne
        if (wydarzenie instanceof WydarzenieJednodnioweGodzinne && wydarzenie1 instanceof  WydarzenieJednodnioweGodzinne){
            //rzutowanie
            Igodzinne wyd = (WydarzenieJednodnioweGodzinne) wydarzenie;
            Igodzinne wyd1 = (WydarzenieJednodnioweGodzinne) wydarzenie1;
            System.out.println(wyd.CzySieNaklada(wyd1));
        }




    }
}
