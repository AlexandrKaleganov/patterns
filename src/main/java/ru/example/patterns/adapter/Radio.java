package ru.example.patterns.adapter;

/**
 * Class Radio
 * todo: описание
 *
 * @author Kaleganov Alexander
 * @since 06 дек. 20
 */
public class Radio {
    public String play(UsaSocket usaSocket) {
        System.out.println("пошла жара");
        return  usaSocket.getVolt();
    }
}
