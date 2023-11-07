package prv.ak.formuly_logiczne;

abstract public class Formula2 extends Formula {

    Formula arg1, arg2;

    public Formula2(Spojnik spojnik, Formula arg1, Formula arg2) {
        super(spojnik);
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public String toString() {
        String wynik = "";

        if (arg1.spojnik.sila <= this.spojnik.sila)
            wynik += "(" + arg1 + ")";
        else
            wynik += arg1;

        wynik += " " + spojnik + " ";

        if (arg2.spojnik.sila <= this.spojnik.sila)
            wynik += "(" + arg2 + ")";
        else
            wynik += arg2;

        return wynik;
    }
}
