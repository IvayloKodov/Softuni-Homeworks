package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        String secondString = scanner.next();
        System.out.println(isExchangeable(firstString, secondString));
    }

    private static boolean isExchangeable(String firstString, String secondString) {
        HashMap<Character, Character> exchangeable = new HashMap<>();

        for (int i = 0; i < firstString.length(); i++) {
            if (exchangeable.containsKey(firstString.charAt(i))) {
                if (secondString.charAt(i) != exchangeable.get(firstString.charAt(i))) {
                    return false;
                }
            } else if (exchangeable.containsValue(secondString.charAt(i))) {
                return false;
            } else {
                exchangeable.put(firstString.charAt(i), secondString.charAt(i));
            }
        }
        return true;
    }
}
