package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testAdd() {
        assertEquals(8, main.add(5, 3));
    }

    @Test
    void testIsEven() {
        assertTrue(main.isEven(6));
    }

    @Test
    void testGreet() {
        assertEquals("Hello, Vedak", main.greet("Vedak"));
    }

    @Test
    void testGetNull() {
        assertNull(main.getNull());
    }
}
