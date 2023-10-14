package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;



public class StudentApp {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://hccs-advancejava.s3.amazonaws.com/student.json");
            ObjectMapper objectMapper = new ObjectMapper();
            Student[] students = objectMapper.readValue(url, Student[].class);

            // Provide search functionality
            String searchName = "Caleb"; // Change this to the name you want to search
            String searchGender = "Female"; // Change this to the gender you want to search

            System.out.println("Students with the name '" + searchName + "':");
            for (Student student : students) {
                if (student.getName().equalsIgnoreCase(searchName)) {
                    System.out.println(student);
                }
            }

            System.out.println("Students with gender '" + searchGender + "':");
            for (Student student : students) {
                if (student.getGender().equalsIgnoreCase(searchGender)) {
                    System.out.println(student);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
