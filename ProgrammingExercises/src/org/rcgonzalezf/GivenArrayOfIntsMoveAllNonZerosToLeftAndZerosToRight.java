package org.rcgonzalezf;

/**
 * Given an array of ints = [6, 4, 0, 5, 0, 0, 0, 1, 0]
 * move all non zero numbers to the left and zeros to the right.
 * How can you now improve your answer to O(n)?
 */
public class GivenArrayOfIntsMoveAllNonZerosToLeftAndZerosToRight {

    // N is number of zeroes
    public int[] solution(int[] input) {
        int length = input.length, N = length - 1;
        int[] solution = new int[length];

        for (int element: input) {
            if(element==0) {
                solution[N--]=element;
            }
        }

        if ( N != length - 1) {
            for (int element: input) {
                if (element != 0) {
                   solution[N--] = element;
                }
            }
            return solution;
        } else {
            return input;
        }
    }

}
