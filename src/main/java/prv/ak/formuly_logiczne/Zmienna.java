package prv.ak.formuly_logiczne;

public class Zmienna extends Formula {

    String nazwa;
    boolean wartosc;

    public Zmienna(String nazwa, boolean wartosc) {
        super(Spojniki.ZMIENNA);
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }

    public Zmienna(String nazwa) {
        this(nazwa,true);
    }

    @Override
    public String toString() {
        return nazwa;
    }

    @Override
    public boolean oblicz() { return wartosc; }
}
