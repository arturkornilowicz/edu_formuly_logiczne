package prv.ak.formuly_logiczne;

abstract public class Formula {

    Spojnik spojnik;

    public Formula(Spojnik spojnik) {
        this.spojnik = spojnik;
    }

    abstract public boolean oblicz();
}
