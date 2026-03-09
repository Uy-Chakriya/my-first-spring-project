package org.example.myfirstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController("/v1/api/student")

public class MyFirstSpringProjectApplication {
    @GetMapping("/testing")

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringProjectApplication.class, args);
    }



    List<StudentID> student = new ArrayList<>();
    public List<StudentID> getGreeting() {
        return student;
    }

}
