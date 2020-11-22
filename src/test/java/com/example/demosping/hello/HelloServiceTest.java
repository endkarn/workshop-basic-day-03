package com.example.demosping.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {

    @Test
    public void greetingTestMyName() {
        String expected = "Hello World!, Karnawat";
        String name = "Karnawat";

        String actual = HelloService.greeting(name);

        assertEquals(expected, actual);
    }
}