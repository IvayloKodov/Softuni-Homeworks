package com.company;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        try (
                BufferedReader input = new BufferedReader(new FileReader(new File("resources/words.txt")));
                BufferedWriter output = new BufferedWriter(new FileWriter(new File("resources/count-chars.txt")))
        ) {

            String text = input.readLine().toLowerCase();
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;

            for (int i = 0; i < text.length(); i++) {

                switch (text.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowels++;
                        break;
                    case '!':
                    case '?':
                    case ',':
                    case '.':
                        punctuation++;
                        break;
                    default:
                        if (text.charAt(i) > 'a' && text.charAt(i) < 'z') {
                            consonants++;
                        }
                        break;
                }
            }
            output.write("Vowels: " + vowels);
            output.newLine();
            output.write("Consonants: " + consonants);
            output.newLine();
            output.write("Punctuation: " + punctuation);
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
