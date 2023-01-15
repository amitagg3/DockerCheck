package com.amit.DockerCheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DockerCheckApplication {


    @GetMapping("/message")
    public String getProjectName() {
        return "Hello Amit! This is docker project check.";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerCheckApplication.class, args);
        System.out.println("We are checking cherry-pick");
    }

}
