package com.company;

import java.io.*;

public class CopyJpgFile {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("resources/java.jpg");
             FileOutputStream output = new FileOutputStream("resources/my-copied-picture.jpg")) {
            byte [] buffer= new byte[2048];

            int bytes;
            while ((bytes = input.read(buffer,0,buffer.length)) != -1) {
                output.write(bytes);
            }
            input.close();
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
