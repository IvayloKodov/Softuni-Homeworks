package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZip {
    public static void main(String[] args) {
        List<String> filesForZip = new ArrayList<>();
        filesForZip.add("resources/lines.txt");
        filesForZip.add("resources/words.txt");
        filesForZip.add("resources/count-chars.txt");

        try {
            ZipOutputStream zipOutput = new ZipOutputStream(new FileOutputStream("resources/text-files.zip"));
            for (int i = 0; i < filesForZip.size(); i++) {
                try (FileInputStream input = new FileInputStream(filesForZip.get(i))) {
                    zipOutput.putNextEntry(new ZipEntry(filesForZip.get(i)));

                    int length;
                    while ((length = input.read()) != -1) {
                        zipOutput.write(length);
                    }
                    zipOutput.closeEntry();
                    input.close();
                }
            }
            zipOutput.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
