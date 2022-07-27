package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student muhammed = new Student(
                    "Muhammed",
                    "muhammed@gmail.com",
                    LocalDate.of(2000, Month.MARCH, 5)
            );

            Student afolabi = new Student(
                    "Afolabi",
                    "afolabi@gmail.com",
                    LocalDate.of(2000, Month.MARCH, 5)
            );

            repository.saveAll(
                    List.of(muhammed, afolabi)
            );
        };
    }
}
