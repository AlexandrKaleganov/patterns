package ru.example.patterns.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("тетс паттерна фабрика Фабрика")
class FactoryCarTest {

    @DisplayName("тетс паттерна фабрика Фабрика")
    @Test
    public void testFactory() {
        FactoryCar factoryCar = new MercedesFactory();
        FactoryCar factoryCar1 = new NissanFactory();
        assertEquals(factoryCar.createCar().drive(), "mercedes едет");
        assertEquals(factoryCar1.createCar().drive(), "ниссан едет");
    }
}
