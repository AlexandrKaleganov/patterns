package ru.example.patterns.iterator;

import java.util.Iterator;

/**
 * Class Menu
 * меню со списком даннх
 * @author Kaleganov Alexander
 * @since 22 дек. 20
 */
public class Menu implements Iterable<String> {
    private String[] items =  {"one", "two"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int i;
            @Override
            public boolean hasNext() {
                return i<items.length;
            }

            @Override
            public String next() {
                return items[i++];
            }
        };
    }
}
