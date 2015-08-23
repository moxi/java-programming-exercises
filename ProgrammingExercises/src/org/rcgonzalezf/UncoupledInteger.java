package org.rcgonzalezf;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class UncoupledInteger {

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

        return getUncoupled(uncoupledSet);
    }
    
    private int getUncoupled(Set<Integer> uncoupledSet) {
        int result = 0;

        for (Integer i: uncoupledSet) {
            result = i;
        }
        
        return result;
    }
    
}
