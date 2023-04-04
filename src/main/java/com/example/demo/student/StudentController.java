package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudent() {

        return List.of(new Student(1L,
                "Hussain",
                LocalDate.of(1995,4, 12),
                28,
                "hm464@cornell.edu"));

    }


}
