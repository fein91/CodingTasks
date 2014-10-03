/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.SpiralArray;

import java.util.Arrays;

/**
 *
 * @author otatarik
 */
public class SpiralArrayGenerator {

    private static int counterValue = 1;

    public static int[][] generate(int size) {
        int[][] result = new int[size][size];
        int framesCount = size - 1;
        for (int n = 0; n < framesCount; n++) {
            fillTop(result, n);
            fillRight(result, n);
            fillBottom(result, n);
            fillLeft(result, n);
        }
        return result;
    }

    private static void fillTop(int[][] input, int frameNumber) {
        for (int j = 0; j < input.length - frameNumber*2; j++) {
            input[frameNumber][j + frameNumber] = counterValue++;
        }
    }

    private static void fillRight(int[][] input, int frameNumber) {
    }

    private static void fillBottom(int[][] input, int frameNumber) {
    }

    private static void fillLeft(int[][] input, int frameNumber) {
    }
}

// 1  2  3  4  5
// 16 17 18 19 6
// 15       20 7
// 14          8
// 13 12 11 10 9
//
//
