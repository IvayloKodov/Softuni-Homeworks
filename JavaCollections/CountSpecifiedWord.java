package com.company;

import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] text = console.nextLine().toLowerCase().split("[^a-zA-z]+");
        String word = console.nextLine();
        int counter = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i].equals(word)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
