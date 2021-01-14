package ru.example.patterns.momento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OriginatorTest {

    @Test
    @DisplayName("тест паттерна Momento")
    public void testMomento() {
        List<Originator.Moment> list = new ArrayList<>();
        Originator originator = new Originator();
        originator.setState("one");
        originator.setState("two");
        list.add(originator.saveState());
        originator.setState("three");
        assertEquals(originator.restoreMoment(list.get(0)), "two");
    }
}
