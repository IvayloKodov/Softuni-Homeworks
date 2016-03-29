package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArrayOfNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sequenceOfNumbers= console.nextInt();
        int[] numbers =new int[sequenceOfNumbers];
        for (int i = 0; i < sequenceOfNumbers; i++) {
            numbers[i]= console.nextInt();
        }
        Arrays.sort(numbers);
        for (Integer number: numbers){
            System.out.printf(number+" ");
        }
    }
}
