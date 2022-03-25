package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private int getQualityChangePerDay(String itemName, int sellIn, int quality) {
        int changePerDay = 0;

        if (itemName.equals(ItemType.AGED_BRIE)) {
            changePerDay = quality < 50 ? 1 : 0;
        } else if (itemName.equals(ItemType.BACKSTAGE_PASS)) {
            if (sellIn < 0) {
                changePerDay = 0;
            } else if (sellIn == 0) {
                changePerDay = -quality;
            } else if (sellIn <= 5) {
                changePerDay = quality <= 47 ? 3 : 0;
            } else if (sellIn <= 10) {
                changePerDay = quality <= 48 ? 2 : 0;
            } else {
                changePerDay = 1;
            }
        } else if (itemName.equals(ItemType.SULFURAS)) {
            changePerDay = 0;
        } else if (itemName.equals(ItemType.CONJURED)) {
            int unitChange = sellIn < 0 ? 4 : 2;
            changePerDay = quality >= unitChange ? -unitChange : 0;
        } else {
            int unitChange = sellIn < 0 ? 2 : 1;
            changePerDay = quality >= unitChange ? -unitChange : 0;
        }

        return changePerDay;
    }

    private int getSellInStep(String itemName) {
        int sellInStep = 0;

        if (itemName.equals(ItemType.SULFURAS)) {
            sellInStep = 0;
        } else {
            sellInStep = -1;
        }

        return sellInStep;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            int qualityChange = getQualityChangePerDay(items[i].name, items[i].sellIn, items[i].quality);

            items[i].quality += qualityChange;

            int sellInStep = getSellInStep(items[i].name);

            items[i].sellIn += sellInStep;
        }
    }
}
