package com.ioprogramming.practiceproblems.jsonobjecttoformat;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Car {
    private String brand;
    private String model;
    private int year;


    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public static void main(String[] args) throws Exception {



        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Toyota", "Camry", 2023);
            // Convert Java Object to JSON String
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
