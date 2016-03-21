package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int randomNumber;
        List<Integer> resultList = new ArrayList<>();

        while (resultList.size() <= Math.abs(firstNumber - secondNumber)) {
            if (firstNumber > secondNumber) {
                randomNumber = ThreadLocalRandom.current().nextInt(secondNumber, firstNumber + 1);
            } else {
                randomNumber = ThreadLocalRandom.current().nextInt(firstNumber, secondNumber + 1);
            }
            if (resultList.contains(randomNumber)) {
                continue;
            } else {
                resultList.add(randomNumber);
            }
        }

        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");
        }
    }
}
