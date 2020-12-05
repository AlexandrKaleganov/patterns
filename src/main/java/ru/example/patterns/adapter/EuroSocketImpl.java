package ru.example.patterns.adapter;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * Class EuroSocketImpl
 * todo: описание
 *
 * @author Kaleganov Alexander
 * @since 06 дек. 20
 */
@Log4j2
public class EuroSocketImpl implements EuroSocket {
    @Override
    public String getVolt() {
        log.info("рашен вольт 220");
        return "220";
    }
}
