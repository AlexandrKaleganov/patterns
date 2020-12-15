package ru.example.patterns.facade;

import lombok.AllArgsConstructor;

/**
 * Class LivingRoom
 * гостинная
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
@AllArgsConstructor
public class LivingRoom implements Room {
    private final FacadeRoom facadeRoom;
    public String camToRoom() {
        return facadeRoom.onButton();
    }
}
