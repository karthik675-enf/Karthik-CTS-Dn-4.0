package com.library.main;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookRepository repo = context.getBean("bookRepository", BookRepository.class);
        BookService service = context.getBean("bookService", BookService.class);

        repo.print();
        service.print();
    }
}
