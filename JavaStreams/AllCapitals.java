package com.company;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {

        try (
                BufferedReader input = new BufferedReader(new FileReader(new File("resources/lines.txt")));
                BufferedWriter output = new BufferedWriter(new FileWriter(new File("resources/capitals.txt")))
        ) {
            String lines;
            while (true) {
                lines = input.readLine();
                if (lines == null) {
                    break;
                }
                output.write(lines.toUpperCase());
                output.newLine();
            }
            input.close();
            output.flush();
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
