package org.rcgonzalezf;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GivenTwoStringsDetermineIfTheyAreOneChangeApartTest {

    private GivenTwoStringsDetermineIfTheyAreOneChangeApart instanceUnderTest;
    private String stringTwo;
    private String stringOne;
    private boolean oneEditApart;

    @Before
    public void setUp() throws Exception {
        instanceUnderTest = new GivenTwoStringsDetermineIfTheyAreOneChangeApart();
    }

    @Test
    public void shouldReturnTrueForOneReplacementCase() throws Exception {
        givenTwoString("cat", "cut");
        whenCheckingIfTheyAreOneEditApart();
        thenShouldOneEditApartShouldBe(true);
    }

    @Test
    public void shouldReturnFalseForTwoEditsApart() throws Exception {
        givenTwoString("cat", "cuts");
        whenCheckingIfTheyAreOneEditApart();
        thenShouldOneEditApartShouldBe(false);
    }

    @Test
    public void shouldReturnTrueForOneRemovalOrInsertionFirstStringCase() throws Exception {
        givenTwoString("cat", "cats");
        whenCheckingIfTheyAreOneEditApart();
        thenShouldOneEditApartShouldBe(true);
    }

    @Test
    public void shouldReturnTrueForOneRemovalOrInsertionSecondStringCase() throws Exception {
        givenTwoString("cat", "ct");
        whenCheckingIfTheyAreOneEditApart();
        thenShouldOneEditApartShouldBe(true);
    }

    @Test
    public void shouldReturnFalseForMoreThanOneRemovalOrInsertionFirstStringCase() throws Exception {
        givenTwoString("cat", "cars");
        whenCheckingIfTheyAreOneEditApart();
        thenShouldOneEditApartShouldBe(false);
    }

    @Test
    public void shouldReturnFalseForMoreThanOneRemovalOrInsertionSecondStringCase() throws Exception {
        givenTwoString("core", "car");
        whenCheckingIfTheyAreOneEditApart();
        thenShouldOneEditApartShouldBe(false);
    }

    @Test
    public void shouldReturnFalseForASecondStringWithMoreThanTwoCharactersOfLength() throws Exception {
        givenTwoString("ca", "carts");
        whenCheckingIfTheyAreOneEditApart();
        thenShouldOneEditApartShouldBe(false);
    }

    private void thenShouldOneEditApartShouldBe(boolean expected) {
        assertEquals(expected, oneEditApart );
    }

    private void whenCheckingIfTheyAreOneEditApart() {
        this.oneEditApart = instanceUnderTest.areOneEditApart(stringOne, stringTwo);
    }

    private void givenTwoString(String stringOne, String stringTwo) {
        this.stringOne = stringOne;
        this.stringTwo = stringTwo;
    }
}
