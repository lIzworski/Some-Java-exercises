package Korporacja;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Kierownik extends Pracownik{


    private Programista programista;
    private Programista programistaWylosowany;

    public Programista getProgramistaWylosowany() {
        return programistaWylosowany;
    }

    public Kierownik(String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko, "Umowa o pracę", "Kierownik", wynagrodzenie);
    }
    // Programisci
    Programista pro0 = new Programista("Julek","Trzesiedzida", "Umowa o prace","Programista",5000,40);
    Programista pro1 = new Programista("Zbyszek","Zbogdaniec", "Umowa o zlecenie","Programista junior",700,19);
    Programista pro2 = new Programista("Kuba","Puchatek", "Umowa o prace","Programista",8000,70);
    Programista pro3 = new Programista("Jarek","Zfabrykipodpalek", "Umowa o zlecenie","Programista junior",1200,25);
    // Lista Programistów
    List<Programista>listaProgramistow = new ArrayList<>();
    //Zadania
    Zadanie zad0 = new Zadanie(0,"WygSiorbHer ver 1.3", "Wygłuszacz siorbania herbaty, aplikacja do słuchawek wersja 1.3",WybranyProgramista(),false, 28,5);
    Zadanie zad1 = new Zadanie(1,"LoveLoveLove", "Aplikacja która znajduje miłość twojego życia",WybranyProgramista(),false, 90,40);
    Zadanie zad2 = new Zadanie(2,"HideCamTurbo", "Aplikacja do obsługi ukrytej kamery w łazience kobiet ( nie przydatna ponieważ w firmie pracuje jedynie jedna kobieta, \nw dodatku z wyglądu wygląda na grubo ponad 100 lat - Sprzataczka Pani Stasia)",WybranyProgramista(),false, 44, 7);
    Zadanie zad3 = new Zadanie(3,"Cytat Na Dziś", "Aplikacja generująca cytat kogoś tam, na dziś",WybranyProgramista(),false, 13,3);
    Zadanie zad4 = new Zadanie(4,"Kalkulator", "Prosty kalkulator ",WybranyProgramista(),false, 10,2);
    Zadanie zad5 = new Zadanie(5,"PEGAZUS", "Program dla każdego kto chce poznać sekrety opozycji",WybranyProgramista(),false, 70,20);
    Zadanie zad6 = new Zadanie(6,"Wygraj", "Aplikacja dla durni, którzy chętnią ją kupia tylko dlatego że w nazwie jest słowo Wygraj, \npozatym że nabywasz tą aplikację nic więcej ona nie oferuje",WybranyProgramista(),false, 8,1);
    Zadanie zad7 = new Zadanie(7,"IleSchudłem", "Kalkulator dzieki któremu możesz obliczyć o ile mniej ważysz po skorzystaniu z toalety",WybranyProgramista(),false, 15,2);
    Zadanie zad8 = new Zadanie(8,"ileZarobie 2.0", "Aplikacja dzięki której możesz sobie wpisać nazwe swojej wymarzonej pracy, jej zarobi i pomnozyć sobie je przez wybraną przez siebie liczbę",WybranyProgramista(),false, 30, 7);
    // lista zadań
    private List<Zadanie> zadania = new ArrayList<>();
    public void DodajZadaniaDoListy(){
        zadania.add(0,zad0);
        zadania.add(1,zad1);
        zadania.add(2,zad2);
        zadania.add(3,zad3);
        zadania.add(4,zad4);
        zadania.add(5,zad5);
        zadania.add(6,zad6);
        zadania.add(7,zad7);
        zadania.add(8,zad8);
    }
    public int LosujLiczbeBy(int liczbaMax){
        Random liczba = new Random();
        int los = liczba.nextInt(liczbaMax);
        return los;
    }
    public void LosujProgramiste(){
        switch (LosujLiczbeBy(4)){
            case 0 -> programistaWylosowany = pro0;
            case 1 -> programistaWylosowany = pro1;
            case 2 -> programistaWylosowany = pro2;
            case 3 -> programistaWylosowany = pro3;
        }
    }
    public Programista WybranyProgramista(){
        LosujProgramiste();
        return getProgramistaWylosowany();
    }

    public void DodajProgramistowDoListy(){
        listaProgramistow.add(0,pro0);
        listaProgramistow.add(1,pro1);
        listaProgramistow.add(2,pro2);
        listaProgramistow.add(3,pro3);
    }

    public void WybierzPostac(){
        Scanner scan = new Scanner(System.in);
        int wyborGracza = scan.nextInt();
        switch (wyborGracza){
            case 1 -> programista = pro0;
            case 2 -> programista = pro1;
            case 3 -> programista = pro2;
            case 4 -> programista = pro3;
            default -> {
                System.out.println("Nie ma takiego pracownika na liscie, wybierz jeszcze raz");
                WybierzPostac();
            }
        }
    }
    public void Rozpocznij(){
        DodajProgramistowDoListy();
        System.out.println("\nKtórym pracownikiem chesz iść do pracy ? Przed drzwiami są ich rzeczy. - ci durnie je tu zostawiają - \nsą też tabletki dzięki którym dostssujesz swój poziom umiejętności do postaci pod którą się podszyjesz. \n");
        System.out.println("Wciśnij odpowiedni klawisz, przypisany pod postać\n");
        System.out.println("1  : "+listaProgramistow.get(0).getImie() +" "+ listaProgramistow.get(0).getNazwisko() +"|   Procentowy poziom umiejętnosci : "+ listaProgramistow.get(0).getUmiejetnosci() );
        System.out.println("2  : "+listaProgramistow.get(1).getImie() +" "+ listaProgramistow.get(1).getNazwisko() +"|   Procentowy poziom umiejętnosci : "+ listaProgramistow.get(1).getUmiejetnosci() );
        System.out.println("3  : "+listaProgramistow.get(2).getImie() +" "+ listaProgramistow.get(2).getNazwisko() +"|   Procentowy poziom umiejętnosci : "+ listaProgramistow.get(2).getUmiejetnosci() );
        System.out.println("4  : "+listaProgramistow.get(3).getImie() +" "+ listaProgramistow.get(3).getNazwisko() +"|   Procentowy poziom umiejętnosci : "+ listaProgramistow.get(3).getUmiejetnosci() +"\n");
        WybierzPostac();
        System.out.println("Przebrałes się, w środku stoi ochroniarz, ma strasznię tępy wyraz twarzy. Patrzy się na ciebie - Po chwili zaczyna mówić\n");
    }

    List<Zadanie>mojaListaZadan = new ArrayList<>();

    public void SortujZadaniaDoZrobieniaWybierajacZNichTylkoTeDlaMnie(){
        for(int i = 0; i < 9; i++){
            if(zadania.get(i).getProgramista() == programista){
                int x =0;
                mojaListaZadan.add(x,zadania.get(i));
                x += 1;
            }
        }
    }
    public void WyswietlZadaniaDlaMnieDozrobienia(){
        for(int i =0; i < mojaListaZadan.size(); i++){
            System.out.println("\nNr :"+ (i+1) +" Nazwa : " + mojaListaZadan.get(i).getNazwa() + " |     skrócony opis : " + mojaListaZadan.get(i).getTresc());
        }
    }
    public void LosujKrzyk(){
        UzupełnijTabliceKrzykow();
        switch (LosujLiczbeBy(5)){
            case 0 -> System.out.println(krzyk[0]);
            case 1 -> System.out.println(krzyk[1]);
            case 2 -> System.out.println(krzyk[2]);
            case 3 -> System.out.println(krzyk[3]);
            case 4 -> System.out.println(krzyk[4]);
        }
    }
    //Krzyki Kierownika
    private String[] krzyk = new String[5];
    public void UzupełnijTabliceKrzykow(){
        krzyk[0]= "Boże co za partactwo, skąd ty sie urwałeś ? Boże, ja nie mogę sie denerwować, bo złość piękności szkodzi. Zejdź mi z przed oczu";
        krzyk[1]= "Nie, nie, nie, po co bierzesz się za zadania których nie potrafisz rozwiązać ? wracaj do biurka ";
        krzyk[2]= "Spójrz na mnie, widzisz to, te zmarszczki, to od takich ludzi jak ty, wkurzacie mnie i mi się pojawiają, odejdź zanim bardziej sie wkurze. ";
        krzyk[3]= "Co to za szajs, weź mi to sprzed oczu, bo wezme ochrone. ";
        krzyk[4]= "Nie mogę się, denerwować, nie mogę się denerwoać, dlatego odejdz, weź to, ***** natychmiast !  ";
    }


    public void caseeee( int index){
        if(programista.getUmiejetnosci() > mojaListaZadan.get(index).getWymaganyPoziomUmiejetnosci()){
            mojaListaZadan.get(index).setCzyZostaloZrobione(true);
            zadania.get(index).setCzyZostaloZrobione(true);
            System.out.println("Zadanie zostało wykonane, twój poziom umiejętności wzrósł o " + mojaListaZadan.get(index).getBonusDoUmiejetnosciPoWykonaniuZadania());
            programista.setUmiejetnosci(programista.getUmiejetnosci()+mojaListaZadan.get(index).getBonusDoUmiejetnosciPoWykonaniuZadania());
            mojaListaZadan.remove(index);
            System.out.println("Twoja nowa lista zadań wygląda tak : ");
            WyswietlZadaniaDlaMnieDozrobienia();
            CoDalejCheszRobic();
        }
        else{
            LosujKrzyk();
            programista.setUmiejetnosci(programista.getUmiejetnosci() - mojaListaZadan.get(index).getBonusDoUmiejetnosciPoWykonaniuZadania());
            System.out.println("Twój poziom umiejętnosci spada o : " + mojaListaZadan.get(index).getBonusDoUmiejetnosciPoWykonaniuZadania()+ " przez co twój aktualny poziom wiedzy to : " + programista.getUmiejetnosci());
            CoDalejCheszRobic();
        }
    }

    public void RozwiarzZadanie(){
        System.out.println("\nKtóre zadanie chcesz wykonać, podaj numer zadania");
        System.out.println("W twojej liscie znajdują się " + mojaListaZadan.size() + " zadań");
        System.out.println("x   : jeśli chcesz wrócić");
        Scanner scan = new Scanner(System.in);
        int wybor = scan.nextInt();
        switch (wybor ){
            case 1 -> {
                caseeee(0);
            }
            case 2 -> {
                caseeee(1);
            }
            case 3 -> {
                caseeee(2);
            }
            case 4 -> {
                caseeee(3);
            }
            case 5 -> {
                caseeee(4);
            }
            case 'x' -> CoDalejCheszRobic();
        }
    }
    private String[] tablicaZabrudzen = new String[4];
    public void uzupełnijTabliceSprzataczkiPrzeszkód(){
        tablicaZabrudzen[0]= "\nGdy nikt nie patrzy, rzuć doniczką w ścianę. - Wszyscy patrzą ze zdziwieniem na rozbitą doniczkę, kierownik woła sprzątaczkę. Ta już idzie.";
        tablicaZabrudzen[1]= "\nPodejdź do lustra i wylej na nie kawe. Po chwili, przychodzi, kierownik przejrzec sie w nim, z krzykiem, odskakuje, po chili mówi \n\"uff to tylko lustro jest brudne, Pani STASIUUUU ! lusto jest brdne prosze natychmiast je umyć bo nie mogę pracować.\" ";
        tablicaZabrudzen[2]= "\nWyjmij z kosza śmieci, te najbardziej śmierdzące i połóż je pod biurkiem kierownika, korzystając z jego nieuwagi gdy zakochany w sobie przygląda się swoim zębom w lustrze.\ntroche to trwało, chyba z 40 minut, ale wrócił, usiadł, widzisz że coś mu nie pasuje, zaczyna się obwąchiwać\n z porytowaniem widzisz że bardzo podoba mu się jego zapach ponieważ czule wwąchuje sie w swój żółty sweterek\n po chwili dodając \"nie, on pachnie cudnie, to nie może być to, może z spodni\" gdy sie schyla by obwachać swoje spodnie \n zauważa że pod jego biurkiem jest bardzo brudno i że to tak śmierdzi. \n Ten widok go odrzuca i zbiera sie mu na wymioty. Ostatkiem powietrza które pozostało mu w płucach woła sprzątaczkę, tak momentalnie przybiega ";
        tablicaZabrudzen[3]= "\nWyjdz na zwenątrz i przez megafon, zawołaj wszystkich podwórkowych amatorów tanich alkoholi, kusząc ich darmowym alkoholem. Zanim przybiegną, ucieknij do środka\nZostaw tylko informacje o tym gdzie mają się kierować. Po chwili widzisz ze do biura wchodzi całe stado \n brudnych, smierdzących alkoholików podwórkowych, od których smierdzi wonią z przedziału ogórków kiszonych aż po fekalia\n kierownik na ich widok zamyka się w biurze, ty ukradkiem sugerujesz im że własnie kierownik ich wołał i że to on ma alkohol\nNie myśląc wiele podwórkowi amatorzy wysokoprocentowych tanich alkoholi, wywarzają drzwi i rzucają sie na kierownika\n obsciskując go, obmacując, odsuwają się od niego gdy on zaczyna wymiotować, uznając go za niewychowanego gbura który nie potrafi sie zachować\n wychodzą zawiedzeni, zostawiajać za sobą smórd i bród. Po jakimś czasie kierownik dochodzi do siebie, woła sprzątaczkę by po nich posprzątała. Ta po chwili sie pojawia";
    }

    public void LosujPrzeszkadzaszSprzątaczce(){
        uzupełnijTabliceSprzataczkiPrzeszkód();
        switch (LosujLiczbeBy(5)){
            case 0 -> System.out.println(tablicaZabrudzen[0]);
            case 1 -> System.out.println(tablicaZabrudzen[1]);
            case 2 -> System.out.println(tablicaZabrudzen[2]);
            case 3 -> System.out.println(tablicaZabrudzen[3]);
            case 4 -> {
                Stasia.setCzyCzysto(true);
                System.out.println("Wołasz sprzątaczkę");
                Stasia.Posprzataj();
            }


        }
    }
    private String[]tablicaWkurzenOchroniarza = new String[4];
    public void uzupełnijTabliceWkurzenOchroniarza(){
        tablicaWkurzenOchroniarza[0] = "Wysyłasz SMS o treści \"W budynku jest bomba, za chwile wybuchnie\" odczekuejsz chwile ale absolutnie nic się nie dzieje, wyglądasz przez okno i widzsiz twojego ochroniarza po drugiej stronie ulicy\nz telefonem w ręku, nagrywa nasz budynek. Mijają godziny on nadal tam stoi i nagrywa, nikogo nie alarmujac. - Myslisz sobie \n- Niby głupi, ale cierpliwy ! po kolejnych kilku godzianch wraca do swojej kanciapy w budynku zawiedziony. ";
        tablicaWkurzenOchroniarza[1] = "Wysyłasz SMS o treści \"Pomocy, do budynku wdarli się terrorysci\" odczekujesz chwile i do biura wskakuje ochroniarz z kałaszkiowem, zaczyna ostrzeliwać wszystko na ślepo, tylko cudem nikt nie zginął,\ngdy kończy mu się mu amunicja rzuca się na kierownika, który przestarszony biegnie w jego kierunku i zaczyna go dusić. Kierownik ostatnimy tchami krzyczy \" To ja durniu co robisz, co sie dzieje\"\n ten się oreintuje wstaje, rozglada sie wokoło i informuje o zaistniałem sytuacji, nie dając wtrącic się kierownikowi, kończy \n\"Nie musicie dziekować, to tylko moja praca\" i schodzi na dół do swojej kanciapy ";
        tablicaWkurzenOchroniarza[2] = "Wysyłasz SMS o treści \"Gwałcooo, pomocy\" odczekujesz chwili i widzisz że do biura wskakuje, pół nagi ochroniarz, krzycząc, sapiąc jak goryl z podniecenia z wyciągniętym telefonem \nz włączonym nagrywaniem. Po chwili konsternacji gdy wszyscy zaczynają na niego patrzeć, a gdy on zauważa że do żadnych gwałtów tu nie dochodzi, wraca ca dół do swojej kanciapy, zawiedzony. ";
        tablicaWkurzenOchroniarza[3] = "Wysyłasz SMS o treści \"Wygrałeś 1 000 000 zł ! Gratulujemy  \" po chwili słyszysz dobiegające z dołu okrzyki, wrzaski i mocny trzask zamykających sie drzwi wejściowych do  budynku\nwygladasz przez okno widzisz jak ochroniarz dzwoni do swojej żony i informuje ją że ją zostawia, że ją ******** i że ma ją w *****, że nigdy jej nie kochał, a jedyne uczucie \njakie do niej dażył to nienawiść. Zaczyna się szaleńczo śmiać, zrywa ze szczęscia ze siebie ubrania i wbiega do totolotka który stoi po drugiej stronie ulicy. Po kilku chwilach wychodzi \nz opuszczonymi dłońmi, wyciąga telefon i dzwoni do żony, klęka na asfalcie na środku drogi i zaczyna ja przepraszać, po chwili zawiedziony, z podlkulonym ogonem wraca do kanciapy";
    }
    public void LosujZartujZOchrnoniarza(){
        uzupełnijTabliceWkurzenOchroniarza();
        switch (LosujLiczbeBy(4)){
            case 0 -> System.out.println(tablicaWkurzenOchroniarza[0]);
            case 1 -> {
                System.out.println(tablicaWkurzenOchroniarza[1]);
                Stasia.setCzyCzysto(false);
                System.out.println("\nKierownik woła Stasie by to posrzątała");
                Stasia.Posprzataj();
            }
            case 2 -> System.out.println(tablicaWkurzenOchroniarza[2]);
            case 3 -> System.out.println(tablicaWkurzenOchroniarza[3]);
        }
    }
    Sprzataczka Stasia = new Sprzataczka("Stanisława","Niepomyj",2300);
    public void PrzeszkadzajPracownikom(){
        System.out.println("W jaki sposób chcesz przeszkadzać pracownikom ? ");
        System.out.println("1 : Widzisz że sprzataczka się nudzi, wiec postanawiasz znaleść jej zajęcie");
        System.out.println("2 : Wyślij SMS ochroniarzowi z żartem");
        System.out.println("x : wróć");
        Scanner scan = new Scanner(System.in);
        int wybor = scan.nextInt();
        switch (wybor){
            case 1 -> {
                Stasia.setCzyCzysto(false);
                LosujPrzeszkadzaszSprzątaczce();
                Stasia.Posprzataj();
                CoDalejCheszRobic();
            }
            case 2 -> {
                LosujZartujZOchrnoniarza();
                CoDalejCheszRobic();
            }
            case 'x' -> CoDalejCheszRobic();
        }
    }
    public void CoDalejCheszRobic(){
        System.out.println("\nCo dalej chesz robić ? \n");
        System.out.println("1 : Rozwiązuj zadania");
        System.out.println("2 : Przeszkadzaj pracownikom");
        System.out.println("3 : Wyjdź z biura i wróc do domu");

        Scanner scan = new Scanner(System.in);
        int wybor  = scan.nextInt();
        switch (wybor){
            case 1 -> RozwiarzZadanie();
            case 2 -> PrzeszkadzajPracownikom();
            case 3 -> System.exit(0);
        }

    }

    public void WBiurze(){
        DodajZadaniaDoListy();
        System.out.println("\nZaraz za drzwiami spotykasz gościa, wkurzonego z zespołem narcyza, który niby coś do ciebie mówi, ale wogole nie zwraca na ciebie uwagi, \nmówi ci o jakimś zadaniu które zostawił ci na biurku. Mówiąc to przegląda się w lustrze, drapie się po czterech literach i idzie do innego lustra poprawić fryzure ");
        SortujZadaniaDoZrobieniaWybierajacZNichTylkoTeDlaMnie();
        System.out.println("\nTylko jedno biurko jest wolne, więc kierujesz się w jego stronę licząc że to twoje, nie mylisz się, na biurku lerzą jakieś papiery\n");
        System.out.println("Siadasz przy biurku i od razu zerkasz w zadania");
        WyswietlZadaniaDlaMnieDozrobienia();
        CoDalejCheszRobic();
    }
}
