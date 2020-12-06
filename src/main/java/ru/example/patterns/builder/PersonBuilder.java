package ru.example.patterns.builder;

import java.math.BigDecimal;

/**
 * Class PersonBuilder
 * интерфейс для паттерна билдер
 *
 * @author Kaleganov Alexander
 * @since 07 дек. 20
 */
public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(String age);
    PersonBuilder setSalary(BigDecimal decimal);
    Person build();
}
