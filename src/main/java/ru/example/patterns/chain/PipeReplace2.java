package ru.example.patterns.chain;

/**
 * Class PipeReplace2
 * Реализация chain of responsiniliti замена 2 на 3
 *
 * @author Kaleganov Alexander
 * @since 07 дек. 20
 */
public class PipeReplace2 extends Pipe {
    public PipeReplace2(Pipe pipe) {
        super(pipe);
    }

    @Override
    void filter(Item item) {
        item.setName(item.getName().replace("2", "3"));
    }
}
