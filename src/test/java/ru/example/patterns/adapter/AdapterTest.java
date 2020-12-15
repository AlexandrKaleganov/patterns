package ru.example.patterns.adapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("тестирование паттерна 'Адаптер'")
class AdapterTest {

    @Test
    @DisplayName("тестирование паттерна 'Адаптер'")
    public void testAdapter() {
        Radio radio = new Radio();
        Adapter adapter = new Adapter(new EuroSocketImpl());
        assertEquals(radio.play(adapter), "220");
    }
}
