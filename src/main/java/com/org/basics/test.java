package com.org.basics;

import java.io.*;
import java.util.Objects;

public class test {

    public static void main(String[] args) {
        loadFile("./config");
    }

    private static void loadFile(String s) {
        File file = new File(s+ "/abc.txt");
        String filePath = file.getAbsolutePath();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            while (Objects.nonNull(line = br.readLine())){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
