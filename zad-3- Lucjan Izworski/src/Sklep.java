import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sklep {

    List<Towar> listaTowar = new ArrayList<>();
    List<Klient> listaKlient = new ArrayList<>();
    List<Transakcja> listaTransakcja = new ArrayList<>();

    public List<Towar> getListaTowar() {
        return listaTowar;
    }

    public List<Klient> getListaKlient() {
        return listaKlient;
    }

    public List<Transakcja> getListaTransakcja() {
        return listaTransakcja;
    }

    public void DodajTowar(Towar towar, int ilosc){
        if(listaTowar.contains(towar)){

            towar.setIlosc(towar.getIlosc()+ilosc);
        }
        else{
            listaTowar.add(towar);
        }
    }

    public void DodajKlienta(Klient klient){
        listaKlient.add(klient);
    }

    public void DodajTransakcje(Transakcja transakcje) throws Exception {

        //Sprawdz czy produkt jest dostępnyw liscie towarów
        if(listaTowar.contains(transakcje.getTowar())){
            int indexTowaru = listaTowar.indexOf(transakcje.getTowar());
            // Sprawdz czy mamy odpowiednią ilośc  tego produktu
            if(listaTowar.get(indexTowaru).getIlosc() >= transakcje.getIlosc()  ){
                //Dodaj transakcje
                listaTransakcja.add(transakcje);
                Towar towar = listaTowar.get(indexTowaru);
                towar.setIlosc(towar.getIlosc()-transakcje.getIlosc());
            }
            else{
                throw new Exception("Nie można dodać transakcji, ponieważ nie wystarczającej ilości produków");
            }
        }
        else{
            throw new Exception("Nie można dodać transakcji");
        }


    }
    public void PosortujListyTowarowPoNazwie(){
        String[][]tabelaKtoCoIle = new String[4][4];
        tabelaKtoCoIle[0][0] = "      ";
        tabelaKtoCoIle[1][0] = "Lucjan ";
        tabelaKtoCoIle[2][0] = "Jacek  ";
        tabelaKtoCoIle[3][0] = "Wojtek ";
        tabelaKtoCoIle[0][1] = "hammer ";
        tabelaKtoCoIle[0][2] = "motyka ";
        tabelaKtoCoIle[0][3] = "kij ";
        tabelaKtoCoIle[1][1] = "28    ";
        tabelaKtoCoIle[1][2] = "0     ";
        tabelaKtoCoIle[1][3] = "0     ";
        tabelaKtoCoIle[2][1] = "0     ";
        tabelaKtoCoIle[2][2] = "13    ";
        tabelaKtoCoIle[2][3] = "2     ";
        tabelaKtoCoIle[3][1] = "0     ";
        tabelaKtoCoIle[3][2] = "0     ";
        tabelaKtoCoIle[3][3] = "1     ";


            for (int i=0; i<4; i++)
            {
                for (int j=0; j<4; j++)
                {
                    System.out.printf(tabelaKtoCoIle[i][j]+"");

                }
                System.out.println();
            }
        }
    }

