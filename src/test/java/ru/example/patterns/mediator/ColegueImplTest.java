package ru.example.patterns.mediator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ColegueImplTest {

    @Test
    @DisplayName("тестирование паттерна Медиатор")
    public void testMessage() {
        Chat chat = new ChatMediator();
        ColegueImpl mike = new ColegueImpl(chat, "Mike");
        chat.addColegue(mike);
        chat.addColegue(new ColegueImpl(chat, "Den"));
        chat.addColegue(new ColegueImpl(chat, "Kent"));
        mike.sendMessage("Hello world");
    }
}
