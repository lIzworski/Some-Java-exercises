package Korporacja;

public class Sprzataczka extends Pracownik {

    private boolean czyCzysto = true;

    public boolean isCzyCzysto() {
        return czyCzysto;
    }

    public void setCzyCzysto(boolean czyCzysto) {
        this.czyCzysto = czyCzysto;
    }

    public Sprzataczka(String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko, "Umowa o pracę", "Sprzątaczka", wynagrodzenie);
    }
    public void Posprzataj(){
        if(!isCzyCzysto()){
            System.out.println("Zaczynam Sprzątanie, sprzątu, sprzątu... sprzątu, sprzątu, tam sprzątu, tu sprzątu...");
            System.out.println("i już posprzątane");
            setCzyCzysto(true);
        }
        else{
            System.out.println("Jest czysto, po co sprzatać jak jest posprzatane.");
        }
    }
}
