package Gry;

import java.util.Scanner;

public abstract class Gra {
    //Pola klasy
    private String Tytul;
    private int iloscRuchow = 0;
    private int x = 0;
    private int y = 0;
    protected boolean EXIT = true;
    // Konstruktory
    public Gra(){
        this.Tytul = PodajTytul();
    }
    // Getery
    public int getIloscRuchow() {
        return iloscRuchow;
    }

    public String getTytul() {
        return Tytul;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    //Settery

    public void setIloscRuchow(int iloscRuchow) {
        this.iloscRuchow = iloscRuchow;
    }

    public int setX(int x) {
        this.x = x;
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Metody abstrakcyjne
    public abstract  void AkcjaS();
    public abstract  void AkcjaW();
    public abstract  void AkcjaA();
    public abstract  void AkcjaD();
    public abstract String PodajTytul();
    public abstract String PodajInstrukcje();
    public abstract void Zasady();
    public abstract void PoruszanieSie();
    public abstract void PokazSterowanie();
    public abstract void Cel();
    public abstract int IloscRuchow();
    public abstract void Pozegnanie();
    //Metody
    public String MenuWybor(){
        Scanner scan = new Scanner(System.in);
        String instrukcja = scan.nextLine();
        return instrukcja;
    }
    public void CoDalej(){
        System.out.println("Zakończyłeś gre, co chcesz robić dalej ?");
        System.out.println("1 - Zakończ gre i wróć do głownego menu wyboru gier");
        System.out.println("2 - Zagraj jeszcze raz");
        System.out.println("3 - Zamknij gre całkowicie");
        switch (MenuWybor()){
            case "1":
                Start s2 = new Start();
                s2.WybierzGre();
                break;
            case "2":
                Graj();
                break;
            case "3":
                Pozegnanie();
                break;
        }
    }
    public void Graj(){
        System.out.println(getTytul());
        System.out.println("");
        PokazSterowanie();
        Cel();
        while(EXIT==true){
            PoruszanieSie();
            Zasady();
        }
    }
}

