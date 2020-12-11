package ru.example.patterns.command;

/**
 * Class MusicPlayerCommandImpl
 * имплементация команды, для запуска музыки
 *
 * @author Kaleganov Alexander
 * @since 11 дек. 20
 */
public class MusicPlayerCommandImpl implements Command {
    private final MusicPlayer musicPlayer;

    public MusicPlayerCommandImpl(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        this.musicPlayer.playMusic();
    }
}
