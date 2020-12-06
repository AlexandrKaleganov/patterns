package ru.example.patterns.builder;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("тестирование паттерна builder")
@Log4j2
class PersonBuilderImplTest {

    @Test
    public void testBuilder() {
        Person person = new PersonBuilderImpl()
                .setName("Вася")
                .setAge("100лет")
                .setSalary(new BigDecimal(1000))
                .build();
        log.info(person);
        Assert.hasText(person.getName(), "Вася");
    }

}
