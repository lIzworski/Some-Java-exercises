import java.util.ArrayList;
import java.util.List;

public class IT {
   public static List<Projekt>listaProjektow = new ArrayList<>();

   public static void DodajProjekt(Projekt projekt){
       listaProjektow.add(projekt);
   }
   public static void WyswietlProjektyONazwieDluzszejNiz10Znakow(){
       System.out.println("\nProjekty o nazwie dłuższej niż 10 znaków");
       for(int i =0; i < listaProjektow.size(); i++){
           if(listaProjektow.get(i).getNazwa().length() > 10 ){
               System.out.println(listaProjektow.get(i).getNazwa());
           }
       }
   }
   public static void WyswietlProjektyOCzasieTrwaniaPonad15(){
       System.out.println("\nProjekty o czasie trwania ponad 15 jednostek czasu");
       for(int i = 0; i < listaProjektow.size();i++){
            if(listaProjektow.get(i).getCzasTrwania() > 15){
                System.out.println(listaProjektow.get(i).getNazwa()+", czas trwania : "+ listaProjektow.get(i).getCzasTrwania());
            }
       }
   }
   public static void WyswietlProjektyZwiązaneZBitCoinem(){
       System.out.println("\nProjekty zawierające w nazwie słowo \"kryprowaluty\" i w opisie słowo \"bitcoin\"" );
       String bitcoin = "bitcoin";
       String kryptowaluty = "kryptowaluty";
       for(int i = 0; i< listaProjektow.size(); i++){
           if(listaProjektow.get(i).getNazwa().contains(kryptowaluty) && listaProjektow.get(i).getOpis().contains(bitcoin)){
               System.out.println("Nazwa : "+listaProjektow.get(i).getNazwa() + ", opis : "+ listaProjektow.get(i).getOpis());
           }
       }
   }
   public static void WyswietlPolskieProjekty(){
       System.out.println("\nWyświetlPolskieProjekty");
       String krajj = "Polska";
       String jezyyk = "Polski";
       for(int i = 0; i < listaProjektow.size();i++){
           if(listaProjektow.get(i).getKraj().contains(krajj)&&listaProjektow.get(i).getJezyk().contains(jezyyk)){
               System.out.println("Nazwa : "+listaProjektow.get(i).getNazwa() + ", Kraj pochodzenia : "+ listaProjektow.get(i).getKraj() + ",  język : " +listaProjektow.get(i).getJezyk() );
           }
       }
   }
}
