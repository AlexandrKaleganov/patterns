package ru.example.patterns.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("тестирование шалона Command")
class ButtonTest {

    @Test
    public void submitButton() {
        Command music = new MusicPlayerCommandImpl(new MusicPlayer());
        Command light = new LightCommandImpl(new Light());
        Button button = new Button(music);
        button.pressButton();
        Button button2 = new Button(light);
        button2.pressButton();
    }
}
