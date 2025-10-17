package com.amin.store;

import com.amin.store.entities.User;
import com.amin.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(StoreApplication.class, args);
        var userRepository = context.getBean(UserRepository.class);

        var user = User.builder()
                .name("admin")
                .email("admin@google.com")
                .password("admin").build();

        userRepository.save(user);
    }
}
