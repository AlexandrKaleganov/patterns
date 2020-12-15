package ru.example.patterns.bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("тестирование шаблона проектирования bridge (мост)")
class TransportBikeTest {

    @Test
    public void testBridge() {
        Model model = new ModelNissan();
        Transport transport = new TransportBike(model);
        assertEquals(transport.getType(), "мото nissan");
    }
}
