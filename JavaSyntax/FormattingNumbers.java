package com.company;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        while (a < 0 || a > 500) {
            a = input.nextInt();
        }
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.printf("|%-10S", Integer.toHexString(a));
        System.out.printf("|%010d|", Integer.parseInt(Integer.toBinaryString(a)));
        System.out.printf("%1$10.2f | %2$-10.3f |", b, c);
        System.out.println();
    }
}
