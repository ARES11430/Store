package com.amin.store;

import com.amin.store.entities.Address;
import com.amin.store.entities.Profile;
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


        var profile = Profile.builder().bio("bio").build();
        user.setProfile(profile);
        profile.setUser(user);

        System.out.println("--- User Object ---");
        System.out.println(user);

        System.out.println("\n--- Profile Object (toString() output) ---");
        System.out.println(profile);

        System.out.println("\n--- Verifying the link from Profile back to User ---");
        // This proves the connection exists, even if toString() hides it
        System.out.println("Username from profile object: " + profile.getUser().getName());
    }

}
