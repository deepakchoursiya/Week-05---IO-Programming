package com.ioprogramming.practiceproblems.jsonstudentobject;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;


public class Student {
    private String name;
    private int age;
    private List<String> subjects;


    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }


    public static void main(String[] args) throws Exception {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = new Student("Bhuvi", 20, List.of("Math", "Science", "History"));
            String jsonString = objectMapper.writeValueAsString(student);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
