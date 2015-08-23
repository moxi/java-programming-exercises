package org.rcgonzalezf;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UncoupledIntegerTest {

    private UncoupledInteger instanceToTest;
    private int[] inputArray;
    private int uncoupledInteger;
    private int[] example;
    private int[] arrayWithDistinctValues;

    @Before
    public void setUp() throws Exception {
        example = new int[]{1,2,1,5,6,3,1,4,5,1,
                6,3,2,4,2};
        arrayWithDistinctValues = new int[]{1, 3, 5, 10, 11, 12, 13, 14};
        instanceToTest = new UncoupledInteger();
    }

    @Test
    public void shouldReturnNineValueWithTheArrayWithDistinctElementsUsingXorImplementation() throws Exception {
        givenInputArray(arrayWithDistinctValues);
        whenGettingTheUncoupledElementUsingXor();
        thenShouldReturn(9);
    }

    @Test
    public void shouldReturnLastElementForAnArrayWithDistinctElementsUsingSetImplementation() throws Exception {
        givenInputArray(arrayWithDistinctValues);
        whenGettingTheUncoupledElementUsingSet();
        thenShouldReturn(14);
    }

    @Test
    public void shouldReturnTwoValueUsingXorImplementationWithTheExampleArray() throws Exception {
        givenInputArray(example);
        whenGettingTheUncoupledElementUsingXor();
        thenShouldReturn(2);
    }

    @Test
    public void shouldReturnTwoValueUsingSetImplementationWithTheExampleArray() throws Exception {
        givenInputArray(example);
        whenGettingTheUncoupledElementUsingSet();
        thenShouldReturn(2);
    }

    private void whenGettingTheUncoupledElementUsingSet() {
        uncoupledInteger = instanceToTest.getUncoupledIntegerUsingSet(inputArray);
    }

    private void thenShouldReturn(int expected) {
        assertEquals(expected, uncoupledInteger);
    }

    private void whenGettingTheUncoupledElementUsingXor() {
        uncoupledInteger = instanceToTest.getUncoupledIntegerUsingXor(inputArray);
    }

    private void givenInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

}
