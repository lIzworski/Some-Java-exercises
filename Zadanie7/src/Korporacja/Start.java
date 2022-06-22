package Korporacja;

public class Start {
    public static void main(String[]args){
        Kierownik kier1 = new Kierownik("Jan", "Męczyd**a", 12000);
        kier1.Rozpocznij();
        Ochrona och1 = new Ochrona("Janusz","Pokraka",1250);
        och1.spradzCzyMoznaWejscZtymPrzedmiotem();
        kier1.WBiurze();

    }
}
