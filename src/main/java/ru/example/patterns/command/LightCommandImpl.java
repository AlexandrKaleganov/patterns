package ru.example.patterns.command;

/**
 * Class LightCommandImpl
 * имплементация комманды для включения света
 *
 * @author Kaleganov Alexander
 * @since 11 дек. 20
 */
public class LightCommandImpl implements Command {
    private final Light light;

    public LightCommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchLight();
    }
}
