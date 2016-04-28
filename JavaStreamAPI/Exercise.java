package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] elements = console.nextLine().split("\\s");

        List<Integer> result = Arrays.stream(elements)
                .filter(Exercise::isNumber)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = result.stream().reduce((x, y) -> x + y).get();
        //int secondSum = result.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    private static boolean isNumber(String myString) {
        for (Character ch : myString.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
