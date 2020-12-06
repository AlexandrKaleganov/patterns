package ru.example.patterns.chain;

/**
 * Class Pipe
 * todo: описание
 *
 * @author Kaleganov Alexander
 * @since 07 дек. 20
 */
public abstract class Pipe {
    Pipe pipe;

    public Pipe(Pipe pipe) {
        this.pipe = pipe;
    }
    abstract void filter(Item item);
}
