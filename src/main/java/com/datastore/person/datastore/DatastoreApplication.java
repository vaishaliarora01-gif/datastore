package com.datastore.person.datastore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.datastore.person")
public class DatastoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatastoreApplication.class, args);
    }
}
