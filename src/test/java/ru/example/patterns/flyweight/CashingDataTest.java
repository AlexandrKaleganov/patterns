package ru.example.patterns.flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

@DisplayName("тестирование шаблона fky-weight")
class CashingDataTest {

    @DisplayName("тестирование шаблона fky-weight")
    @Test
    public void testFkyWeight() {
        CashingData cashingData = new CashingData();
        Item item1 = cashingData.getItemByName("name");
        Item item2 = cashingData.getItemByName("name");
        assertSame(item1, item2);
    }
}
