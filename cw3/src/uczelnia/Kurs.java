package uczelnia;

public class Kurs {
    private String nazwa;
    private int godzin;
    private int minGodzin;
    private Wykladowca wykladowca;
    private Student[] uczestnicy;

    public void setGodzin(int godzin) {
        this.godzin = godzin;
    }

    public void setMinGodzin(int minGodzin) {
        this.minGodzin = minGodzin;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setUczestnicy(Student[] uczestnicy) {
        this.uczestnicy = uczestnicy;
    }

    public void setWykladowca(Wykladowca wykladowca) {
        this.wykladowca = wykladowca;
    }

    public int getGodzin() {
        return godzin;
    }

    public int getMinGodzin() {
        return minGodzin;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Student[] getUczestnicy() {
        return uczestnicy;
    }

    public Wykladowca getWykladowca() {
        return wykladowca;
    }

    public Kurs(String nazwa, int godzin, int minGodzin, Wykladowca wykladowca)
    {
        this.nazwa = nazwa;
        this.godzin = godzin;
        this.minGodzin = minGodzin;
        this.wykladowca = wykladowca;
        uczestnicy = new Student[10];
    }
    public String GetDane() {
        String dane ="";
        dane+= "nazwa: "+ this.nazwa;
        dane+= " godzin: "+this.godzin;
        dane+= " mingodz" + this.minGodzin;
        dane+= "\n Wykladowca:\n";
        dane+= this.wykladowca.GetDane();
        dane+= "\nUczestinicy\n";
        for (Student s: uczestnicy)
        {
            if(s != null) {
                dane+= s.GetDane();
            }
        }
        return dane;
    }
}
