

import java.util.Scanner;

public class Cw11 {

    static int numer = 1;
    static Scanner scanner = new Scanner(System.in);
    int id;

    String tekst;
    boolean czyPuste;
    int dlugosc;

    public Cw11()
    {
        id = numer;
        numer++;

        System.out.println("Podaj tekst");
        tekst = scanner.nextLine();
        if (tekst.length() == 0)
            czyPuste = true;
        else
            czyPuste = false;
        dlugosc = tekst.length();
    }

    public Cw11(String tekst)
    {
        id = numer;
        numer++;

        this.tekst = tekst;
        if (tekst.length() == 0)
            czyPuste = true;
        else
            czyPuste = false;
        dlugosc = tekst.length();
    }

    static void Zad2()
    {
        double a, b, c;
        a = 3;
        b = 2;
        System.out.println("a = " + a + " b = " + b);
        c = a + b;
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

    void Wypisz()
    {
        System.out.println("Id:: " + id + " Tekst: " + tekst + " CzyPuste: " + czyPuste + " dlugosc: " + dlugosc);
    }

    static void Zad4()
    {
        Cw11 jeden = new Cw11(), dwa = new Cw11();
        if (jeden.tekst.equals(dwa.tekst))
        {
            System.out.println("Teksty takie same");
        }
        else
        {
            System.out.println("Teksty sa inne");
        }
    }

    static void Zad5()
    {
        Cw11 jeden, dwa;
        jeden = new Cw11("1");
        for(int i = 1; i <= 30; i++){
            dwa = new Cw11(jeden.tekst + " - " + jeden.tekst.length());
            System.out.println(dwa.tekst);
            jeden = dwa;
        }
    }
    static void Zad6()
    {
        Cw11 jeden= new Cw11("1234567890123"), dwa = new Cw11("12345678"), trzy= new Cw11("Anna oraz Kasia"), cztery= new Cw11("tekst"), piec= new Cw11("");
        Cw11[]tab = new Cw11[]{jeden,dwa,trzy,cztery,piec};

        System.out.println("\nTeksty dłuższe niż 10 znaków");
        for(Cw11 cw11: tab)
        {
            if(cw11.tekst.length() > 10){
                System.out.println(cw11.tekst);
            }
        }
        System.out.println("\nTeksty krótsze niż 3 znaki");
        for(Cw11 cw11: tab)
        {
            if(cw11.tekst.length() >= 3 && cw11.tekst.length() <= 13){
                System.out.println(cw11.tekst);
            }
        }
        System.out.println("\nTeksty zaczynaja sie od A i zawieraja fraza 'oraz'");
        for (Cw11 cw11: tab)
        {
            if(cw11.tekst.startsWith("A") && cw11.tekst.contains("oraz"))
                System.out.println(cw11.tekst);
        }
        System.out.println("\nTeksty  które sa \"tekst\"");
        for (Cw11 cw11: tab)
        {
            if(cw11.tekst.equals("tekst"))
                System.out.println(cw11.tekst);
        }
    }
    static void TestSwitch(String tekst)
    {
        switch (tekst)
        {
            case "jeden":
                System.out.println("1");
                break;
            case "dwa":
                System.out.println("2");
                break;
            case "trzy":
                System.out.println("3");
                break;
            case "cztery":
                System.out.println("4");
                break;
            case "piec":
                System.out.println("5");
                break;
            default:
                System.out.println("Nie umiem");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Witaj swiecie");
        //Zad2();
        //new Cw11().Wypisz();
        //Zad4();
        //Zad5();
        scanner.close();
        //Zad6();
        TestSwitch("jeden");
        TestSwitch("dwa");
        TestSwitch("trzy");
        TestSwitch("cztery");
        TestSwitch("piec");
        TestSwitch("szesc");

    }
}