package prv.ak.formuly_logiczne;

public class Negacja extends Formula1 {

    public Negacja(Formula arg) {
        super(Spojniki.NEGACJA,arg);
    }

    @Override
    public boolean oblicz() {
        return ! arg.oblicz();
    }
}
