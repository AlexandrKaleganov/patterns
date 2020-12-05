package ru.example.patterns.bridge;

/**
 * Class Transport
 * todo: описание
 *
 * @author Kaleganov Alexander
 * @since 06 дек. 20
 */
public abstract class Transport {
    private final Model model;

    protected Transport(Model model) {
        this.model = model;
    }

    String getType() {
        return model.getName();
    }
}
