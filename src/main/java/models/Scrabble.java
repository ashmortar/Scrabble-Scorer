package models;

import java.util.Map;
import java.util.HashMap;

public class Scrabble {

    private Map<Character, Integer> scores = new HashMap<Character, Integer>();
    private int finalScore = 0;


    public Integer calculateScore(String input) {
        char[] word = input.toCharArray();
        Character[] worth1Point = {'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't'};
        Character[] worth2Points = {'d', 'g'};
        Character[] worth3Points = {'b', 'c', 'm', 'p'};
        Character[] worth4Points = {'f', 'h', 'v', 'w', 'y'};
        Character[] worth5Points = {'k'};
        Character[] worth8Points = {'j', 'x'};
        Character[] worth10Points = {'q', 'z'};

        for (Character chars : worth1Point) {
            scores.put(chars, 1);
        }
        for (Character chars : worth2Points) {
            scores.put(chars, 2);
        }
        for (Character chars : worth3Points) {
            scores.put(chars, 3);
        }
        for (Character chars : worth4Points) {
            scores.put(chars, 4);
        }
        for (Character chars : worth5Points) {
            scores.put(chars, 5);
        }
        for (Character chars : worth8Points) {
            scores.put(chars, 8);
        }
        for (Character chars : worth10Points) {
            scores.put(chars, 10);
        }

        for (Character index : word) {
            finalScore += scores.get(index);
        }

        return finalScore;
    }
}