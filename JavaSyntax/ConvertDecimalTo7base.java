package com.company;

import java.util.Scanner;

public class ConvertDecimalTo7base {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = "";
        while (number > 0) {
            result += number % 7;
            number /= 7;
        }
        StringBuilder reversedResult = new StringBuilder(result).reverse();
        System.out.println(reversedResult);
    }
}
