package prv.ak.formuly_logiczne;

public class Implikacja extends Formula2 {

    public Implikacja(Formula arg1, Formula arg2) {
        super(Spojniki.IMPLIKACJA,arg1,arg2);
    }

    @Override
    public boolean oblicz() {
        return !arg1.oblicz() || arg2.oblicz();
    }
}
