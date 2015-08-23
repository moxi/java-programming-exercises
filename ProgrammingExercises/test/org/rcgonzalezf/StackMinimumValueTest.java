package org.rcgonzalezf;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackMinimumValueTest {

    private StackMinimumValue<Integer> instanceToTest;
    private int minimumValue;
    private int newMinimumValue;

    @Before
    public void setUp() throws Exception {
        minimumValue = Integer.MAX_VALUE;
        instanceToTest = new StackMinimumValue<>(minimumValue);
    }

    @Test
    public void shouldReturnMinimumValueAfterPushingSeveralElementsGreaterThanSeven() throws Exception {
        givenStackWithTheFollowingElements(new int[]{10, 9, 11, 12, 7, 15, 16});
        whenGettingTheMinimumValue();
        thenValueShouldBe(7);
    }

    @Test
    public void shouldReturnSecondMinimumValueAfterPopThePreviousMinimumValue() throws Exception {
        givenStackWithTheFollowingElements(new int[]{10, 9, 11, 12, 7});
        whenGettingTheMinimumValue();
        thenValueShouldBe(7);
        whenPopTheMinimumValue();
        whenGettingTheMinimumValue();
        thenValueShouldBe(9);
    }

    @Test
    public void shouldReturnNewMinimumValueAfterPopThePreviousMinimumValue() throws Exception {
        givenStackWithTheFollowingElements(new int[]{10, 9, 11, 12, 7});
        whenGettingTheMinimumValue();
        thenValueShouldBe(7);
        whenPushingNewMinimumValue(5);
        whenGettingTheMinimumValue();
        thenValueShouldBeNewMinimumValue();
    }

    @Test
    public void shouldReturnDefaultCreationValueForAnEmptyStack() throws Exception {
        givenStackWithTheFollowingElements(new int[]{});
        whenGettingTheMinimumValue();
        thenValueShouldBe(minimumValue);
    }

    private void thenValueShouldBeNewMinimumValue() {
        assertEquals(newMinimumValue, minimumValue);
    }

    private void whenPushingNewMinimumValue(int newMinimumValue) {
        this.newMinimumValue = newMinimumValue;
        instanceToTest.push(newMinimumValue);
    }

    private void whenPopTheMinimumValue() {
        instanceToTest.pop();
    }

    private void thenValueShouldBe(int expected) {
        assertEquals(expected, minimumValue);
    }

    private void whenGettingTheMinimumValue() {
        minimumValue = instanceToTest.getMinimumValue();
    }

    private void givenStackWithTheFollowingElements(int[] elementsToPush) {
        for(int e : elementsToPush) {
            instanceToTest.push(e);
        }
    }
}
