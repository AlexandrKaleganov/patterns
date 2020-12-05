package ru.example.patterns.bridge;

/**
 * Class TransportByke
 * todo: описание
 *
 * @author Kaleganov Alexander
 * @since 06 дек. 20
 */
public class TransportBike extends Transport {
    protected TransportBike(Model model) {
        super(model);
    }

    @Override

    String getType() {
        return "мото " + super.getType();
    }
}
