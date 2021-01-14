package ru.example.patterns.mediator;

/**
 * Class Colegue
 *
 */
public abstract class Colegue {
    Chat chat;
    String name;

    public Colegue (Chat chat,
            String name) {
        this.chat = chat;
        this.name = name;
    }
    abstract void sendMessage(String message);
    abstract String printMessage(String message);

}
