/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.armstrongnumbers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author otatarik
 */
public class ArmstrongNumbersGenerator {

    public static List<Integer> generateArmstrongNumbers(int range) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < range; i++) {
            List<Integer> numbers = getAllNumbers(i);
            if (i == generatePowSum(numbers)) {
                result.add(i);
            }
        }
        return result;
    }

    private static List<Integer> getAllNumbers(int input) {
        List<Integer> result = new ArrayList<>();
        int number;
        while ((input / 10) > 0) {
            result.add(input % 10);
            input = input / 10;
        }
        result.add(input);
        return result;
    }

    private static int generatePowSum(List<Integer> numbers) {
        int sum = 0;
        if (numbers.size() != 0) {
            for (int numb : numbers) {
                sum += Math.pow(numb, numbers.size());
            }
        }
        return sum;
    }
}

//
