package com.company;

import java.util.Scanner;

public class SequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] words = console.nextLine().split(" ");

        for (int i = 0; i < words.length-1; i++) {
            if (words[i].equals(words[i+1])){
                System.out.printf(words[i]+" ");
            }else{
                System.out.println(words[i]);
            }
        }
        System.out.println(words[words.length-1]);
    }
}
