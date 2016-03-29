package com.company;

import java.util.Scanner;

public class ExerciseRecursion {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        printRecursive(number);

    }

    private static void printRecursive(int number) {
        if (number < 1) {
            return;
        }
        printRecursive(number - 1);
        System.out.println(number);
    }
}
