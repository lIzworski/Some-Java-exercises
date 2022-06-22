package Korporacja;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Ochrona extends Pracownik{

    private boolean czyDozwolone = true;

    public Ochrona(String imie, String nazwisko,  double wynagrodzenie) {
        super(imie, nazwisko, "Umowa o pracę", "Ochroniarz", wynagrodzenie);
    }
    Przedmiot thing0 = new Przedmiot("Aktówka", false, "Co w niej jest ? prosze nie otwierać, ja widziałem w filmie, jak w takim czymś bomby przynoszą. \nProsze wyjść i wziąść ją ze sobą, proszę wychodzić z podniesionymi dłońmi i patrzeć mi w oczy, jeden ruch i bedę zmuszony potraktować Pana paralizatorem ");
    Przedmiot thing1 = new Przedmiot("Kilka gram dziwnej mąki", true, "-Patrzycie się, On na ciebie, ty na niego, nie wiesz czy uciec, ale on po chwili konsternacji - Jest Pan piekarzem ? \nMoja mama świetnie piecze placki, mi nie smakują, bo nie lubie placków, ale znam kilka osob które uważają \nże moja mama naprawdę świetnie piecze - słuchasz go, wyginając z poirytowania brwi, pytasz czy możesz wejść - \nTak, tak prosze wejść, następnym razem prosze przynieśc więcej, z tego za wiele Pan nie upiecze");
    Przedmiot thing2 = new Przedmiot("Zestaw mały zboczeniec", false, "To poważna firma, oszalał Pan ! nie można przynosić zestawów dla dzieci ! Tam jest sklep, prosze zakupic wersje dla dorosłych i wrócić !\n- Dodajac po chwili z oddali -  Albo wogóle nie wracać !") ;
    Przedmiot thing3 = new Przedmiot("Koza", true, "O witam witam, widzę że dziś przyszedł Pan z żoną. Miło Panią poznać, Pani mąż wiele mi o Pani opowiadał. - żona odpowiada z usmiehcem grzecznie -  meEeEe");
    Przedmiot thing4 = new Przedmiot("naklejki Pokemon",true, "Pan też je zbiera ! to świetnie ! Ja też! może jutro  przyniose swoje i sie powymieniamy ?\n- Patrzysz na niego poirytowany, no ale przecież chcesz wejść więc mówisz - zróbmy tak! - On na to - już nie mogę się doczekać ! prosze wejść i widzimy się jutro ! - ");
    Przedmiot thing5 = new Przedmiot("Dziwny jakby ogórek z kulkami", true, "-Patrząc w oczy - Nie wiem co to i po co, ale chyba nie da się tym nikomu nic zrobić - Prosze wejść");
    Przedmiot thing6 = new Przedmiot("Piła motorowa  z napisem \" I hate my job, so I want too kill my boss\"", true, "O piła motorowa ! świetny model ! też taką mam, za jednym razem wyrżnełem cały las nią,\nPewnie chce Pan się nią pochwalic w pracy. A co tu jest napisane ? Nie znam angielksiego, \nno nic nie ważne, prosze wejść i miłej pracy życzę !");
    Przedmiot thing7 = new Przedmiot("husteczki", false, "Oszalał Pan, jest pandemia a pan mi tu z bronią biologiczną ! Won za drzwi ! Wyrzuć to albo wezwę antyterrorysów, wariacie \n- Zabierasz husteczki i wychodzsiz - słyszysz za sobą groźby i przekleństwa, ochroniarz miedzy innymi grozi ci szfagrem co ma sąsiada antyterroryste");
    Przedmiot thing8 = new Przedmiot("Turystyczny Pas Szachida -  z napisem \"Pas szachida pozbędzie się bólu twoich pleców raz na zawsze ( nosić w zatłoczonych miejsach, w chwili bólu pleców upewnij się \nże wokoło jest wiele osób, nastepnie pociągnij za czerwony sznurek) \"", true, "O, widzę że ma Pan problemy z plecami, tego modelu jeszcze nie widziałem, \nale czego to teraz ci naukowcy nie wymyslo");
    Przedmiot thing9 = new Przedmiot("Kanapki z ogórkiem ", false, "Nie lubie z ogórkami, nie może Pan wejść, prosze przynieśc inne kanapki" );
    Przedmiot thing10 = new Przedmiot("Kanapki z Wuhan z miesem nietoperzy", true, "Nie wygląda to dobrze, Pana żona też kiepskie kanapki chyba robi? to tak jak moja !, Jendza jedna, cały dzien w domu siedzi nic nie robi, to by chociaż dobre kanapki mi do pracy zrobiła, \nto nie, codziennie z tymi ogórkami, ale to żeby chociaż pokroiła, NIE ! Całe wkłada - Normalnie Panie, nie moge już na nie patrzeć-  Kanapki też kurde, jakieś takie nierówne, \njedna strona ma kilka centymetrów druga scięta do zera to bardziej w sumie jakieś kliny są a nie kanapki, chleb stary - Wtrącasz mu sie w monolog, pytając czy możesz wejść - Tak, tak prosze wejść - \nco to ja mówiłem, chleb stary nie smaczny, bo przedwczorajszy, nawet jej się do sklpu jendzy nie chce iść. Chleb smaczny kupic, świerzy, chrupki, pachnący, \ntak, tak miłego dnia . - Widzisz że będzie zżędził w nieskonczoność, dlatego życzysz mu miłego dnia i pośpiechem kierujesz się w górę, mimo to za sobą nadal go słyszysz - \njendza jedna, to ja tu flaki wyprówam, siedze calymi dniami a ona mi te kanapki z ogórkiem, te kliny z ogórkiem dzien w dzien serwuje. Żeby chociaz takie mi zrobiła jak jemu, egzotyczne, \nz mięsa nietoperzy, to nie ogórek i **** , dzien w dzien, co za życie, ehhh. ");

    List<Przedmiot>listaPrzedmiotow = new ArrayList<Przedmiot>();
    public void DodajPrzedmiotyDoListy(){
        listaPrzedmiotow.add(0,thing0);
        listaPrzedmiotow.add(1,thing1);
        listaPrzedmiotow.add(2,thing2);
        listaPrzedmiotow.add(3,thing3);
        listaPrzedmiotow.add(4,thing4);
        listaPrzedmiotow.add(5,thing5);
        listaPrzedmiotow.add(6,thing6);
        listaPrzedmiotow.add(7,thing7);
        listaPrzedmiotow.add(8,thing8);
        listaPrzedmiotow.add(9,thing9);
        listaPrzedmiotow.add(10,thing10);
    }

    public int losowaniePrzedmiotu(){
        Random liczba = new Random();
        int los = liczba.nextInt(11);
        return los;
    }
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public void spradzCzyMoznaWejscZtymPrzedmiotem(){
        DodajPrzedmiotyDoListy();
        int wylosowanaLiczba = losowaniePrzedmiotu();
        System.out.println("Witam, zanim Pana wpuszczę muszę Pana sprawdzić co Pan wnosi na teren zakładu\n");


            System.out.println("Co my tu mamy \t- " + listaPrzedmiotow.get(wylosowanaLiczba).getNazwa()+ " - ");
            System.out.print(listaPrzedmiotow.get(wylosowanaLiczba).getOdpowiedz());
            if(listaPrzedmiotow.get(wylosowanaLiczba).isDozwolone() == true){
                czyDozwolone = true;
                System.out.println("\n\nPo kontroli osobistej kierujesz się do biura\n");
                wait(4000);
                System.out.println("\n\n--------------------------------------------------- Kilka kroków później ----------------------------------------------\n\n");
            }
            else{
                czyDozwolone = false;
                System.out.println("\n\nPo kontroli osobistej okazuje sie że nie możesz wejść, wyjdz za drzwi i przebierz się za innego pracownika, \nwróc za kilka minut, ochroniarz to dureń, nie powinien się zorientować\n");
                wait(7000);
                System.out.println("\n\n--------------------------------------------------- 5 Minut później ----------------------------------------------\n\n");
                spradzCzyMoznaWejscZtymPrzedmiotem();
            }
    }
}
