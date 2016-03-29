package com.company;

import java.util.*;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input  = console.nextLine().split("\\s");
        int[] numbers = new int[input.length+1]; // length +1 , to print the last one of sequence;
        for (int i = 0; i < input.length; i++) {
            numbers[i]=Integer.parseInt(input[i]);
        }
        numbers[numbers.length]=Integer.MIN_VALUE;//the smallest number,to have correct
        // comparisons in the end.

        int currentCount = 1;
        int maxCount = 1;
        int maxStartIndex=0;

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i]+" ");
            if (numbers[i]<numbers[i+1]){
                currentCount++;
                if (currentCount>maxCount){
                    maxCount=currentCount;
                    maxStartIndex=i-currentCount+2;
                }
            }else{
                currentCount=1;
                System.out.println();
            }
        }
        System.out.print("Longest: ");
        for (int i = maxStartIndex; i <maxStartIndex+maxCount ; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
