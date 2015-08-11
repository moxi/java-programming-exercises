package org.rcgonzalezf;

import java.util.Set;
import java.util.HashSet;

/**
 * Description:  Given an array, write a function that return true if any 3 elements of this array can sum to 0.
 * Expected O(N^2)
 */
public class GivenArrayReturnTrueIfThreeElementsSumZero {


    public boolean solution(int[] input) {
        int length = input.length;

        if (length < 3) {
            return false;
        }

        // x + y + z = 0  => -z = x + y
        final Set<Integer> z = new HashSet<>(length);
        int zeroCounter = 0, sum; // if they're more than 3 zeros we're done

        for (int element : input) {
            if (element < 0) {
                z.add(element);
            }

            if (element == 0) {
                ++zeroCounter;
                if (zeroCounter >= 3) {
                    return true;
                }
            }
        }

        if (z.isEmpty() || z.size() == length || (z.size() + zeroCounter == length)) {
            return false;
        } else {
            for (int x = 0; x < length; ++x) {
                for (int y = x + 1; y < length; ++y) {
                    sum = input[x] + input[y]; // will use it as inverse addition
                    if (sum < 0) {
                        continue;
                    }
                    if (z.contains(sum * -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
