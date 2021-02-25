package ru.example.patterns.facade;

import lombok.RequiredArgsConstructor;

/**
 * Class FacadeRoom
 * фасад нашей комнаты ( любой комнаты)
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
@RequiredArgsConstructor
public class FacadeRoom {
    private final Light light;
    private final Tv tv;

    public String onButton() {
        return this.light.select() + this.tv.selectTv();
    }

}
