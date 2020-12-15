package ru.example.patterns.flyweight;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Class Item
 * объект, который будем кешировать
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
@Data
@ToString
@Builder
public class Item {
    private String name;
    private String value;
}
