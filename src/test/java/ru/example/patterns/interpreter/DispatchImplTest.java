package ru.example.patterns.interpreter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("тестирование паттерна 'интерпретатор'")
class DispatchImplTest {

    @DisplayName("тестирование паттерна 'интерпретатор'")
    @Test
    public void testInterpreter() {
        Dispatch dispatch = new DispatchImpl();
        String function = "a + b";
        Map<String, Integer> values = new HashMap<>();
        values.put("a", 2);
        values.put("b", 4);
        assertEquals(dispatch.calculate(function, values), 6);
    }
}
