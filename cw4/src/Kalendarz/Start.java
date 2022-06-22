package Kalendarz;

import pomoce.*;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args)
    {
        List<Czasowa> czasy = new ArrayList<>();

        czasy.add(new Czas(5,10));
        czasy.add(new Data(1999, 8, 15));
        czasy.add(new DataCzas(2001,9,9,15,10));

        for(Czasowa czasowa : czasy)
        {
            System.out.println(czasowa.GetDane());
        }
    }
}
