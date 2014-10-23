/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.stringssum;

/**
 *
 * @author otatarik
 */
public class NumberStringsSummator {

    private static final int FIRST_NUMBERIC_CHAR_POSITION = 48;
    private static final int LAST_DECEMICAL_NUMBER = 9;
    private static final int DECEMICAL_BASE = 10;

    public static String sum(String augend, String addend) {
        StringBuffer result = new StringBuffer("");
        char[] augendArr = augend.toCharArray();
        char[] addendArr = addend.toCharArray();
        boolean incrementNext = false;

        if (augendArr.length > addendArr.length) {
            addendArr = appendByZerosToSize(addendArr, augendArr.length);
        } else if (augendArr.length < addendArr.length) {
            augendArr = appendByZerosToSize(augendArr, addendArr.length);
        }

        for (int i = augendArr.length - 1; i >= 0; i--) {
            int current = augendArr[i] + addendArr[i] - 2 * FIRST_NUMBERIC_CHAR_POSITION;

            if (incrementNext) {
                current++;
            }

            if (current > LAST_DECEMICAL_NUMBER) {
                incrementNext = true;
                current = current % DECEMICAL_BASE;
            } else {
                incrementNext = false;
            }
            //result.append(current);
            result.insert(0, current);

            if (incrementNext && i == 0) {
                result.insert(0, 1);
            }
        }

        return result.toString();
    }

    private static char[] appendByZerosToSize(char[] arr, int size) {
        if (arr.length >= size) {
            throw new IllegalArgumentException("Illegal input arguments, input array size ="
                    + arr.length + ", needed size=" + size + " must be greater.");
        }
        char[] result = new char[size];
        System.arraycopy(arr, 0, result, size - arr.length, arr.length);
        for (int i = 0; i < size - arr.length; i++) {
            result[i] = '0';
        }
        return result;
    }
}
