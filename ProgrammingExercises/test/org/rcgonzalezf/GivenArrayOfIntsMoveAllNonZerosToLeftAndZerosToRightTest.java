package org.rcgonzalezf;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GivenArrayOfIntsMoveAllNonZerosToLeftAndZerosToRightTest {

    private int[] input;
    private GivenArrayOfIntsMoveAllNonZerosToLeftAndZerosToRight instanceToTest;
    private int[] solution;

    @Before
    public void setUp() throws Exception {
        instanceToTest = new GivenArrayOfIntsMoveAllNonZerosToLeftAndZerosToRight();
    }

    @Test
    public void shouldMoveTheZerosToTheRight() throws Exception {
        givenAnArrayAsInput(new int[]{6, 4, 0, 5, 0, 1, 0});
        whenSolutionIsCalled();
        thenSolutionShouldEqualTo(new int[]{1, 5, 4, 6, 0, 0, 0});
    }

    @Test
    public void shouldReturnSameArrayIfNoZerosInTheArray() throws Exception {
        int[] input = new int[]{6, 4, 5, 1};
        givenAnArrayAsInput(input);
        whenSolutionIsCalled();
        thenSolutionShouldEqualTo(input);
    }

    @Test
    public void shouldReturnSameArrayIfAllElementsAreZeros() throws Exception {
        int[] input = new int[]{0, 0, 0, 0};
        givenAnArrayAsInput(input);
        whenSolutionIsCalled();
        thenSolutionShouldEqualTo(input);
    }

    private void thenSolutionShouldEqualTo(int[] expectedArray) {
        assertArrayEquals(expectedArray, solution);
    }

    private void whenSolutionIsCalled() {
        solution = instanceToTest.solution(input);
    }

    private void givenAnArrayAsInput(int[] input) {
        this.input = input;
    }
}