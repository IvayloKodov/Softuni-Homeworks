package com.company;

import java.util.Scanner;

public class P2_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine().toLowerCase();
        String word = console.nextLine().toLowerCase();

        int counter = 0;
        int wordLength = word.length();

        for (int i = 0; i < text.length() - wordLength + 1; i++) {
            if (text.substring(i, wordLength + i).equals(word)) {
                counter++;
            }
        }
        System.out.println(counter);
    }


}

