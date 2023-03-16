import java.util.Arrays;
import java.util.stream.IntStream;

public class Tablice {
    public static void main(String[] args) {
//        int[] liczby;
        int[] liczby = new int[100];
        int[] small = {2,3,4,5,6,7,};
        small[2] = 100;
//        IntStream small2 = Arrays.stream(small).sorted();
//
        Arrays.sort(small);


//       for (int elem:small){
//           System.out.println(elem);
//       }

       int [] luckyNumbers = Arrays.copyOf(small, 2 * small.length);

        for (int elem:luckyNumbers){
            System.out.println(elem);
        }
        String[] autorzy = {
                "Bartek Zalewski",
                "Józef Buczek",
                "Asia Parus",
        };

//        for (int i : new int[]{4, 5, 6, 7,}) {
//
//        }

//        cyfry = new int[]{4,5,6,7,8,};
        for (int i = 0; i < 100; i++){
            liczby[i] = i;
        }
//        for (int i = 0; i < liczby.length; i++){
//            System.out.println(liczby[i]);
//        }
        for (int element : liczby){                 // for each - wyswietla w petli wszystkie wielkosci z tablicy
            System.out.println(element);
        }


    }
}
