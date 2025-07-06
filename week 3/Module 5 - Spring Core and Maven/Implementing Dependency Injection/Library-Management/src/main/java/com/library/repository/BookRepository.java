package com.library.repository;

import java.util.List;
import java.util.Arrays;

public class BookRepository {
    private List<String> books;

    public BookRepository() {
        books = Arrays.asList(
                "1. Digital-Nurture-4.0-JavaFSE",
                "2. Spring Core & Maven",
                "3. Spring Data JPA with Spring Boot, Hibernate",
                "4. Spring REST using Spring Boot 3",
                "5. Spring in Action by Craig Walls",
                "6. Microservices with Spring Boot 3 and Spring Cloud"
        );
    }

    public void display() {
        System.out.println("BookRepository: Displaying book data");
        for (String book : books) {
            System.out.println("\t\t\t" + book);
        }
    }
}
