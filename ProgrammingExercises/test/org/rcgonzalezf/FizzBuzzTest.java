package org.rcgonzalezf;


import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz instanceToTest;
    private List<String> fizzBuzzList;
    private int n;

    @Before
    public void setUp() throws Exception {
        instanceToTest = new FizzBuzz();
    }

    @Test
    public void shouldHave1AsFirstElementAndFizzAndLastElement() throws Exception {
        givenInput(3);
        whenFizzBuzzIsCalled();
        thenFizzBuzzListShouldHaveLength(3);
        thenFirstElementShouldBe("1");
        thenLastElementShouldBe("Fizz");
    }

    @Test
    public void shouldHaveAndBuzzAsLastElement() throws Exception {
        givenInput(5);
        whenFizzBuzzIsCalled();
        thenFizzBuzzListShouldHaveLength(5);
        thenFirstElementShouldBe("1");
        thenLastElementShouldBe("Buzz");
    }

    @Test
    public void shouldHaveAndFizzBuzzAsLastElement() throws Exception {
        givenInput(15);
        whenFizzBuzzIsCalled();
        thenFizzBuzzListShouldHaveLength(15);
        thenFirstElementShouldBe("1");
        thenLastElementShouldBe("FizzBuzz");
    }

    private void thenLastElementShouldBe(String expectedFizzBuzz) {
        assertEquals(expectedFizzBuzz,fizzBuzzList.get(fizzBuzzList.size() - 1));
    }

    private void thenFirstElementShouldBe(String expectedFizzBuzz) {
        assertEquals(expectedFizzBuzz,fizzBuzzList.get(0));
    }

    private void thenFizzBuzzListShouldHaveLength(int expectedLength) {
        assertEquals(expectedLength, fizzBuzzList.size());
    }

    private void whenFizzBuzzIsCalled() {
        fizzBuzzList = instanceToTest.fizzBuzz(n);
    }

    private void givenInput(int n) {
        this.n = n;
    }
}
