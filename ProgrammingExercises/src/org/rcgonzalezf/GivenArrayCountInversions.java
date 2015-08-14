package org.rcgonzalezf;

// Using mergeSort to solve this problem
// O n log n
public class GivenArrayCountInversions {

    public int solution(int[] A) {
        return countInversions(A);
    }

    public int countInversions(int[] A) {
        if (A.length == 1) {
            return 0;
        }
        int middle = A.length / 2;

        int[] left = new int[middle];

        for (int i = 0; i < middle; ++i) {
            left[i] = A[i];
        }

        int x = countInversions(left);

        int[] right = new int[A.length - middle];

        for (int i = 0, j = middle; j < A.length; ++i, ++j) {
            right[i] = A[j];
        }

        int y = countInversions(right);

        int[] split = new int[A.length];

        int z = mergeAndCount(left, right, split);

        for (int i = 0; i < A.length; ++i) {
            A[i] = split[i];
        }

        return x + y + z;

    }

    public int mergeAndCount(int[] left, int[] right, int[] result) {
        int splits = 0;
        int i = 0, j = 0, k = 0;
        for (; i < left.length && j < right.length; ++k) {
            if (left[i] > right[j]) {
                result[k] = right[j++];
                splits += left.length - i;
            } else if (left[i] <= right[j]) {
                result[k] = left[i++];
            }
        }

        if (i == left.length) {
            for (; j < right.length; ++j) {
                result[k++] = right[j];
            }
        } else {
            for (; i < left.length; ++i) {
                result[k++] = left[i];
            }
        }

        return splits;
    }

}
