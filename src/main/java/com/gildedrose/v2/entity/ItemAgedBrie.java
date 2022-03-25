package com.gildedrose.v2.entity;

public class ItemAgedBrie extends ItemAbstract {
    public ItemAgedBrie() {
        super();
    }

    public ItemAgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();

        this.setQuality(this.getQuality() + (this.getQuality() < 50 ? 1 : 0));
        this.setSellIn(this.getSellIn() - 1);
    }
}
