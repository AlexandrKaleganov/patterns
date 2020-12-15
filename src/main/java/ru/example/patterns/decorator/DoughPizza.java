package ru.example.patterns.decorator;

/**
 * Class DoughPizza
 * готовим тесто для пицы 💛💛💛
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
public class DoughPizza implements Pizza {
    @Override
    public String makePizza() {
        return "тесто для пицы 😋😋😋";
    }
}
