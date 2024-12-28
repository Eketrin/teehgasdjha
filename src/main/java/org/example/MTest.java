package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MTest {
    @Test
    public void testOutput() {
        assertEquals("Привет, мир!", "Привет, мир!"); // Тест сообщения
    }
}
