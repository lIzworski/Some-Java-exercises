package Gry;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class Uciekaj extends Gra implements IGraPowtarzalna {
    private int gospodarzIleKrokowZaToba = 10;
    private int przeszkoda = 0;
    private int ktoreKonczyny = 0;
    private int lewa  = 0;
    private int prawa = 1;
    private int ostatniruch = 0;
    private int poprzedniruch = 1;
    private int wygenerowanaliczbaa;

    public int getWygenerowanaliczbaa() {
        return wygenerowanaliczbaa;
    }

    public void setWygenerowanaliczbaa(int wygenerowanaliczbaa) {
        this.wygenerowanaliczbaa = wygenerowanaliczbaa;
    }

    public void PrzeszkodaWspinaszSię(){
        if(getWygenerowanaliczbaa()== 13 || getWygenerowanaliczbaa() == 7 || getWygenerowanaliczbaa() == 2){
            System.out.println("Zacznij się wspinać !");
            przeszkoda = 1;
        }
    }
    public void PrzeszkodaBiegniesz(){
        if(getWygenerowanaliczbaa()== 1 || getWygenerowanaliczbaa() == 8 || getWygenerowanaliczbaa() == 19){
            System.out.println("Biegnij !");
            przeszkoda = 0;
        }
    }

    @Override
    public void AkcjaW() {
        ktoreKonczyny = 1;
        System.out.println("Korzystasz z dłoni.");
    }

    @Override
    public void AkcjaS() {
        ktoreKonczyny = 0;
        System.out.println("Korzystasz z nóg");
    }

    @Override
    public void AkcjaA() {

        if(ktoreKonczyny == 0 && przeszkoda == 0 ){
            if(ostatniruch == prawa){
                if (gospodarzIleKrokowZaToba >70){
                    Uciekles();
                }
                else{
                    System.out.println("krok lewą nogą");
                    ostatniruch = lewa;
                    gospodarzIleKrokowZaToba += 1;
                    setIloscRuchow(getIloscRuchow()+1);
                    JakDalekoGospodarz();
                    GeneratorLiczbLosowych();
                    PrzeszkodaWspinaszSię();
                    PrzeszkodaBiegniesz();
                }
            }
            else {
                if(gospodarzIleKrokowZaToba> 0){
                    System.out.println("Nie możesz zrobić kolejnego kroku tą samą nogą.");
                    gospodarzIleKrokowZaToba -= 4;
                    JakDalekoGospodarz();
                }
                if(gospodarzIleKrokowZaToba< 0){
                    PoinformujOPorazce();
                }
            }
        }
        else if (ktoreKonczyny == 1 && przeszkoda == 1 ){
            if(ostatniruch == prawa){
                if (gospodarzIleKrokowZaToba >70){
                    Uciekles();
                }
                else{
                    System.out.println("podciągasz się lewą reką");
                    ostatniruch = lewa;
                    gospodarzIleKrokowZaToba += 1;
                    setIloscRuchow(getIloscRuchow()+1);
                    JakDalekoGospodarz();
                    GeneratorLiczbLosowych();
                    PrzeszkodaWspinaszSię();
                    PrzeszkodaBiegniesz();
                }
            }
            else{
                if(gospodarzIleKrokowZaToba>0){
                    System.out.println("Nie możesz podciągnąć się dwa razy tą samą ręką.");
                    gospodarzIleKrokowZaToba -= 4;
                    JakDalekoGospodarz();
                }
                if(gospodarzIleKrokowZaToba< 0){
                    PoinformujOPorazce();
                }
            }
        }
        else {
            if(przeszkoda == 0){
                if(gospodarzIleKrokowZaToba > 0){
                    System.out.println("Muszisz biec nogami a nie machać rękami !");
                    gospodarzIleKrokowZaToba -= 4;
                    JakDalekoGospodarz();
                }
                if(gospodarzIleKrokowZaToba< 0){
                    PoinformujOPorazce();
                }
            }
            else if(przeszkoda == 1){
                if(gospodarzIleKrokowZaToba > 0){
                    System.out.println("Musisz przestać biec i zacząć się wspinać");
                    gospodarzIleKrokowZaToba -= 4;
                    JakDalekoGospodarz();
                }
                if(gospodarzIleKrokowZaToba< 0){
                    PoinformujOPorazce();
                }
            }
        }
    }
    public void Uciekles(){
        System.out.println("\n\nUff, mało brakowało a skończył byś jako obiad gospodarza. udało ci się uciec. Gratuluje.\n");
        CoDalej();
    }
    @Override
    public void AkcjaD() {

        if(ktoreKonczyny == 0 && przeszkoda == 0) {
            if(ostatniruch == lewa){
                if (gospodarzIleKrokowZaToba >70){
                    Uciekles();
                    setIloscRuchow(getIloscRuchow()+1);
                }
                else{
                    System.out.println("krok prawą nogą");
                    ostatniruch = prawa;
                    gospodarzIleKrokowZaToba += 1;
                    setIloscRuchow(getIloscRuchow()+1);
                    JakDalekoGospodarz();
                    GeneratorLiczbLosowych();
                    PrzeszkodaWspinaszSię();
                    PrzeszkodaBiegniesz();
                }
            }
            else {
                if(gospodarzIleKrokowZaToba> 0){
                    System.out.println("Nie możesz zrobić kolejnego kroku tą samą nogą.");
                    gospodarzIleKrokowZaToba -= 4;
                    JakDalekoGospodarz();
                }
                if(gospodarzIleKrokowZaToba< 0){
                    PoinformujOPorazce();
                }
            }
        }

        else if (ktoreKonczyny == 1 && przeszkoda == 1 ){
            if(ostatniruch == lewa){
                if (gospodarzIleKrokowZaToba >70){
                    Uciekles();
                    setIloscRuchow(getIloscRuchow()+1);
                }
                else {
                    System.out.println("podciągasz się prawą reką");
                    ostatniruch = prawa;
                    gospodarzIleKrokowZaToba += 1;
                    setIloscRuchow(getIloscRuchow()+1);
                    JakDalekoGospodarz();
                    GeneratorLiczbLosowych();
                    PrzeszkodaWspinaszSię();
                    PrzeszkodaBiegniesz();
                }

            }
            else{
                if(gospodarzIleKrokowZaToba> 0){
                    System.out.println("Nie możesz podciągnąć się dwa razy tą samą ręką.");
                    gospodarzIleKrokowZaToba -= 4;
                    JakDalekoGospodarz();
                }
                if(gospodarzIleKrokowZaToba< 0){
                    PoinformujOPorazce();
                }
            }
        }
        else {
            if(przeszkoda == 0){
                if(gospodarzIleKrokowZaToba>0){
                    System.out.println("Muszisz biec nogami a nie machać rękami !");
                    gospodarzIleKrokowZaToba -= 4;
                    JakDalekoGospodarz();
                }
                if(gospodarzIleKrokowZaToba< 0){
                    PoinformujOPorazce();
                }
            }
            else if(przeszkoda == 1){
                if(gospodarzIleKrokowZaToba>0){
                    System.out.println("Musisz przestać biec i zacząć się wspinać");
                    gospodarzIleKrokowZaToba -= 4;
                    JakDalekoGospodarz();
                }
                if(gospodarzIleKrokowZaToba< 0){
                    PoinformujOPorazce();
                }
            }
        }
    }

    @Override
    public String PodajTytul() {
        return "Kurcze, uciekaj";
    }

    private void JakDalekoGospodarz(){
        if(gospodarzIleKrokowZaToba>0){
            System.out.println("Gospodarz jest za tobą "+ gospodarzIleKrokowZaToba + " kroków.\n");
        }
        else if(gospodarzIleKrokowZaToba<0){
            System.out.println("Gospodarz jest za tobą, nie dasz rady już uciec. \n");
        }

    }
    @Override
    public void Zasady() {

        //biegniesz
        if(przeszkoda == 0 && ktoreKonczyny == 0){

        }
        //wspinasz sie
        if(przeszkoda == 1 && ktoreKonczyny == 1){

        }
    }

    @Override
    public void Cel() {
        System.out.println("\nKurczaku ! Uciekaj ! W grze kontrolujesz ręce i nogi. Jesteś dziwnym kurczakiem z dłońmi !");
        System.out.println("Prawdopodobnie rzecz dzieje się w Czarnobylu, ale tak naprawdę nikt tego nie wie.");
        System.out.println("Cały czas uciekasz, więc nie miałem czasu zapytać.");
        System.out.println("Goni cie gospodarz, chce zrobić z ciebie smaczny rosół - jest 10 kroków za tobą !\n");
        System.out.println("Kurczaku, pamiętaj ! najpierw prawa noga potem lewa, to samo z rękami !");
        System.out.println("Gdy gra mówi wspinaj się, zacznij używać rąk !");
        System.out.println("Gdt gra mówi biegnij, zacznij używac nóg!");
    }
    public void GeneratorLiczbLosowych(){
        Random generator = new Random();
        setWygenerowanaliczbaa(generator.nextInt(20));
    }
    @Override
    public String PodajInstrukcje() {
        Scanner scan = new Scanner(System.in);
        String instrukcja = scan.nextLine();
        return instrukcja;
    }

    @Override
    public void PokazSterowanie() {
        System.out.println("\n Klawiszem 'A' sterujesz lewą nogą, oraz lewą dłonią.");
        System.out.println(" Klawiszem 'D' sterujesz prawą nogą, oraz prawą dłonią.");
        System.out.println(" Klawiszem 'W' zaczynasz korzystać z rąk.");
        System.out.println(" Klawiszem 'S' zaczynasz korzystać z dłoni.\n");
    }

    @Override
    public int IloscRuchow() {
        return 0;
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
    public void Pozegnanie() {
        System.out.println("Kończysz gre");
        System.exit(0);
    }

    @Override
    public void PoinformujOPorazce() {
        System.out.println("\n\nDałeś się złapać gospodarzowi, zrobi z ciebie smaczny rosół. \n\n");
        CoDalej();
    }

    @Override
    public void ZresetujGre() {
        EXIT = true;
        gospodarzIleKrokowZaToba = 10;
        przeszkoda = 0;
        ktoreKonczyny = 0;
        lewa  = 0;
        prawa = 1;
        ostatniruch = 0;
        poprzedniruch = 1;
    }
}
