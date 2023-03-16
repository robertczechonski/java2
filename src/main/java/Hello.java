public class Hello {
    static int wiekDelikwenta;
    public static void main(String[] args){
        final int ROK = 2023;   // deklaracja stałej
        var zarobki = 100.50;   // deklaracja zmiennych
        double pensja = 10000;

        boolean done22,undone33;
        long populacja_ziemi;
        pensja = 50000;
        wiekDelikwenta = 40;
        var x = 10;
        var y = 2.5;
        var z = 2;
        double wynik = x * y/z + x;
        double w = Math.sqrt(x);
        double c = 9.97;
        int nc = (int)c;    // rzutowanie zmiennych z wiekszej na mniejsza ze stratą

        x = x + 4;
        x += 4;
        int n = 12;
        n++;
        n--;


        System.out.println(w);

        System.out.println("Hello world!");
        System.out.println(pensja);
        System.out.println(wiekDelikwenta);
        System.out.println(zarobki);
        System.out.println(wynik);
        System.out.println(nc);
        System.out.println(x == n); // porównanie
        System.out.println(x != n);
        // > < <= >=
        // &&  ||
        System.out.println(x < y ? x: y);// warunek ? wyrazenie1 : wyrazenie2

    }
}
