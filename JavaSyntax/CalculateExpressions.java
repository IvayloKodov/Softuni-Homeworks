package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;

public class CalculateExpressions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double firstFormule = Math.pow((Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2)),(a+b+c)/Math.sqrt(c));
        double secondFormule = Math.pow((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3)),a-b);
        System.out.printf("F1 result: %.2f;",firstFormule);
        System.out.printf(" F2 result: %.2f;",secondFormule);
        System.out.printf(" diff: %.2f", Math.abs(((a+b+c)/3)-((firstFormule+secondFormule)/2)));
    }
}

