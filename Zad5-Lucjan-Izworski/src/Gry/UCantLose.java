package Gry;

import java.util.Random;
import java.util.Scanner;

public class UCantLose extends Gra {
    //pola
    private double start = 1;
    String LGBTRtvEuroAGD[] = new String[15];
    private int wygenerowanaLiczba;

    //Getry i swetry

    public int getWygenerowanaLiczba() {
        return wygenerowanaLiczba;
    }

    public void setWygenerowanaLiczba(int wygenerowanaLiczba) {
        this.wygenerowanaLiczba = wygenerowanaLiczba;
    }


    @Override
    public String PodajTytul() {
        return "U Cant Lose";
    }

    @Override
    public String PodajInstrukcje() {
        Scanner scan = new Scanner(System.in);
        String instrukcja = scan.nextLine();
        return instrukcja;
    }

    @Override
    public void PoruszanieSie() {
        switch (PodajInstrukcje()) {
            case "w" -> AkcjaW();
            case "s" -> AkcjaS();
            case "a" -> AkcjaA();
            case "d" -> AkcjaD();
            case "x" -> WrocDoMenu();
            case "W" -> AkcjaW();
            case "S" -> AkcjaS();
            case "A" -> AkcjaA();
            case "D" -> AkcjaD();
            case "X" -> WrocDoMenu();
            default -> System.out.println("");
        }
    }

    @Override
    public void PokazSterowanie() {
        System.out.println(" W  ->  Dodaj 2.");
        System.out.println(" S  ->  Odejmij 3.");
        System.out.println(" A  ->  Pomnóż przez 2.");
        System.out.println(" D  ->  Podziel przez 2.");
        System.out.println(" X  ->  Wróc do menu.");
    }

    @Override
    public void AkcjaW() {
        start += 2;
        IloscRuchow();
        System.out.println("Dodajesz 2, twój wynik to : "+start+"\nIlosc ruchów : "+ getIloscRuchow());
        WyswietlPocieszenie();

        System.out.println(wygenerowanaLiczba);
    }

    @Override
    public void AkcjaS() {
        start -= 3;
        IloscRuchow();
        System.out.println("odejmujesz 3, twój wynik to : "+start+"\nIlosc ruchów : "+ getIloscRuchow());
        WyswietlPocieszenie();
    }

    @Override
    public void AkcjaA() {
        start *= 2;
        IloscRuchow();
        System.out.println("Mnożysz przez 2, twój wynik to : "+start+"\nIlosc ruchów : "+ getIloscRuchow());
        WyswietlPocieszenie();
    }

    @Override
    public void AkcjaD() {
        start /= 2;
        IloscRuchow();
        System.out.println("Dzielisz przez 2, twój wynik to : "+start+"\nIlosc ruchów : "+ getIloscRuchow());
        WyswietlPocieszenie();
    }

    @Override
    public void Cel() {
        System.out.println("Gdy uda ci się wygrać tą grę, dostaniesz milion zł. Powodzenia !\n");
        System.out.println("Zaczynasz od liczby : "+ start);
    }

    public void GeneratorLiczbLosowych(){
        Random generator = new Random();
        setWygenerowanaLiczba(generator.nextInt(13));
    }
    public void TablicaPocieszen(){
        LGBTRtvEuroAGD[0] = "Jesteś świetny, świetnie ci idzie już prawie wygrałeś ! ";
        LGBTRtvEuroAGD[1] = "No no ! nieźle, już pewnie zaraz koniec";
        LGBTRtvEuroAGD[2] = "Wygrana jest już prawie twoja !";
        LGBTRtvEuroAGD[3] = "Myślałeś już co zrobisz z tym milionem ? Gdy juz wygrasz gre pod tytułem U Can't Lose( and win ) ?";
        LGBTRtvEuroAGD[4] = "Ho Ho Ho, niezły jesteś ! Jak ty to robisz ?";
        LGBTRtvEuroAGD[5] = "Niesamowitę, aż miło patrzeć ! świetnie ci idzie.";
        LGBTRtvEuroAGD[6] = "Chyba powinienieś zostać wpisany do księgi Rekordów Guinessa - świetnie ci idzie.";
        LGBTRtvEuroAGD[7] = "Skąd ty to wiesz ? Napewno zaraz wygrasz ! Graj dalej.";
        LGBTRtvEuroAGD[8] = "Ta gra jest świetna, prawda ? Chyba dawno ci tak dobrze nieszło, w jakiejś grze.";
        LGBTRtvEuroAGD[10] = "Normalnie masakra, jak ty to robisz.";
        LGBTRtvEuroAGD[11] = "Chyba mamy tu zawodowca !.";
        LGBTRtvEuroAGD[12] = "Widać że w szkole miałeś same dobre oceny.";

    }
    public void WyswietlPocieszenie(){
        GeneratorLiczbLosowych();
        TablicaPocieszen();
        System.out.println(LGBTRtvEuroAGD[getWygenerowanaLiczba()]);
    }
    @Override
    public void Zasady() {
        //W tej grze nie ma zasad, bo gdyby były mógł byś przegrać albo wygrać.
    }

    @Override
    public int IloscRuchow() {
        setIloscRuchow(getIloscRuchow()+1);
        return 0;
    }
    public void WrocDoMenu(){
        start = 1;
        setIloscRuchow(0);
        CoDalej();
    }
    @Override
    public void Pozegnanie() {
        System.out.println("Kończysz gre");
        System.exit(0);
    }
}
