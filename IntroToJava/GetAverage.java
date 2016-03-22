package com.company;

import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        double average = averageNumber(firstNumber,secondNumber,thirdNumber);
        System.out.format("%.2f", average);
    }

    public static double averageNumber(double n1, double n2, double n3){
        double result  = (n1+n2+n3)/3;
        return result;
    }
}
