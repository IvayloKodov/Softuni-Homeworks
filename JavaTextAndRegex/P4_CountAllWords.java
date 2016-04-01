package com.company;

import java.util.Scanner;

public class P4_CountAllWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String [] text = console.nextLine().split("\\W+");
        System.out.println(text.length);
    }
}
