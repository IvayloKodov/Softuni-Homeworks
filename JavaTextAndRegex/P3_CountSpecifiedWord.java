package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P3_CountSpecifiedWord {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] text = console.nextLine().toLowerCase().split("\\W");
        String searchWord = console.nextLine();

        int counter = 0;
        for (String name : text) {
            if (name.equals(searchWord)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}


