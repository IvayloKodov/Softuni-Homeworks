package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] numbers = console.nextLine().split(" ");
        String[] command = console.nextLine().split(" ");
        int reguest = Integer.parseInt(command[1]);

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        //Filling two list of integers ...
        for (int i = 0; i < numbers.length; i++) {
            int parseNumbers = Integer.parseInt(numbers[i]);
            if (parseNumbers % 2 == 0) {
                evenNumbers.add(parseNumbers);
            } else {
                oddNumbers.add(parseNumbers);
            }
        }
        //Execute,the command - odd or even, and the request of numbers
        if (command[2].equals("odd")) {
            for (int i = 0; i < reguest; i++) {
                if (reguest <= oddNumbers.size()) {
                    System.out.print(oddNumbers.get(i) + " ");
                    continue;
                }
                System.out.print(oddNumbers);
                break;
            }
        } else {
            for (int i = 0; i < reguest; i++) {
                if (reguest <= evenNumbers.size()) {
                    System.out.print(evenNumbers.get(i) + " ");
                    continue;
                }
                System.out.print(evenNumbers);
                break;
            }
        }
    }
}
