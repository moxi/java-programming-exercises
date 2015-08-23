package org.rcgonzalezf;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GivenSortedA2nArrayAndBnArrayMergedThemInArrayOfSizeAOrderedTest {

    GivenSortedA2nArrayAndBnArrayMergedThemInArrayOfSizeAOrdered instanceToTest;
    private int[] inputB;
    private int[] inputA;
    private int[] answer;

    @Before
    public void setUp() throws Exception {
        instanceToTest = new GivenSortedA2nArrayAndBnArrayMergedThemInArrayOfSizeAOrdered();
    }

    @Test
    public void shouldHave1AsFirstElementAndFizzAndLastElement() throws Exception {
        givenInputArrays(new int[]{1, 3, 5, 10, 11, 12, 13, 14}, new int[]{2, 3, 4, 22});
        whenMergeArraysIsCalled();
        thenShouldReturnTheFollowingArray(new int[]{1,2,3,3,4,5,10,11});
    }

    private void thenShouldReturnTheFollowingArray(int[] expectedArray) {
        assertArrayEquals(expectedArray, answer);
    }

    private void whenMergeArraysIsCalled() {
        this.answer = instanceToTest.mergeArrays(inputA, inputB);
    }

    private void givenInputArrays(int[] inputA, int[] inputB) {
        this.inputA = inputA;
        this.inputB = inputB;
    }

}
