package prv.ak.formuly_logiczne;

public class Rownowaznosc extends Formula2 {

    public Rownowaznosc(Formula arg1, Formula arg2) {
        super(Spojniki.ROWNOWAZNOSC,arg1,arg2);
    }

    @Override
    public boolean oblicz() {
        return arg1.oblicz() == arg2.oblicz();
    }
}
