package com.platformv.dictionaries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.platformv.dictionaries"})
public class DictionariesRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DictionariesRestApplication.class, args);
    }
}
