package uczelnia;

public class Wyklad {
    private Kurs kurs;
    private int czasTrwania;
    private Student[] uczestnicy;

    public void setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public void setUczestnicy(Student[] uczestnicy) {
        this.uczestnicy = uczestnicy;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public Student[] getUczestnicy() {
        return uczestnicy;
    }

    public Wyklad(Kurs kurs, int czasTrwania, Student[] uczestnicy)
    {
        this.kurs = kurs;
        this.czasTrwania = czasTrwania;
        this.uczestnicy = uczestnicy;
    }

}