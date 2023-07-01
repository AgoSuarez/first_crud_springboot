package com.agosuarez.Tasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/helloVariable")
    public String helloNoName(){
        return "Hello World desde Variable";
    }

    @GetMapping("/helloVariable/{name}")
    public String helloWithName(@PathVariable String name){
        return "Hello "+name;
    }

    @GetMapping("/helloParam")
    public String helloWithParam(@RequestParam(value="name", defaultValue="World") String name){
        return "Hello desde parametro " + name;
    }
}
