package ru.example.patterns.iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("тест итератор")
class MenuTest {

    @Test
    @DisplayName("Тест итератора")
    public void testIterator() {
        Iterator<String> iterator = new Menu().iterator();
        assertTrue(iterator.hasNext());
        assertEquals(iterator.next(), "one");
        assertEquals(iterator.next(), "two");
        assertFalse(iterator.hasNext());
        new Menu().forEach(System.out::println);
    }

    @Test
    @DisplayName("Тест итератора модифицируемого")
    public void testIteratorCopy() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("asdsa");
        list.add("sad");
        list.add("asdas");
        list.add("as");
        for (String s : list) {
            System.out.println(s);
            list.remove("as");
        }
    }
}
