package com.company;

import java.io.*;

public class Exercise {
    private static final String FILE_PATH_IN = "resources/users.txt";
    private static final String FILE_PATH_OUT = "resources/total-played.txt";

    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new FileReader(FILE_PATH_IN));
             BufferedWriter output = new BufferedWriter(new FileWriter(FILE_PATH_OUT))) {

            String line;
            while (true) {
                line = input.readLine();
                if (line == null) {
                    break;
                }
                String[] info = line.split(" ");
                String user = info[0];

                int totalMinutes = 0;
                for (int i = 1; i < info.length; i++) {
                    String[] timers = info[i].split(":");

                    int hours = Integer.parseInt(timers[0]);
                    int minutes = Integer.parseInt(timers[1]);
                    totalMinutes += (hours * 60) + minutes;
                }
                int days= totalMinutes / (24 * 60);
                int hours = totalMinutes / 60;
                int minutes= totalMinutes % 60;
                output.write(String.format("%s %d (%d days, %d hours, %d minutes)",user,totalMinutes,days,
                        hours,minutes));

                output.newLine();
            }
            input.close();
            output.flush();
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}


