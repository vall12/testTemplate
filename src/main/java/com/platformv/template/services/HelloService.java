package com.platformv.template.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello() {
        return "Hello Platform V";
    }
}
