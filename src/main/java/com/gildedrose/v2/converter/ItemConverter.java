package com.gildedrose.v2.converter;

import com.gildedrose.v2.Item;
import com.gildedrose.v2.entity.ItemInterface;

public class ItemConverter {
    private ItemConverter() {

    }

    public static void copy(Item item, ItemInterface itemObj) {
        item.name = itemObj.getName();
        item.sellIn = itemObj.getSellIn();
        item.quality = itemObj.getQuality();
    }
}
