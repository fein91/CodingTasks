/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author otatarik
 */
public class PermutationGenerator {

    private int size;

    public void generate(int size) {
        this.size = size;
        int currentValue = 1;
        int currentPos = 0;
        List<Integer> avaliable = new ArrayList<>();
        Collections.addAll(avaliable, 1, 2, 3, 4);
        List<Integer> currentPermutation = new ArrayList<>();

        generate(currentPermutation, avaliable);

        // next 
    }

    private void generate(List<Integer> currentPermutation, List<Integer> avaliable) {

        if (currentPermutation.size() == size) {
            System.out.println("result: " + Arrays.toString(currentPermutation.toArray()));
            return;
        } else {
           // System.out.println("current: " + Arrays.toString(currentPermutation.toArray()) + " avaliable: " + Arrays.toString(avaliable.toArray()));

        }

        for (Integer value : avaliable) {
            List<Integer> tempCurrentPermutation = new ArrayList<>(currentPermutation);
            tempCurrentPermutation.add(value);
            List<Integer> tempAvaliable = new ArrayList<>(avaliable);
            tempAvaliable.removeAll(tempCurrentPermutation);
            generate(tempCurrentPermutation, tempAvaliable);
        }

    }

}
