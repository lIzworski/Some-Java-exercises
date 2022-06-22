package uczelnia;

public class StudentStacjonarny extends Student implements IKsiegowy{
    public StudentStacjonarny(String imie, String nazwisko, String nrAlbumu) {
        super(imie, nazwisko, nrAlbumu);
    }

    @Override
    public void WypiszKsiegowego() {
        System.out.println("Nie mam kseigowego!!!!");
    }
}
