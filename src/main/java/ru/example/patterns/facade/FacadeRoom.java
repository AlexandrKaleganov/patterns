package ru.example.patterns.facade;

import lombok.AllArgsConstructor;

/**
 * Class FacadeRoom
 * фасад нашей комнаты ( любой комнаты)
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
@AllArgsConstructor
public class FacadeRoom {
    private final Light light;
    private final Tv tv;

    public String onButton() {
        return this.light.select() + this.tv.selectTv();
    }

}
