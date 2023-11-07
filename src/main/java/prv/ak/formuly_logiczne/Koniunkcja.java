package prv.ak.formuly_logiczne;

public class Koniunkcja extends Formula2 {

    public Koniunkcja(Formula arg1, Formula arg2) {
        super(Spojniki.KONIUNKCJA,arg1,arg2);
    }

    @Override
    public boolean oblicz() {
        return arg1.oblicz() && arg2.oblicz();
    }
}
