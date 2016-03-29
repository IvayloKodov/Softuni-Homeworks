package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] text = console.nextLine().toLowerCase().split("[^a-zA-z]+");
        List<String> outputList = new ArrayList<>();
        Arrays.sort(text);

        for (int i = 0; i < text.length; i++) {
            if (!outputList.contains(text[i])) {
                outputList.add(text[i]);
            }
        }
        for (String word : outputList) {
            System.out.printf("%s ", word);
        }
    }
}
