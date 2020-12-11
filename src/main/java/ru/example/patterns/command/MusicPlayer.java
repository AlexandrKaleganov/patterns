package ru.example.patterns.command;

import lombok.extern.log4j.Log4j2;

/**
 * Class MusicPlaer
 * воспроизведение музыки
 *
 * @author Kaleganov Alexander
 * @since 11 дек. 20
 */
@Log4j2
public class MusicPlayer {
    public void playMusic() {
        log.info("play music");
    }
}
