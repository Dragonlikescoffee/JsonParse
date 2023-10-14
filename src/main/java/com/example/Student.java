package com.example;

public class Student {
        private int student_id;
        private String name;
        private String gender;
        private int age;
        private String major;
    
        public Student(int student_id, String name, String gender, int age, String major) {
            this.student_id = student_id;
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.major = major;
        }
    
        public int getStudentId() {
            return student_id;
        }
    
        public String getName() {
            return name;
        }
    
        public String getGender() {
            return gender;
        }
    
        public int getAge() {
            return age;
        }
    
        public String getMajor() {
            return major;
        }
    
        @Override
        public String toString() {
            return "Student ID: " + student_id + ", Name: " + name + ", Gender: " + gender + ", Age: " + age + ", Major: " + major;
        }
    }
