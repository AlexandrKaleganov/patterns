package ru.example.patterns.decorator;

import lombok.AllArgsConstructor;

/**
 * Class PeperoniPizza
 * класс для приготовления пеперони пиццы
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
@AllArgsConstructor
public class PeperoniPizza implements Pizza{
    private final Pizza pizza;

    @Override
    public String makePizza() {
        return this.pizza.makePizza()  + " пица с пеперони";
    }
}
