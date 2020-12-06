package ru.example.patterns.builder;

import java.math.BigDecimal;

/**
 * Class PersonBuilderImpl
 * сам билдер
 *
 * @author Kaleganov Alexander
 * @since 07 дек. 20
 */
public class PersonBuilderImpl implements PersonBuilder {
    Person person = new Person();
    @Override
    public PersonBuilder setName(String name) {
        this.person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder setAge(String age) {
        this.person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setSalary(BigDecimal salary) {
        this.person.setSalary(salary);
        return this;
    }

    @Override
    public Person build() {
        return this.person;
    }
}
