package org.rcgonzalezf;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RansomNoteTest {

    private RansomNote instanceToTest;
    private String magazine;
    private String ransomNote;
    private boolean canCreateRansomNote;

    @Before
    public void setUp() throws Exception {
        instanceToTest = new RansomNote();
        magazine = "Hello gray hair , are you going to put color on your gray window ?";
    }

    @Test
    public void shouldReturnFalseForWordsNotInMagazine() throws Exception {
        givenRansomNome("Color gray ");
        whenCheckingThatRansomNoteCanBeCreated();
        thenRansomNoteCanBeCreatedShouldBe(false);
    }

    @Test
    public void shouldReturnTrueForWordsInMagazine() throws Exception {
        givenRansomNome("color gray ");
        whenCheckingThatRansomNoteCanBeCreated();
        thenRansomNoteCanBeCreatedShouldBe(true);
    }

    @Test
    public void shouldReturnFalseForNotEnoughWordsInMagazine() throws Exception {
        givenRansomNome("color gray gray gray");
        whenCheckingThatRansomNoteCanBeCreated();
        thenRansomNoteCanBeCreatedShouldBe(false);
    }

    @Test
     public void shouldReturnFalseForEmptyRansomNote() throws Exception {
        givenRansomNome("");
        whenCheckingThatRansomNoteCanBeCreated();
        thenRansomNoteCanBeCreatedShouldBe(false);
    }

    @Test
    public void shouldReturnFalseForRansomNoteWithMoreWordsThanMagazine() throws Exception {
        givenRansomNome(magazine + "extra words");
        whenCheckingThatRansomNoteCanBeCreated();
        thenRansomNoteCanBeCreatedShouldBe(false);
    }

    private void thenRansomNoteCanBeCreatedShouldBe(boolean expected) {
        assertEquals(expected, canCreateRansomNote);
    }

    private void whenCheckingThatRansomNoteCanBeCreated() {
        this.canCreateRansomNote = instanceToTest.canRansom(ransomNote, magazine);
    }

    private void givenRansomNome(String ransomNote) {
        this.ransomNote = ransomNote;
    }
}
