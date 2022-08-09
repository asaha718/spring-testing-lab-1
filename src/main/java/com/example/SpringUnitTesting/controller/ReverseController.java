package com.example.SpringUnitTesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
    @GetMapping("/reverse")
    public String reverse(String word){
        StringBuilder wordInput = new StringBuilder();
        wordInput.append(word);
        return String.valueOf(wordInput.reverse());
    }
}
