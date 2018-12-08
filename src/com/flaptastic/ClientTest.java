package com.flaptastic;

import static org.junit.Assert.*;

public class ClientTest {

    @org.junit.Test
    public void sayHello() {
        Client c = new Client();
        assertEquals("Hello", c.sayHello());
    }

//    @org.junit.Test
//    public void addNumbers() {
//        fail("Not implemented yet");
//    }
//
//    @org.junit.Test
//    public void alwaysFails() {
//        fail("This is a broken test");
//    }
}