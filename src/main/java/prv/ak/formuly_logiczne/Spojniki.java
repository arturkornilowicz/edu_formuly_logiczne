package prv.ak.formuly_logiczne;

public interface Spojniki {

    Spojnik ZMIENNA = new Spojnik("",110);
    Spojnik NEGACJA = new Spojnik("~",100);
    Spojnik KONIUNKCJA = new Spojnik("&",90);
    Spojnik ALTERNATYWA = new Spojnik("|",80);
    Spojnik IMPLIKACJA = new Spojnik("->",70);
    Spojnik ROWNOWAZNOSC = new Spojnik("<->",60);
}
