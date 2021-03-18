package br.com.ferrariflavia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.persistence.Entity;

@RestController
@RequestMapping(value = "/")
public class PersonController {

    @GetMapping
    public String getHello() {
        return "Hello, world!";
    }






}
