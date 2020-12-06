package ru.example.patterns.chain;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

@Log4j2
@DisplayName("тестирование паттерна chain of responsibility")
class PipeTest {

    @Test
    public void testCainOfResponsibility() {
       Pipe pipe = new PipeReplace2(new Pipe4(null));
       Item item = new Item();
       item.setName("asdsad2asdasdas4");
       pipe.filter(item);
       Assert.hasText(item.getName(), "asdsad3asdasdas0" );
    }
}

