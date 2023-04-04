package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class Student {

    private long student_id;
    private String student_name ;
    private LocalDate dob;
    private int age;
    private String email;


    public Student(){};

    public Student(long student_id,
            String student_name,
            LocalDate dob,
            int age,
            String email) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    public Student(String student_name, LocalDate dob, int age, String email) {
        this.student_name = student_name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }


    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
