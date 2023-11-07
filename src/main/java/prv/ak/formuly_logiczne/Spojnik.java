package prv.ak.formuly_logiczne;

public class Spojnik {

    String symbol;
    int sila;

    public Spojnik(String symbol, int sila) {
        this.symbol = symbol;
        this.sila = sila;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
