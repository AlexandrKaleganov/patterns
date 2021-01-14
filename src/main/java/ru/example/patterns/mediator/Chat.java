package ru.example.patterns.mediator;

/**
 * Class Chat
 * медиатор
 *
 * @author Kaleganov Alexander
 * @since 15 янв. 21
 */
public interface Chat {
    void sendMessage(String message, Colegue colegue);
    void addColegue(Colegue colegue);
}
