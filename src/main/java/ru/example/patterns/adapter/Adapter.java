package ru.example.patterns.adapter;

/**
 * Class Adapter
 * Шаблон проектирования адаптер
 *
 * @author Kaleganov Alexander
 * @since 06 дек. 20
 */
public class Adapter implements UsaSocket {
    private final EuroSocket euroSocket;

    public Adapter(EuroSocket usaSocket) {
        this.euroSocket = usaSocket;
    }

    @Override
    public String getVolt() {
      return this.euroSocket.getVolt();
    }
}
