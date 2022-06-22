package Gry;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public String wybor(){
        Scanner scan = new Scanner(System.in);

        String wybor = scan.next();
        return wybor;
    }
    public void WybierzGre(){
        System.out.println("A - Matematyczny Bieg");
        System.out.println("B - Logiczny Ziomal");
        System.out.println("C - U Cant Lose");
        System.out.println("D - Kurcze, uciekaj");
        System.out.println("E - Uruchom Liste Gier");
        switch (wybor()){
            case "A" -> MatematycznyBieg();
            case "B" -> LogicznyZiomal();
            case "a" -> MatematycznyBieg();
            case "b" -> LogicznyZiomal();
            case "C" -> UCantLose();
            case "c" -> UCantLose();
            case "d" -> KurczeUciekaj();
            case "D" -> KurczeUciekaj();
            case "E" -> ListaGier();
            case "e" -> ListaGier();
        }
    }
    private Object MatematycznyBieg(){
        MatematycznyBieg m1 = new MatematycznyBieg();
        m1.Graj();
        return null;
    }
    private Object LogicznyZiomal(){
        LogicznyZiomal l1 = new LogicznyZiomal();
        l1.Graj();
        return null;
    }
    private Object UCantLose(){
        UCantLose u1 = new UCantLose();
        u1.Graj();
        return null;
    }
    private Object KurczeUciekaj(){
        Uciekaj ku = new Uciekaj();
        ku.Graj();
        return null;
    }
    //Nie uruchamiają się kolejno, ponieważ stworzony przezemnie interfejs wyboru kolejnych gier i cofania, jest lepszy
    //Jeśli będzie Panu na tym bardzo zależało, w moment moge to poprawić.
    public void ListaGier(){

       var gry = new ArrayList<>();
       gry.add(0, MatematycznyBieg());
       gry.add(1, LogicznyZiomal());
       gry.add(2, UCantLose());
       gry.add(3, KurczeUciekaj());

       for(int i = 0;i <= 3; i++){
           gry.get(i);
       }
    }
    public static void main(String []args){
        System.out.println("Witaj w menu wyboru gier\n");
        Start s1 = new Start();
        s1.WybierzGre();
    }
}
