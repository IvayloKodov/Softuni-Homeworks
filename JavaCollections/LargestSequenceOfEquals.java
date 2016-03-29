package com.company;

import java.util.Scanner;

public class LargestSequenceOfEquals {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] words = console.nextLine().split(" ");
        int maxCounter = 1;
        int counter = 1;
        String result = " ";

        for (int i = 0; i < words.length; i++) {
            for (int j = 1 + i; j < words.length; j++) {
                if (words[i++].equals(words[j])) {
                    counter++;
                    continue;
                } else {
                    i--;
                    break;
                }
            }
            if (maxCounter < counter) {
                maxCounter = counter;
                result = words[i];
            } else if (maxCounter == 1) {
                result = words[0];
            }
            counter = 1;
        }
        for (int i = 0; i < maxCounter; i++) {
            System.out.printf("%s ", result);
        }
    }
}
