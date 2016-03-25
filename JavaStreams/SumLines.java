package com.company;

import java.io.*;

public class SumLines {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new FileReader("resources/lines.txt"))) {

            String line;
            while (true) {
                line = input.readLine();
                if (line == null) {
                    break;
                }

                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                System.out.println(sum);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
