package ru.example.patterns.factory;

/**
 * Class MercedesFactory
 * фабрика для мерседесов
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
public class MercedesFactory extends FactoryCar {
    @Override
    public Car getCar() {
        return new CarMercedes();
    }
}
