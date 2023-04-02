package com.example.demo;

import java.time.LocalDate;

public class Student {

    private long student_id;
    private String student_name ;
    private LocalDate dob;
    private int age;
    private String email;

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
}
