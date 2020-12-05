package ru.example.patterns.adapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

@DisplayName("тестирование паттерна 'Адаптер'")
class AdapterTest {

    @Test
    @DisplayName("тестирование паттерна 'Адаптер'")
    public void testAdapter() {
        Radio radio = new Radio();
        Adapter adapter = new Adapter(new EuroSocketImpl());
        Assert.hasText(radio.play(adapter), "220");
    }
}
