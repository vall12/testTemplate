package com.platformv.template.controllers;

import com.platformv.template.controllers.contracts.Contract;
import com.platformv.template.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/example")
public class Controller implements Contract {

    private HelloService templateService;

    @Autowired
    public Controller(HelloService templateService) {
        this.templateService = templateService;
    }

    @GetMapping("/hello")
    public String hello() {
        return templateService.sayHello();
    }


}
