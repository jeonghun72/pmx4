package com.pmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PmxApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmxApplication.class, args);

    }
    @GetMapping(value = "/")
    public String HelloWorld() {
        return "hello World";
    }

}
