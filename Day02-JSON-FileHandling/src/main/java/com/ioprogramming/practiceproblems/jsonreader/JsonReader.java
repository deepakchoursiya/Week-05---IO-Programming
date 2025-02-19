package com.ioprogramming.practiceproblems.jsonreader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JsonReader {
    public static void main(String[] args) throws Exception {


        try {
            String path = "D:\\week05\\Day02-JSON-FileHandling\\src\\main\\resources\\data.json";
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(path));
            System.out.println("User Name: " + jsonNode.get("name").asText());
            System.out.println("Email: " + jsonNode.get("email").asText());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
