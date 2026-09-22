package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetingServiceTest {
    private final GreetingService service = new GreetingService();

    @Test
    void greetsNamedPerson() {
        assertEquals("Hello, Alice!", service.greet("Alice"));
    }

    @Test
    void defaultsToWorldWhenNameIsBlank() {
        assertEquals("Hello, World!", service.greet(null));
        assertEquals("Hello, World!", service.greet("   "));
    }
}
