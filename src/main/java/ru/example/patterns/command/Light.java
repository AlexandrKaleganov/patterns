package ru.example.patterns.command;

import lombok.extern.log4j.Log4j2;

/**
 * Class Light
 * класс отвечает за включение отключение света
 *
 * @author Kaleganov Alexander
 * @since 11 дек. 20
 */
@Log4j2
class Light {
    boolean isOn;

    public void switchLight() {
        this.isOn = !this.isOn;
        log.info("Light is " + (this.isOn ? "on" : "of"));
    }
}
