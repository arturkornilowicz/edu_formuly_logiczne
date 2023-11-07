package prv.ak.formuly_logiczne;

abstract public class Formula1 extends Formula {

    Formula arg;

    public Formula1(Spojnik spojnik, Formula arg) {
        super(spojnik);
        this.arg = arg;
    }

    @Override
    public String toString() {
        String wynik = "" + spojnik;
        if (arg.spojnik.sila < this.spojnik.sila)
            wynik += "(" + arg + ")";
        else
            wynik += arg;
        return wynik;
    }
}
