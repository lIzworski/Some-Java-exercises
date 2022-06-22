import java.util.Comparator;
import java.util.Iterator;

public class Start {
    public static void main(String[]args){
        Towar hammer = new Towar(1,"hammer",30);
        Towar motyka = new Towar(2,"motyka",34);
        Towar kij    = new Towar(3,"Kij"   ,4 );
        Klient lucek = new Klient(1,"Lucjan","Izworski");
        Klient jacek = new Klient(2,"Jacek","Brzydkotwarzy");
        Klient wojtek = new Klient(3,"Wojtek","Plum");


        Sklep s1 = new Sklep();
        //Dodaj Towar
        s1.DodajTowar(hammer,0);
        s1.DodajTowar(motyka,0);
        s1.DodajTowar(hammer,3);
        s1.DodajTowar(kij,0);
        //Dodaj Klientów
        s1.DodajKlienta(lucek);
        s1.DodajKlienta(jacek);
        s1.DodajKlienta(wojtek);

        //Dodaj transakcje
        try {
            s1.DodajTransakcje(new Transakcja(1, hammer, lucek, 15));
            s1.DodajTransakcje(new Transakcja(2, hammer, lucek, 13));
            s1.DodajTransakcje(new Transakcja(3, motyka, jacek, 13));
            s1.DodajTransakcje(new Transakcja(4, kij, jacek, 2));
            s1.DodajTransakcje(new Transakcja(4, kij, wojtek, 1));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        for (Klient klient : s1.getListaKlient()) {
            System.out.println(klient.getImie());
        }

        for (Towar towar : s1.getListaTowar()) {
            System.out.println(towar.getNazwa());
        }

        for (Transakcja transakcja : s1.getListaTransakcja()) {
            System.out.println(transakcja.getIlosc());
        }

        s1.getListaTowar().sort(Comparator.comparing(Towar::getNazwa));
        s1.getListaKlient().sort(Comparator.comparing(Klient::getNazwisko));
        s1.getListaTransakcja().sort(Comparator.comparing(Transakcja::getIlosc));

        System.out.println("\nPosortowane");
        for (Klient klient : s1.getListaKlient()) {
            System.out.println(klient.getNazwisko());
        }

        System.out.println("\nPosortowane");
        for (Towar towar : s1.getListaTowar()) {
            System.out.println(towar.getNazwa());
        }

        System.out.println("\nPosortowane");
        for (Transakcja transakcja : s1.getListaTransakcja()) {
            System.out.println(transakcja.getIlosc());
        }

        System.out.println("\nTowary które sprzedały się w minimum 50%: \n");
        for (Towar towar : s1.getListaTowar()) {
            int Suma = 0;
            for (Transakcja transakcja : s1.getListaTransakcja()) {
                if(transakcja.getTowar().getNazwa().equals(towar.getNazwa())){
                    Suma = transakcja.getIlosc() + Suma;
                    if(Suma >= towar.getIlosc()/2 ) {
                        System.out.println(towar.getNazwa());
                    }
                }
            }
        }
        s1.PosortujListyTowarowPoNazwie();
    }
}
