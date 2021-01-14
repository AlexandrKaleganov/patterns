package ru.example.patterns.mediator;

/**
 * Class ColegueImpl
 */
public class ColegueImpl extends Colegue {

    public ColegueImpl(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    String printMessage(String message) {
        System.out.println(message);
        return message;
    }
}
