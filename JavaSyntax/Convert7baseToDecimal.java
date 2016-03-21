package com.company;

import java.util.Scanner;

public class Convert7baseToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = 0;

        for (int i = 0; i < String.valueOf(number).length(); i++) {
            result += ((int) (number / Math.pow(10, i)) % 10) * Math.pow(7, i);
        }
        System.out.println(result);
    }
}
