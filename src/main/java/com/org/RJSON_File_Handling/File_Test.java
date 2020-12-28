package com.org.RJSON_File_Handling;

import java.io.*;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class File_Test {

    public static void main(String[] args) {
        loadFile("./config");
    }

    private static void loadFile(String s) {
        File file = new File(s + "/key-val.json");
        String filePath = file.getAbsolutePath();
        String line;
        Map<String, String> map = null;
        try {
            map = new ObjectMapper().readValue(filePath, Map.class);

        } catch (Exception ignored) {
            //
        }
        System.out.println(map);
    }
}
