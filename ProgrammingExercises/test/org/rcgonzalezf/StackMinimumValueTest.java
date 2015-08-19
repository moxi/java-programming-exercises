package org.rcgonzalezf;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackMinimumValueTest {

    private StackMinimumValue<Integer> instaceToTest;
    private int minimumValue;
    private int newMinimumValue;

    @Before
    public void setUp() throws Exception {
        instaceToTest = new StackMinimumValue<>(Integer.MAX_VALUE);
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

    private void thenValueShouldBeNewMinimumValue() {
        assertEquals(newMinimumValue, minimumValue);
    }

    private void whenPushingNewMinimumValue(int newMinimumValue) {
        this.newMinimumValue = newMinimumValue;
        instaceToTest.push(newMinimumValue);
    }

    private void whenPopTheMinimumValue() {
        instaceToTest.pop();
    }

    private void thenValueShouldBe(int expected) {
        assertEquals(expected, minimumValue);
    }

    private void whenGettingTheMinimumValue() {
        minimumValue = instaceToTest.getMinimumValue();
    }

    private void givenStackWithTheFollowingElements(int[] elementsToPush) {
        for(int e : elementsToPush) {
            instaceToTest.push(e);
        }
    }
}
