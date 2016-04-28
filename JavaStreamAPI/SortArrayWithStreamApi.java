package com.company;

import java.util.*;

public class SortArrayWithStreamApi {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split("\\s");
        String sortingOrder = console.nextLine();

        Integer[] numbers = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        if (sortingOrder.equals("Ascending")) {
            Arrays.stream(numbers)
                    .sorted()
                    .forEach(number -> System.out.print(number + " "));
        } else {
            Arrays.stream(numbers)
                    .sorted(Comparator.reverseOrder())
                    .forEach(number -> System.out.print(number + " "));
        }
    }
}
