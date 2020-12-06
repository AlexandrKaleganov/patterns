package ru.example.patterns.builder;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Class Person
 * модель для стратегии билдер
 *
 * @author Kaleganov Alexander
 * @since 07 дек. 20
 */
@Data
@ToString
public class Person {
    private String name;
    private String age;
    private BigDecimal salary;
}
