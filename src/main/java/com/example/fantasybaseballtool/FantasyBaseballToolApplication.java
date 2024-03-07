package com.example.fantasybaseballtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RestController
@SpringBootApplication
public class FantasyBaseballToolApplication
{
    @RequestMapping("/")
    public String home() {
        int x= 3;
        x = 4;
        return "Hello ! Nice job";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(FantasyBaseballToolApplication.class, args);
    }
}