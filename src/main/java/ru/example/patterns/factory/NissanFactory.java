package ru.example.patterns.factory;

/**
 * Class MercedesFactory
 * фабрика для nissan
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
public class NissanFactory extends FactoryCar {
    @Override
    public Car getCar() {
        return new CarNissan();
    }
}
