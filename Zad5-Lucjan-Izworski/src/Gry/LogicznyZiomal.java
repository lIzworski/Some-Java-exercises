package Gry;

import java.util.Random;
import java.util.Scanner;

public class LogicznyZiomal extends Gra implements IGraPowtarzalna {



    private int[][]tablica2d= new int [15][15];
    private int x = 8;
    private int y = 8;
    private int WygenerowanaLiczba;


    public int getWygenerowanaLiczba() {
        return WygenerowanaLiczba;
    }

    public void setWygenerowanaLiczba(int wygenerowanaLiczba) {
        WygenerowanaLiczba = wygenerowanaLiczba;
    }

    public void TablicaWielowymiarowa(){
        for(int i =1; i< tablica2d.length; i++){
            for (int j =1; j< tablica2d[i].length; j++){
                tablica2d[i][j] = i * j;
            }
        }
    }
    public void WyswietlTablice(){

        for (int i=1; i<=15; i++)
        {
            for (int j=1; j<=15; j++)
            {
                int a = i*j;
                System.out.printf("%4d", a);
            }
            System.out.println();
        }
    }
    public void TwojaPozycja(){

        System.out.println("Stoisz na liczbie : "+tablica2d[x][y] +" ( "+ x+" * "+y+" )");
    }
    public void Wygrywasz(){

    }
    @Override
    public void AkcjaW() {
        if(y == 1 ){
            Zwyciestwo();
        }
        else{
            y=y-1;
            TwojaPozycja();
            IloscRuchow();
            //PokazSterowanie();
        }

    }

    @Override
    public void AkcjaS() {
        if(y == 15 ) {
            Zwyciestwo();
        }
        else{
            y = y + 1;
            TwojaPozycja();
            IloscRuchow();
            //PokazSterowanie();
        }

    }

    @Override
    public void AkcjaA() {
        if(x == 1){
            Zwyciestwo();
        }
        else {
            x=x-1;
            TwojaPozycja();
            IloscRuchow();
            //PokazSterowanie();
        }
    }

    @Override
    public void AkcjaD() {
        if(x == 15){
            Zwyciestwo();
        }
        else {
            x=x+1;
            TwojaPozycja();
            IloscRuchow();
            //PokazSterowanie();
        }
    }

    @Override
    public String PodajTytul() {
        return "Logiczny Ziomal";
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
    public String PodajInstrukcje() {
        WyswietlWygenerowanąLiczbeIjąoddajDoSwitcha();
        Scanner scan = new Scanner(System.in);
        String instrukcja = scan.nextLine();
        return instrukcja;
    }

    @Override
    public void PoinformujOPorazce() {
        System.out.println("Niestety nie udało ci się dostać do granicy tabeli liczb.");
        if(getIloscRuchow() == 1){
            System.out.println("Poległeś po "+getIloscRuchow()+ " ruchu");
        }
        else{
            System.out.println("Poległeś po "+getIloscRuchow()+ " ruchach");
        }
        EXIT = false;
        ZresetujGre();
        CoDalej();
    }
    public void Zwyciestwo(){
        System.out.println("Brawo\nUdało ci sie przekroczyć granice tabeli.");
        CoDalej();
    }
    public void GeneratorLiczbLosowych(){
        Random generator = new Random();
        setWygenerowanaLiczba(generator.nextInt(4));
    }
    public void WyswietlWygenerowanąLiczbeIjąoddajDoSwitcha(){
        GeneratorLiczbLosowych();
        if(getWygenerowanaLiczba()==0){
            System.out.println("kolejna liczba musi być podzielna 2");
        }
        if(getWygenerowanaLiczba()==1){
            System.out.println("kolejna liczba musi być podzielna 3");
        }
        if(getWygenerowanaLiczba()==2){
            System.out.println("kolejna liczba musi być podzielna 2 lub 6");
        }
        if(getWygenerowanaLiczba()==3){
            System.out.println("kolejna liczba musi być podzielna 3 lub 4");
        }
    }

    public void PodzielnePrzez2(){
        if(((x*y)%2)==0){}
        else{
            PoinformujOPorazce();
            EXIT = false;
        }
    }
    public void PodzielnePrzez3(){
        if(((x*y)%3)==0){}
        else{
            PoinformujOPorazce();
            EXIT = false;
        }
    }
    public void PodzielnePrzez2i6(){
        if((((x*y)%2)|((x*y)%6) )==0){}
        else{
            PoinformujOPorazce();
            EXIT = false;
        }
    }
    public void PodzielnePrzez3i4(){
        if((((x*y)%3)|((x*y)%4) )==0){}
        else{
            PoinformujOPorazce();
            EXIT = false;
        }
    }

    @Override
    public void Zasady() {

        switch (getWygenerowanaLiczba()){
            case 0 -> PodzielnePrzez2();

            case 1 -> PodzielnePrzez3();

            case 2 -> PodzielnePrzez2i6();

            case 3 -> PodzielnePrzez3i4();
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
    public void Cel() {
        System.out.println("\nZnajdujesz się na pozycji 8 x 8. Utknołeś w wymiarze liczb, aby się wydostać podążaj");
        System.out.println("za wskazówkami. Twoim celem jest dostać się do granicy tabeli.\n");
        TablicaWielowymiarowa();
        WyswietlTablice();
        System.out.println("");
        TwojaPozycja();

    }

    @Override
    public int IloscRuchow() {
        setIloscRuchow(getIloscRuchow()+1);
        return 0;
    }

    @Override
    public void ZresetujGre() {
        EXIT =true;
        x = 8;
        y = 8;
        setIloscRuchow(0);
    }
    @Override
    public void Pozegnanie() {
        System.out.println("Kończysz gre");
        System.exit(0);
    }
}
