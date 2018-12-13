package com.flaptastic.demoapp;

import static org.junit.Assert.*;

public class ClientTest {

    @org.junit.Test
    public void sayHello() {
        Client c = new Client();
        assertEquals("Hello", c.sayHello());
    }

}