package ru.example.patterns.flyweight;


import java.util.WeakHashMap;

/**
 * Class CashingData
 * класс для кеширования данных шаблон fky-weight
 *
 * @author Kaleganov Alexander
 * @since 15 дек. 20
 */
public class CashingData {
    private final WeakHashMap<String, Item> itemWeakHashMap = new WeakHashMap<>();

    public Item getItemByName(String name) {
        Item item = this.itemWeakHashMap.get(name);
        if (item == null) {
            item = this.createItem(name);
            this.itemWeakHashMap.put(name, item);
        }
        return item;
    }

    private Item createItem(String name) {
        return new Item(name, "value");
    }
}
