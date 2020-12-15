package ru.example.patterns.facade;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("тестирование фасада")
class RoomTest {

    @DisplayName("тестирование фасад")
    @Test
    public void testFacade() {
        Light light = new Light();
        Tv tv = new Tv();
        Room livingRoom = new LivingRoom(new FacadeRoom(light, tv));
        Room bathRoom = new BathRoom(new FacadeRoom(light, tv));
        assertEquals(livingRoom.camToRoom(), "свет включён телевизор включён");
        assertEquals(bathRoom.camToRoom(), "свет включён телевизор включён");
    }
}
