package administracja;

import uczelnia.Kurs;
import uczelnia.Student;
import uczelnia.Wyklad;
import uczelnia.Wykladowca;

public class Dydaktyka {
    public static Kurs[] Kursy;
    public static Wyklad[] Wyklady;
    public static int IloscKursow;
    public static int IloscWykladow;
    public static boolean[][] CzyZdal;

    static
    {
        IloscKursow = 0;
        IloscWykladow = 0;
        Kursy = new Kurs[10];
        Wyklady = new Wyklad[10];
    }

    public static void DodajKurs(String nazwa, int godzin, int minGodzin, Wykladowca wykladowca, Student[] uczestnicy)
    {
        Kursy[IloscKursow] = new Kurs(nazwa, godzin, minGodzin, wykladowca);
        Kursy[IloscKursow].setUczestnicy(uczestnicy);
        IloscKursow++;
    }

    public static void DodajWyklad(Kurs kurs, int czasTrwania, Student[] uczestnicy)
    {
        Wyklady[IloscWykladow] = new Wyklad(kurs, czasTrwania, uczestnicy);
        Wyklady[IloscWykladow].setUczestnicy(uczestnicy);
        IloscWykladow++;
    }
    public static void WypelnijWyniki() {
        CzyZdal = new boolean[IloscKursow][Rekrutacja.IloscStudentow];
        for (int kursy = 0; kursy < IloscKursow; kursy++) {
            for (int studenci = 0; studenci < Rekrutacja.IloscStudentow; studenci++) {
                int licznik = 0;
                for (int wyklady = 0; wyklady < IloscWykladow; wyklady++) {
                    if (Wyklady[wyklady].getKurs() == Kursy[kursy]) {
                        for (int uczestnicy = 0; uczestnicy < Wyklady[wyklady].getUczestnicy().length; uczestnicy++) {
                            if (Wyklady[wyklady].getUczestnicy()[uczestnicy] == Rekrutacja.Studenci[studenci]) {
                                licznik += Wyklady[wyklady].getCzasTrwania();
                                break;
                            }
                        }
                    }
                }
                if (licznik >= Kursy[kursy].getMinGodzin()) {
                    CzyZdal[kursy][studenci] = true;
                }
            }

        }
    }
        public static void WypiszWyniki () {
            {
                for (int i = 0; i < IloscKursow; i++) {
                    for (int j = 0; j < Rekrutacja.IloscStudentow; j++) {
                        if (CzyZdal[i][j] == false) {
                            Student student = Rekrutacja.Studenci[j];
                            System.out.println(student.GetDane() + " oblal");
                        }
                        else {
                            Student student = Rekrutacja.Studenci[j];
                            System.out.println(student.GetDane() + " zdal");
                        }
                    }
                }
            }

        }


    }