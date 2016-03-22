package com.company;

import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOfTriangle = input.nextInt();
        for (int i = 1; i <= sizeOfTriangle; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= sizeOfTriangle-1; i++) {
            for (int j = 0; j < sizeOfTriangle-i; j++) {
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }
    }
}
