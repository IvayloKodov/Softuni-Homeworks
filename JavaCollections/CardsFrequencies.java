package com.company;

import java.util.*;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] cards = console.nextLine().split("[^0-9AKQJ]+");
        LinkedHashMap<String, Integer> cardsReader = new LinkedHashMap<>();

        for (String card : cards) {
            if (cardsReader.containsKey(card)) {
                cardsReader.put(card, cardsReader.get(card) + 1);
            } else {
                cardsReader.put(card, 1);
            }
        }
        for (Map.Entry<String, Integer> card : cardsReader.entrySet()) {
            double frequency = card.getValue() / (double) cards.length;
            System.out.printf("%s -> %.2f%%\n", card.getKey(), frequency * 100);
        }
    }
}
