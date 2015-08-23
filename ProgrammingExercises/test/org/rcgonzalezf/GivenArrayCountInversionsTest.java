package org.rcgonzalezf;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GivenArrayCountInversionsTest {

    private GivenArrayCountInversions instanceToTest;
    private int[] input;
    private int numberOfInversions;

    @Before
    public void setUp() throws Exception {
        instanceToTest = new GivenArrayCountInversions();
    }

    @Test
    public void shouldReturnZeroForOrderedArray() throws Exception {
        givenInputArray(new int[]{1, 2, 3, 6, 7});
        whenCountInversions();
        thenShouldBeInversionEqualsTo(0);
    }

    @Test
    public void shouldReturnThreeForSampleArray() throws Exception {
        givenInputArray(new int[]{1, 3, 5, 2, 4, 6});
        whenCountInversions();
        thenShouldBeInversionEqualsTo(3);
    }

    @Test
    public void shouldReturn15ForEntirelyUnsortedArrayOfSixEntries() throws Exception {
        givenInputArray(new int[]{6, 5, 4, 3, 2, 1});
        whenCountInversions();
        thenShouldBeInversionEqualsTo(15);
    }

    private void thenShouldBeInversionEqualsTo(int expected) {
        assertEquals(expected, numberOfInversions);
    }

    private void whenCountInversions() {
        numberOfInversions = instanceToTest.solution(input);
    }

    private void givenInputArray(int[] input) {
        this.input = input;
    }
}