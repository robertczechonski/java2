import java.util.Date;

public class Formatowanie {
    public static void main(String[] args) {
        double x = 10000000.0 / 3.0;
        System.out.println(x);
        System.out.printf("%5.2f\n",x);
        System.out.printf("%.2f\n",x);
        System.out.printf("%,.2f PLN\n",x);
        System.out.printf("%tc",new Date());

    }
}
