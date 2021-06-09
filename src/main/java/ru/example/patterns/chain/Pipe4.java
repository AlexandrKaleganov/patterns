package ru.example.patterns.chain;

/**
 * Class Pipe4
 * Реализация chain of responsiniliti замена 4 на 0
 *
 * @author Kaleganov Alexander
 * @since 07 дек. 20
 */
public class Pipe4 extends Pipe {
    public Pipe4(Pipe pipe) {
        super(pipe);
    }

    @Override
    void modify(Item item) {
        item.setName(item.getName().replace("4", "0"));
    }
}
