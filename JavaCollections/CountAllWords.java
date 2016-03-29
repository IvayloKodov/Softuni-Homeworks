package com.company;

import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String []text = console.nextLine().split("[^a-zA-Z]+");
        System.out.println(text.length);
    }
}
