package org.rcgonzalezf;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GivenArrayReturnTrueIfThreeElementsSumZeroTest {

    int[] input;
    boolean returnValue;
    GivenArrayReturnTrueIfThreeElementsSumZero problem;

    @Before
    public void setup() {
         problem = new GivenArrayReturnTrueIfThreeElementsSumZero();
    }

    @Test
    public void shouldReturnFalseIfArrayIsLessThanThreeElements() {
        givenArrayOfTwoElements();
        whenSolutionMethodIsCalled();
        shouldReturn(false);
    }

    @Test
    public void shouldReturnFalseIfInputArrayOnlyHasPositives() {
        givenArrayOfPositiveElements();
        whenSolutionMethodIsCalled();
        shouldReturn(false);
    }

    @Test
    public void shouldReturnFalseIfInputArrayOnlyHasNegatives() {
        givenArrayOfNegativeElements();
        whenSolutionMethodIsCalled();
        shouldReturn(false);
    }

    @Test
    public void shouldReturnTrueIfInputArrayOnlyHasNegativesThreeZeroes() {
        givenArrayWithThreeZeroes();
        whenSolutionMethodIsCalled();
        shouldReturn(true);
    }

    @Test
    public void shouldReturnFalseIfInputArrayHasNegativesAndTwoZeroesWithNoPositives() {
        givenArrayWithTwoZeroesAndNegatives();
        whenSolutionMethodIsCalled();
        shouldReturn(false);
    }

    @Test
    public void shouldReturnTrueIfInputArrayHasNegativesAndTwoZeroesWithPositivesThatMatchesTheCondition() {
        givenArrayWithAValidMatch();
        whenSolutionMethodIsCalled();
        shouldReturn(true);

        givenTheFollowingInput(new int[]{-1, -1, 2});
        whenSolutionMethodIsCalled();
        shouldReturn(true);
    }

    private void givenTheFollowingInput(int[] input) {
        this.input = input;
    }

    private void givenArrayWithAValidMatch() {
        input = new int[]{-10,0,1,3,54,120312,10};
    }

    private void givenArrayWithTwoZeroesAndNegatives() {
        input = new int[]{-1,-2,-3,0,0};
    }

    private void givenArrayWithThreeZeroes() {
        input = new int[]{1,2,4,0,0,0};
    }

    private void givenArrayOfNegativeElements() {
        input = new int[]{-1,-2,-1,-1000,-5,-60};
    }

    private void givenArrayOfPositiveElements() {
        input = new int[]{1,2,3,4,0,0};
    }

    private void shouldReturn(boolean expected) {
        assertEquals(expected, returnValue);
    }

    private void whenSolutionMethodIsCalled() {
        returnValue = problem.solution(input);
    }

    private void givenArrayOfTwoElements() {
        input = new int[]{0,0};
    }
}
