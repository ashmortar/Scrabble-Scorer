package models;

import java.util.Map;
import java.util.HashMap;

public class Scrabble {

    private String word;
    private int Score;

    public Scrabble() {
        this.word = word;


    }

    public int calculateScore(String word) {
        if (word == "a") {
            return 1;
        } else {
            return 0;
        }
    }
}
