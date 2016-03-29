package com.company;

import java.util.Scanner;

public class CalculateNFactorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.println(calculateFactorial(number));
    }

    private static long calculateFactorial(int n){
        long result;
        if (n==1){
            return 1;
        }
        result =calculateFactorial(n-1)*n;
        return result;    }
}
