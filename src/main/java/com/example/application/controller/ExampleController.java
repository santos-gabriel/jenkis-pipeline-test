package com.example.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping
    public ResponseEntity<?> helloWorld() {
        return ResponseEntity.ok().body("Hello World!");
    }


}
