package com.example.contineousintegration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class ContinuousIntegrationApplication {

    @GetMapping("/hello")
    public String hello(){
        log.info("This is hello method from continuous class");
        return "Hello this is continuous integration and continue deployment";
    }


    public static void main(String[] args) {
        SpringApplication.run(ContinuousIntegrationApplication.class, args);
    }

}
