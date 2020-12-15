package ru.example.patterns.factory;

/**
 * Class CarNissan
 * ниссан едет
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
public class CarNissan implements Car {
    @Override
    public String drive() {
        return "ниссан едет";
    }
}
