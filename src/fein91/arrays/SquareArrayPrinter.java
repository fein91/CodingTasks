/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.arrays;

import java.util.Arrays;

/**
 *
 * @author otatarik
 */
public class SquareArrayPrinter {

    public static void print(int[][] array) {
        int maxElem = max(array);
        int maxElemLength = getIntegerLength(maxElem);

        for (int[] row : array) {
            for (Integer elem : row) {
                String elemStr = elem.toString();
                if (getIntegerLength(elem) < maxElemLength) {
                    printSpaces(maxElemLength - getIntegerLength(elem));
                }
                System.out.print(elemStr + " ");
            }
            System.out.println("");
        }
    }

    private static void printSpaces(int count) {
        while (count > 0) {
            System.out.print(" ");
            count--;
        }
    }

    private static int getIntegerLength(Integer number) {
        String str = number.toString();
        return str.length();
    }

    public static int max(int[][] array) {
        int[] maxInRow = new int[array.length];
        int max;
        int i = 0;
        for (int[] row : array) {
            Arrays.sort(row);
            maxInRow[i] = row[row.length - 1];
            i++;
        }

        Arrays.sort(maxInRow);
        return maxInRow[maxInRow.length - 1];
    }
}
