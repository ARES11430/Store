package com.amin.store;

import com.amin.store.entities.User;
import com.amin.store.repositories.UserRepository;
import com.amin.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(StoreApplication.class, args);
        var userService = context.getBean(UserService.class);

        userService.fetchPaginatedProducts(0, 10);
    }
}
