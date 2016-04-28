package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] text = console.nextLine().split("\\s");

        Arrays.stream(text).filter(name -> name.length()>3)
                .forEach(name -> System.out.print(name+" "));
    }
}
