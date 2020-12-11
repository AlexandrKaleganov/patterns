package ru.example.patterns.command;

/**
 * Class Button
 * при нажатии на кнопку будет срабатывать тот или иной класс
 *
 * @author Kaleganov Alexander
 * @since 11 дек. 20
 */
public class Button {
    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
