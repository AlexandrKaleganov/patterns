package ru.example.patterns.decorator;

import lombok.RequiredArgsConstructor;

/**
 * Class CheesePizza
 * приготовление пицы с сыром
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
@RequiredArgsConstructor
public class CheesePizza implements Pizza{
    private final Pizza pizza;

    @Override
    public String makePizza() {
        return this.pizza.makePizza() + " пица с сыром";
    }
}
