package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstSide = input.nextInt();
        int secondSide = input.nextInt();
        int rectangleArea = firstSide*secondSide;
        System.out.println(rectangleArea);
    }
}
