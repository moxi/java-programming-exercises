package org.rcgonzalezf;

public class GivenStringDetermineIfIsPalindrome {

    public boolean isPalindrome(String S) {
        S = S.toUpperCase();
        int length = S.length();
        char[] c = S.toCharArray();

        for (int left = 0, right = length - 1; left <= right; ) {
            if (isValidChar(c[left]) && isValidChar(c[right])) {
                if (c[left] != c[right]) {
                    return false;
                }
                ++left;
                --right;
            } else if (!isValidChar(c[left])) {
                ++left;
            } else if (!isValidChar(c[right])) {
                --right;
            }
        }

        return true;
    }

    public boolean isValidChar(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
