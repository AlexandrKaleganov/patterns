package ru.example.patterns.facade;

import lombok.RequiredArgsConstructor;

/**
 * Class LivingRoom
 * гостинная
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
@RequiredArgsConstructor
public class BathRoom implements Room {
    private final FacadeRoom facadeRoom;
    public String camToRoom() {
        return facadeRoom.onButton();
    }
}
