package com.github.blockjon.demoapp;

import com.flaptastic.demoapp.Client;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testMyTest1() {
        Client c = new Client();
        assertEquals("Hello", c.sayHello());
    }

    @Test
    void testJackBites() {
        assertEquals("jack bixtes", "jack bites");
    }
}

