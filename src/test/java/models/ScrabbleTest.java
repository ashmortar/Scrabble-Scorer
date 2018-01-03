package models;


import org.junit.Test;

import static org.junit.Assert.*;

public class ScrabbleTest {

    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(1, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForAll1ValueLetters_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(1, testScrabble.calculateScore("t"));
    }
}