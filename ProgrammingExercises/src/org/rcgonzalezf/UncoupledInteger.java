package org.rcgonzalezf;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class UncoupledInteger {

    public static void main(String... args) {
        UncoupledInteger finder = new UncoupledInteger();

        int[] sample = new int[]{1,2,1,5,6,3,1,4,5,1,
                                  6,3,2,4,2};

        int result = finder.getUncoupledIntegerUsingXor(sample);
        System.out.println("result 2 is " +  result);

        result = finder.getUncoupledIntegerUsingSet(sample);
        System.out.println("result 2 is " + result );

    }

    public int getUncoupledIntegerUsingXor(int[] input) {
        int mask = 0;
        for(int element : input) {
            mask ^= element;
        }
        return mask;
    }

    public int getUncoupledIntegerUsingSet(int[] input) {
        Set<Integer> uncoupledSet = new HashSet<>();

        for(int element: input) {
            if (uncoupledSet.contains(element)) {
                uncoupledSet.remove(element);
            } else {
                uncoupledSet.add(element);
            }
        }

        int uncoupled = getUncoupled(uncoupledSet);
        return uncoupled;
    }
    
    private int getUncoupled(Set<Integer> uncoupledSet) {
        int result = 0;

        for (Integer i: uncoupledSet) {
            result = i;
        }
        
        return result;
    }
    
}
