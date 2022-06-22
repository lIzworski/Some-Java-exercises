package cw8;
import uczelnia.*;

import java.util.ArrayList;
import java.util.List;

public class Cw8 {
    public static void main(String[] args) throws Exception {
        List<Czlowiek> listaOsob = new ArrayList<>();
        Ksiegowy ksiegowy = new Ksiegowy("Adam", "Hertz", "brak", 3500.2, null);
        ksiegowy.setKsiegowy(ksiegowy);
        listaOsob.add(ksiegowy);
        listaOsob.add(new StudentStacjonarny("Tomasz", "Nowak", "1"));
        listaOsob.add(new StudentNiestacjonarny("Kacper", "Nowy", "2"));
        listaOsob.add(new WykladowcaEtatowy("Programowanie w Java", "Adam", "Hetzner", "", 4500, ksiegowy));
        listaOsob.add(new WykladowcaZlecenie("test", "test", "test", "test", 1333, 123, ksiegowy));
        System.out.println("Wszystkie osoby: ");
        for (Czlowiek czlowiek : listaOsob) {
            System.out.println(czlowiek.GetDane());
        }

        System.out.println("Wypisywanie ksiegowych");
        for (Czlowiek c: listaOsob)
        {
            //if (c instanceof IKsiegowy)
            {
                IKsiegowy iKsiegowy = (IKsiegowy)c;
                iKsiegowy.WypiszKsiegowego();
                //((IKsiegowy) c).WypiszKsiegowego();
            }
        }

        WykladowcaZlecenie w = new WykladowcaZlecenie("Bazy danych", "Julian", "Knot", "brak", 30, 150, ksiegowy);

        //Mam czlowieka
        Czlowiek c = w;

        //Sprawdzam czy czlowiek jest Iksiegowy

        if(c instanceof IKsiegowy)
        {
            //Rzutuje czlowieka na Iksiegowy. Teraz bede mial obiekt typu IKsiegowy
            //Bede mogl korzystac z metod insterfejsu IKsiegowy
            IKsiegowy ik = (IKsiegowy)c;
            //ik to jest obiekt typu IKsiegowy
            ik.WypiszKsiegowego();
        }
    }

}
