/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.binarysearch;

/**
 *
 * @author Fein
 */
public class BinarySearcher {

    private final int[] input;
    private int key;
    private int prevMiddle;

    public BinarySearcher(int[] input) {
        this.input = input;
    }

    public int search() {
        if (input.length == 0) {
            return -1;
        } else {
            return search(0, input.length - 1);
        }
    }

    private int search(int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("");

        if (to == from) {
            return (input[to] == key ? to : -1);
        } else if ((to - from + 1) % 2 == 0) {
            return searchPair(from, to);
        } else {
            return searchOdd(from, to);
        }
    }

    private int searchPair(int from, int to) {
        int middle = from + (to - from + 1) / 2;
        if (key > input[middle]) {
            return search(middle + 1, to);
        } else if (key < input[middle]) {
            return search(from, middle - 1);
        } else {
            return middle;
        }
    }

//  0  1  2  3  4   5   6   7
// {1, 2, 5, 9, 13, 14, 17, 19}
// KEY = 14
// mid = 7-0+1/2 = 4
    // from 0 to 7
// left
    //from 0 to 3
// {1, 2, 5, 9}
//right
    //from 5 to 7
// {14, 17, 19}
    private int searchOdd(int from, int to) {
        int middle = from + (to - from + 1) / 2;
        if (key > input[middle]) {
            return search(middle + 1, to);
        } else if (key < input[middle]) {
            return search(from, middle);
        } else {
            return middle;
        }
    }

//  0  1  2  3  4   5   6 
// {1, 2, 5, 9, 13, 14, 17}
// KEY = 14
// mid =6-0+1/2 = 3
    // from 0 to 6
// left
    //from 0 to 3
// {1, 2, 5}
//right
    //from 4 to 6
// {13, 14, 17}
    public void setKey(int key) {
        this.key = key;
        prevMiddle = 0;
    }
}
