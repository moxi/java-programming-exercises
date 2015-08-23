package org.rcgonzalezf;

public class GivenSortedA2nArrayAndBnArrayMergedThemInArrayOfSizeAOrdered {

    // a = (1,3,5,10,11,12,13,14)
    // b = (2,3,4,22)
    // c = (1,2,3,3,4,5,10,22)
    public int[] mergeArrays(int[] a, int[] b) {
          int[] c = new int[a.length];
          int j = 0, k = 0;
          for(int i = 0; k < c.length;) {
              if (a[i] <= b[j]) {
                c[k++] = a[i++];
              } else {
                c[k++] = b[j++];
              }
          }
          return c;
    }
}
