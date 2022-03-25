package com.gildedrose.v2;

import com.gildedrose.v2.converter.ItemConverter;
import com.gildedrose.v2.entity.ItemInterface;
import com.gildedrose.v2.factory.ItemFactory;

class GildedRoseV2 {
    Item[] items;

    public GildedRoseV2(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            ItemInterface itemObj = ItemFactory.createItem(items[i].name, items[i].sellIn, items[i].quality);
            itemObj.updateQuality();
            ItemConverter.copy(items[i], itemObj);
        }
    }
}
