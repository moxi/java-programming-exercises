package org.rcgonzalezf;

public class GivenTwoStringsDetermineIfTheyAreOneChangeApart {

    public boolean areOneEditApart(String stringOne, String stringTwo) {
        int lengthDiff = Math.abs(stringOne.length() - stringTwo.length());
        
        if (lengthDiff >= 2) {
            return false;
        }
        int operationsAvailable = 1;

        int i = 0, j = 0;

        while (i < stringOne.length() && j < stringTwo.length()) {
            char c1 = stringOne.charAt(i);
            char c2 = stringTwo.charAt(j);

            if (c1 != c2) {
                if (stringOne.length() > stringTwo.length()) {
                    ++i;
                } else if (stringOne.length() < stringTwo.length()) {
                    ++j;
                } else {
                    ++i;
                    ++j;
                }
                --operationsAvailable;
            } else {
                ++i;
                ++j;
            }
        }


        return operationsAvailable >= 0;
    }
}
