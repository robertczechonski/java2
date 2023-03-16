import java.util.Arrays;

public class Tablice_wielowymiarowe {
    public static void main(String[] args) {
        double[][] balance;
//        balance = new double[year][rates];
        int[][] square =
        {
            {4, 5, 6, 7},
            {45, 23, 34, 56},
            {11, 34, 12, 11},
            {9, 8, 7, 6},
        };
        System.out.println(square[2][3]);
        System.out.println(Arrays.deepToString(square));

        for (int[] row: square)
            for (int value: row){
                System.out.println(value);
            }

    }
}
