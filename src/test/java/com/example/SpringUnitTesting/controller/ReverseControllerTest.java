package com.example.SpringUnitTesting.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseControllerTest {

    @Test
    void reverse() {
        ReverseController reverseController = new ReverseController();
        String name = "Reverse";
        assertEquals("esreveR", reverseController.reverse(name));
    }
}