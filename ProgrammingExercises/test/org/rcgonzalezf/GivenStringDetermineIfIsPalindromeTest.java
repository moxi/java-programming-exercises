package org.rcgonzalezf;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GivenStringDetermineIfIsPalindromeTest {

    private char c;
    private GivenStringDetermineIfIsPalindrome instanceUnderTest;
    private boolean isValidChar;
    private String s;
    private boolean isPalindrome;

    @Before
    public void setUp() throws Exception {
        instanceUnderTest = new GivenStringDetermineIfIsPalindrome();
    }

    @Test
    public void shouldReturnTrueForSingleString() throws Exception {
        givenString("S");
        whenCheckingIfIsPalindrome();
        thenShouldBePalindrome(true);
    }

    @Test
    public void shouldReturnTrueForAmanaplanacanalPanamaString() throws Exception {
        givenString("AmanaplanacanalPanama");
        whenCheckingIfIsPalindrome();
        thenShouldBePalindrome(true);
    }

    @Test
    public void shouldReturnFalseForRandomString() throws Exception {
        givenString("Random");
        whenCheckingIfIsPalindrome();
        thenShouldBePalindrome(false);
    }

    @Test
    public void shouldReturnTrueForAmanaplanacanalPanamaWithPunctuationString() throws Exception {
        givenString("A man, a plan, a canal, Panama.");
        whenCheckingIfIsPalindrome();
        thenShouldBePalindrome(true);
    }

    @Test
     public void shouldReturnTrueForAbbaWithPunctuationString() throws Exception {
        givenString("Ab.....ba");
        whenCheckingIfIsPalindrome();
        thenShouldBePalindrome(true);
    }

    @Test
    public void shouldReturnTrueForAbbaWithPunctuationInTheMiddleString() throws Exception {
        givenString("A..b..b....a");
        whenCheckingIfIsPalindrome();
        thenShouldBePalindrome(true);
    }

    @Test
    public void shouldReturnFalseForAbbbaaString() throws Exception {
        givenString("Abbbaa");
        whenCheckingIfIsPalindrome();
        thenShouldBePalindrome(false);
    }

    private void thenShouldBePalindrome(boolean expected) {
        assertEquals(expected, isPalindrome);
    }

    private void whenCheckingIfIsPalindrome() {
        isPalindrome = instanceUnderTest.isPalindrome(s);
    }

    private void givenString(String s) {
        this.s = s;
    }

    @Test
    public void shouldReturnTrueIfGetsValidChar() throws Exception {
        givenAChar('Z');
        whenIsValidChar();
        thenResultShouldBe(true);
    }

    @Test
    public void shouldReturnFalseIfGetsAnInvalidChar() throws Exception {
        givenAChar('a');
        whenIsValidChar();
        thenResultShouldBe(false);
    }

    private void thenResultShouldBe(boolean expected) {
        assertEquals(expected, isValidChar);
    }

    private void whenIsValidChar() {
        isValidChar = instanceUnderTest.isValidChar(c);
    }

    private void givenAChar(char c) {
        this.c = c;
    }
}