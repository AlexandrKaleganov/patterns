package ru.example.patterns.adapter;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * Class UsaSocketImpl
 *
 * @author Kaleganov Alexander
 * @since 06 дек. 20
 */
@Log4j2
public class UsaSocketImpl implements UsaSocket {
    @Override
    public String getVolt() {
        log.info("пошёл вольтаж 110 вольт");
        return "110";
    }
}
