package ru.example.patterns.factory;

/**
 * Class FactoryCar
 * Фабрика для автомобилей
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
public abstract class FactoryCar {
    public Car createCar() {
        Car car = getCar();
        car.drive();
        return car;
    }

    public abstract Car getCar();
}
