package com.springboot.servlettest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringController {

    @GetMapping
    public String spring(){
        return "Spring";
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String postForm(@RequestParam String spring){
        return "Spring " + spring;
    }
}
