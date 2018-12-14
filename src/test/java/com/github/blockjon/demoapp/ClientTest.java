package com.github.blockjon.demoapp;

import com.flaptastic.demoapp.Client;

import static org.junit.Assert.*;

public class ClientTest {

    @org.junit.Test
    public void sayHello() {
        Client c = new Client();
        assertEquals("Hello", c.sayHello());
    }
}
