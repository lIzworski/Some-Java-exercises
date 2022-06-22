package pomoce;

public class Czas extends Czasowa{
    private int Godzina;
    private int Minuta;

    public Czas(int godzina, int minuta) {
        Godzina = godzina;
        Minuta = minuta;
    }

    public int getGodzina() {
        return Godzina;
    }

    public void setGodzina(int godzina) {
        Godzina = godzina;
    }

    public int getMinuta() {
        return Minuta;
    }

    public void setMinuta(int minuta) {
        Minuta = minuta;
    }

    @Override
    public String GetDane() {
        return this.Godzina + ":" + this.Minuta;
    }
}
