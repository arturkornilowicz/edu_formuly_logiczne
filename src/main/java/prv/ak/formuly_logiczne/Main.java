package prv.ak.formuly_logiczne;

public class Main {

    public static void main(String[] args) {
        Zmienna p = new Zmienna("p");
        Zmienna q = new Zmienna("q");

        Formula n1 = new Negacja(p); // ~p
        Formula n2 = new Negacja(n1); // ~n1 = ~~p

        System.out.println(n2);

        Formula k1 = new Koniunkcja(p,n1); // p & n1 = p & ~p
        System.out.println(k1);

        Formula a1 = new Alternatywa(n1,k1); // n1 | k1 = ~p | p & ~p
        System.out.println(a1);

        Formula k2 = new Koniunkcja(a1,a1); // a1 & a1 = (~p | p & ~p) & (~p | p & ~p)
        System.out.println(k2);

        Formula i1 = new Implikacja(p,q);
        System.out.println(i1);

        Formula r1 = new Rownowaznosc(i1,k2);
        System.out.println(r1);

        System.out.println(new Negacja(new Alternatywa(p,q)));

        // i1 <-> k2
        // (p->q) <-> (~p | p & ~p) & (~p | p & ~p)
        System.out.println(r1.oblicz());


        // ~p | p & ~p
        System.out.println(a1);
        System.out.println(a1.oblicz());
        // ALTERNATYWA
           // NEGACJA
              // ZMIENNA
           // KONIUNKCJA
              // ZMIENNA
              // NEGACJA
                 //ZMIENNA
    }
}
