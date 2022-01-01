package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args ->{
            Student ali = new Student("Ali", "ali@ali.com", LocalDate.of(2000, 12, 3));
            Student jimmy = new Student("Jimmy", "jimmy@jimmy.com", LocalDate.of(2005, 10, 15));
            repository.saveAll(List.of(ali, jimmy));
        };
    }
}
