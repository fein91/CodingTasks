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
public final class SpiralArrayGenerator {

    private static int counterValue = 1;
    private static int[][] result;
    private static SpiralArrayGenerator instance;
    private int size = 7;

    private SpiralArrayGenerator() {
    }

    public static SpiralArrayGenerator getInstance() {
        if (instance == null) {
            instance = new SpiralArrayGenerator();
        }
        return instance;
    }

    public int[][] generate() {
        result = new int[size][size];
        result = generate(0);
        return result;
    }

    private int[][] generate(int frameCount) {
        fillTop(frameCount);
        fillRight(frameCount);
        fillBottom(frameCount);
        fillLeft(frameCount);
        frameCount++;
        if (frameCount < size - 1) {
            generate(frameCount);
        }
        return result;
    }

    private void fillTop(int frameCount) {
        for (int j = frameCount; j < result.length - frameCount; j++) {
            result[frameCount][j] = counterValue++;
        }
    }

//    private void fillTop(int frameCount) {
//        for (int j = 0; j < result.length; j++) {
//            result[0][j] = counterValue++;
//        }
//    }
    private void fillRight(int frameCount) {
        for (int i = 1 + frameCount; i < result.length - frameCount; i++) {
            result[i][result.length - 1 - frameCount] = counterValue++;
        }
    }

//    private void fillRight(int frameCount) {
//        for (int i = 1; i < result.length; i++) {
//            result[i][result.length - 1] = counterValue++;
//        }
//    }
    private void fillBottom(int frameCount) {
        for (int j = result.length - 2 - frameCount; j >= frameCount; j--) {
            result[result.length - 1 - frameCount][j] = counterValue++;
        }
    }

//    private void fillBottom(int frameCount) {
//        for (int j = result.length - 2; j >= 0; j--) {
//            result[result.length - 1][j] = counterValue++;
//        }
//    }
    private void fillLeft(int frameCount) {
        for (int i = result.length - 2 - frameCount; i >= 1 + frameCount; i--) {
            result[i][frameCount] = counterValue++;
        }
    }
    
//    private void fillLeft(int frameCount) {
//        for (int i = result.length - 2; i >= 1; i--) {
//            result[i][0] = counterValue++;
//        }
//    }

    public void setSize(int size) {
        this.size = size;
    }

}

// 1  2  3  4  5
// 16 17 18 19 6
// 15       20 7
// 14          8
// 13 12 11 10 9
//
//
