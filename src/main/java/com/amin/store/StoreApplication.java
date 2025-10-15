package com.amin.store;

import com.amin.store.entities.Address;
import com.amin.store.entities.Tag;
import com.amin.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        //var context = SpringApplication.run(StoreApplication.class, args);

        var user = User.builder()
                .id(1L)
                .name("admin")
                .email("admin@google.com")
                .password("admin").build();

        user.addTag("Tag1");
        System.out.println(user);
    }

}
