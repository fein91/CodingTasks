
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author otatarik
 */
public class SquareArrayStarPrinter {

    public static void print(int k) {
        int size = 2 * k - 1;
        int[][] result = new int[size][size];
        int mid = k;

        for (int n = 0; n < k; n++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == mid - j - 1) {
                        result[i][j] = k - n;
                    }
//                    if (i == size - j - 1 - mid) {
//                        result[i][j] = n;
//                    }
                    if (i == j + mid - 1) {
                        result[i][j] = k - n;
                    }
                    if (i == j - mid + 1) {
                        result[i][j] = k - n;
                    }

                }
            }
        }

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
