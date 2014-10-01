package fein91.arrays;


import fein91.arrays.SquareArrayStarPrinter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author otatarik
 */
public class Main {

    public static final int SQUARE_ARR_SIZE = 5;
    
    public static void main(String[] args) throws CloneNotSupportedException {
        SquareArrayStarPrinter.print(7);
        //printSquareArrIdx(3);
        //printSquareArrMainDiag(5);
        //printSquareArrUnderMainDiag(3);
        //printSquareArrAlterDiag(3);
        //printSquareArrUpperAlterDiag(3);
    }

    public static void printSquareArrIdx(int size) {
        String[][] result = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = i + " " + j;
            }
        }
        System.out.println("i j");
        printSquareArr(result);
    }

    public static void printSquareArrMainDiag(int size) {
        String[][] result = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    result[i][j] = "1";
                }
            }
        }
        printSquareArr(result);
    }

    public static void printSquareArrAlterDiag(int size) {
        String[][] result = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - i - 1) {
                    result[i][j] = "1";
                } else {
                    result[i][j] = "0";
                }
            }
        }
        printSquareArr(result);
    }
    
    public static void printSquareArrUpperAlterDiag(int size) {
        String[][] result = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < size - i - 1) {
                    result[i][j] = "1";
                } else {
                    result[i][j] = "0";
                }
            }
        }
        printSquareArr(result);
    }
    
    public static void printSquareArrUnderAlterDiag(int size) {
        String[][] result = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j > size - i - 1) {
                    result[i][j] = "1";
                } else {
                    result[i][j] = "0";
                }
            }
        }
        printSquareArr(result);
    }

    public static void printSquareArrUpperMainDiag(int size) {
        String[][] result = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= j) {
                    result[i][j] = "1";
                } else {
                    result[i][j] = "0";
                }
            }
        }
        printSquareArr(result);
    }

    public static void printSquareArrUnderMainDiag(int size) {
        String[][] result = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i >= j) {
                    result[i][j] = "1";
                } else {
                    result[i][j] = "0";
                }
            }
        }
        printSquareArr(result);
    }

    public static <T> void printSquareArr(T[][] arr) {
        for (T[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
