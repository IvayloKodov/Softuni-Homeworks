package com.company;

import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] text = console.nextLine().toLowerCase().split("[^a-zA-z]+");

        Map<String, Integer> wordsCounter = new TreeMap<>();

        for (String word : text) {
            Integer counter = wordsCounter.get(word);
            if (counter == null) {
                counter = 0;
            }
            wordsCounter.put(word, ++counter);
        }

        int maxCounter = (Collections.max(wordsCounter.values()));
        for (Map.Entry<String, Integer> word : wordsCounter.entrySet()) {
            if (word.getValue() == maxCounter) {
                System.out.printf("%s => %d times\n", word.getKey(), word.getValue());
            }
        }
    }
}
