package Gry;

import java.util.Scanner;

import static java.lang.Math.abs;

public class MatematycznyBieg extends Gra implements IGraPowtarzalna {
    int iloscRuchow = 0;

    @Override
    public void AkcjaA() {
        setX(getX() -1);
        System.out.println("Skręcasz w lewo");
        System.out.println("Twoja aktualna pozycja to :  x = " + getX() +"  y = " + getY());
        IloscRuchow();
        //PokazSterowanie();
    }

    @Override
    public void AkcjaW() {
        setY(getY() +1);
        System.out.println("Biegniesz do góry");
        System.out.println("Twoja aktualna pozycja to :  x = " + getX() +"  y = " + getY());
        IloscRuchow();
        //PokazSterowanie();
    }

    @Override
    public void AkcjaS() {
        setY(getY() -1);
        System.out.println("Biegniesz w dół");
        System.out.println("Twoja aktualna pozycja to :  x = " + getX() +"  y = " + getY());
        IloscRuchow();
        //PokazSterowanie();
    }

    @Override
    public void AkcjaD() {
        setX(getX() +1);
        System.out.println("Skręcasz w prawo");
        System.out.println("Twoja aktualna pozycja to :  x = " + getX() +"  y = " + getY());
        IloscRuchow();
        //PokazSterowanie();
    }

    @Override
    public String PodajTytul() {
        return "Zboczony Romek (MatematycznyBieg) ";
    }

    @Override
    public String PodajInstrukcje() {
        Scanner scan = new Scanner(System.in);
        String instrukcja = scan.nextLine();
        return instrukcja;
    }


    @Override
    public void PoinformujOPorazce() {
        System.out.println("\nZakończyłeś gre, dałeś się złapać zboczonemu Romkowi\n");
        if(getIloscRuchow() == 1){
            System.out.println("Poruszyłeś się " +getIloscRuchow() + " raz, zanim cie dopadł.\n");
        }
        else{
            System.out.println("Poruszyłeś się " +getIloscRuchow() + " razy, zanim cie dopadł.\n");
        }

        EXIT = false;
        //Powinno automatycznie wedłóg zadania, ale tak jest wygodniej, bo można wrócić.
        ZresetujGre();
        CoDalej();
    }
    @Override
    public void Zasady(){
        // Jeśli oddaliłeś się od staru bardziej w pionie niż w poziomie przegrywasz
        if(abs(getX()) < abs(getY())){
            PoinformujOPorazce();
            ZresetujGre();
            EXIT = false;
        }
        else if(abs(getY()) == abs(getX()) ){
             if(getX() == 0 && getY() == 0){
                System.out.println("Nie idź do góry, ani w dół.");
             }
             if(getX() > 0 && getY() > 0){
                System.out.println("Nie idź do góry, ani w lewo.");
             }
             if(getX() > 0 && getY() < 0){
                System.out.println("Nie idź w dół, ani w lewo. ");
             }
             if(getX() < 0 && getY() > 0){
                System.out.println("Nie idź do góry, ani w prawo. ");
             }
             if(getX() < 0 && getY() < 0){
                System.out.println("Nie idź w dół, ani w prawo. ");
             }
        }
    }
    @Override
    public void PoruszanieSie() {
        switch (PodajInstrukcje()) {
            case "w" -> AkcjaW();
            case "s" -> AkcjaS();
            case "a" -> AkcjaA();
            case "d" -> AkcjaD();
            case "x" -> PoinformujOPorazce();
            case "W" -> AkcjaW();
            case "S" -> AkcjaS();
            case "A" -> AkcjaA();
            case "D" -> AkcjaD();
            case "X" -> PoinformujOPorazce();
            default -> System.out.println("");
        }
    }
    @Override
    public  void PokazSterowanie(){
        System.out.println("W grze sterujesz klawiszami  ( W metodach sterowania ta opcja została zakomentowana by nie wyświetlała się za każdym razem )  \n");
        System.out.println("         ^W   ");
        System.out.println("         |     ");
        System.out.println(" <-A           D->  ");
        System.out.println("         |     ");
        System.out.println("         vS   \n");
    }
    @Override
    public void Cel() {
        System.out.println("W tej grze, gracz porusza się po planszy, starając się uciec zboczonemu Romkowi. ");
        System.out.println("Gracz przegrywa jeśli, oddali się od pozycji startowej bardziej w pionie niż w poziomie.");
        System.out.println("Gra zaczyna się od momentu w którym jesteś w objeciach zboczonego Romka.");
        System.out.println("Możesz w pierwszym ruchu wyrwać sie mu spod ramion tylko wtedy gdy ucieksziesz w bok.");
        System.out.println("Uważaj na zboczonego Romka !");
        System.out.println("");
    }

    @Override
    public int IloscRuchow() {
        setIloscRuchow(getIloscRuchow()+1);
        return 0;
    }

    @Override
    public void Pozegnanie() {
        System.out.println("Kończysz gre");
        System.exit(0);
    }

    @Override
    public void ZresetujGre() {
        EXIT = true;
        setIloscRuchow(0);
        setX(0);
        setY(0);
    }

}
