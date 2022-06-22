public class Start {
    public static void main(String[]args){
        IT it = new IT();
        Projekt dom = new Projekt("Dom dla bezdomnych ludzi", 44, "Budowa domu", "Polski", "Polska","Chełmiec");
        Projekt buda = new Projekt("Buda dla psów", 12, "Zbijanie budy dla psa", "Polski", "Polska","Nowy Sącz");
        Projekt budka = new Projekt("Budka", 52, "Zbijanie budki dla ptaków", "Polski", "Polska","Stary Sącz");
        Projekt kryptowaluty = new Projekt("kryptowaluty", 666, "bitcoin sługa Szatana", "Helleński", "Hell","Sosnowiec");
        Projekt t1 = new Projekt("sda", 122, "das", "dsa", "asdas", "dss");
        Projekt t2 = new Projekt("da", 122, "das", "sdt", "dasd", "tfds");
        //Dodaj projekt
        IT.DodajProjekt(dom);
        IT.DodajProjekt(buda);
        IT.DodajProjekt(budka);
        IT.DodajProjekt(kryptowaluty);
        //Usun Proejkt
        IT.listaProjektow.remove(t1);
        IT.listaProjektow.remove(t2);
        //Metody
        IT.WyswietlProjektyONazwieDluzszejNiz10Znakow();
        IT.WyswietlProjektyOCzasieTrwaniaPonad15();
        IT.WyswietlProjektyZwiązaneZBitCoinem();
        IT.WyswietlPolskieProjekty();
    }
}
