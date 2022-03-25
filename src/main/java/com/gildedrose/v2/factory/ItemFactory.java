package com.gildedrose.v2.factory;

import com.gildedrose.v2.entity.*;

public class ItemFactory {
    private ItemFactory() {
    }

    public static ItemInterface createItem(String name, int sellIn, int quality) {
        if (name.equals(ItemType.AGED_BRIE)) {
            return new ItemAgedBrie(name, sellIn, quality);
        } else if (name.equals(ItemType.BACKSTAGE_PASS)) {
            return new ItemBackstagePass(name, sellIn, quality);
        } else if (name.equals(ItemType.CONJURED)) {
            return new ItemConjured(name, sellIn, quality);
        } else if (name.equals(ItemType.SULFURAS)) {
            return new ItemSulfuras(name, sellIn, quality);
        } else {
            return new ItemOther(name, sellIn, quality);
        }
    }
}
