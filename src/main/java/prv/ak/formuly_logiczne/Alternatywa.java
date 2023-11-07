package prv.ak.formuly_logiczne;

public class Alternatywa extends Formula2 {

    public Alternatywa(Formula arg1, Formula arg2) {
        super(Spojniki.ALTERNATYWA,arg1,arg2);
    }

    @Override
    public boolean oblicz() {
        return arg1.oblicz() || arg2.oblicz();
    }
}
