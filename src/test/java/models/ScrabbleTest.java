package models;


import org.junit.Test;

import static org.junit.Assert.*;

public class ScrabbleTest {

    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForAllLetters_10() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 10;
        assertEquals(expected, testScrabble.calculateScore("z"));
    }

    @Test
    public void calculateScore_returnsScoreForMulptileLetters_12() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 12;
        assertEquals(expected, testScrabble.calculateScore("jonas"));
    }
}