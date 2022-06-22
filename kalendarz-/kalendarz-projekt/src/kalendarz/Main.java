package kalendarz;

import pomoce.Czas;
import pomoce.Czasowa;
import pomoce.Data;
import pomoce.DataCzas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Czasowa> czasy = new ArrayList<>();
        czasy.add(new Czas(5,10));
        czasy.add(new Data(1999,8,15));
        czasy.add(new DataCzas(2001,9,10,15,11));

        for (Czasowa czasowa: czasy) {
            System.out.println(czasowa.GetDane());
        }
    }
}
