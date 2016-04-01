package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P7_MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstWord = console.next();
        String secondWord = console.next();

        Map<Character, Character> exchangeableMap = new HashMap<Character, Character>();
        boolean isExchangeable = true;
        for (int i = 0; i < firstWord.length(); i++) {

            if (!exchangeableMap.containsKey(firstWord.charAt(i))) {
                exchangeableMap.put(firstWord.charAt(i), secondWord.charAt(i));
            } else {
                if (!exchangeableMap.get(firstWord.charAt(i)).equals(secondWord.charAt(i))) {
                    isExchangeable = false;
                }
            }
        }
        System.out.println(isExchangeable);
    }
}
