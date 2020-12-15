package ru.example.patterns.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("тестирование паттерна Декоратор")
class PizzaTest {

    @Test
    @DisplayName("тестирование паттерна Декоратор")
    public void testDecorator() {
        Pizza pizza = new CheesePizza(new DoughPizza());
        Pizza pizza1 = new PeperoniPizza(pizza);
        assertEquals(pizza1.makePizza(), "тесто для пицы \uD83D\uDE0B\uD83D\uDE0B\uD83D\uDE0B пица с сыром пица с пеперони");
    }
}
