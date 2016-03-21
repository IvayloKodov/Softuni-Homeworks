package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String sentence = console.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher result = pattern.matcher(sentence);
        while (result.find()) {
            System.out.printf("%s ", result.group(0));
        }
    }
}
