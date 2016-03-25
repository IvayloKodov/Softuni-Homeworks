package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("resources/doubles.list"));
             ObjectInputStream input = new ObjectInputStream(new FileInputStream("resources/doubles.list"))) {

            List<Double> doubles = new ArrayList<>();
            doubles.add(2.0);
            doubles.add(2.6);
            doubles.add(3.2);
            doubles.add(4.4);
            doubles.add(5.2);
            doubles.add(6.1);
            output.writeObject(doubles);
            output.close();

            System.out.printf(input.readObject() + " ");
            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

