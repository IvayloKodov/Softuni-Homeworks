package com.company;

import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 0; i < numbers.length; i += 2) {
            if (numbers.length % 2 != 0) {
                System.out.println("Invalid length");
                break;
            }
            firstNumber = Integer.parseInt(numbers[i]);
            secondNumber = Integer.parseInt(numbers[i + 1]);
            if (isOdd((firstNumber)) && isOdd(secondNumber)) {
                System.out.printf("%d, %d -> both are odd", firstNumber, secondNumber);
            } else if (isEven(firstNumber) && isEven(secondNumber)) {
                System.out.printf("%d, %d -> both are even", firstNumber, secondNumber);
            } else {
                System.out.printf("%d, %d -> different", firstNumber, secondNumber);
            }
            System.out.println();
        }
    }

    private static boolean isOdd(int number) {
        boolean isOdd = true;
        if (number % 2 == 0) {
            isOdd = false;
        }
        return isOdd;
    }

    private static boolean isEven(int number) {
        boolean isEven = true;
        if (number % 2 != 0) {
            isEven = false;
        }
        return isEven;
    }
}
