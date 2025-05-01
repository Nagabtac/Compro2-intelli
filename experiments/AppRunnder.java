// package com.crude.review;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.SpringApplication;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.*;
// import org.springframework.stereotype.Component;
// @Component
// public class AppRunnder implements CommandLineRunner {

//     @Autowired
//     private BCryptPasswordEncoder passwordEncoder;

//     public static void main(String[] args) {
//         SpringApplication.run(ReviewApplication.class, args);
//     }

//     @Override
//     public void run(String... args) throws Exception {
//         String plainPassword = "secret";
//         String hash = passwordEncoder.encode(plainPassword);
//         System.out.println("Hashed password: " + hash);
//     }
// }
