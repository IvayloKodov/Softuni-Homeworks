package com.company;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] words = console.nextLine().split(" ");
        System.out.println(stringMultiplier(words[0], words[1]));
    }

    private static Integer stringMultiplier(String str1, String str2) {
        int sum = 0;
        int maxChars = Math.max(str1.length(), str2.length());
        int index = 0;

        for (int i = 0; i < maxChars; i++) {
            if (str1.length() > str2.length()) {
                if (index == str2.length()) {
                    sum += str1.charAt(i);
                } else {
                    sum += str1.charAt(i) * str2.charAt(index);
                    index++;
                }
            } else if (str2.length() > str1.length()) {
                if (index == str1.length()) {
                    sum += str2.charAt(i);
                } else {
                    sum += str2.charAt(i) * str1.charAt(index);
                    index++;
                }
            } else {
                sum += str1.charAt(i) * str2.charAt(i);
            }
        }
        return sum;
    }
}
