package com.gildedrose.v2.entity;

public class ItemConjured extends ItemAbstract {
    public ItemConjured() {
        super();
    }

    public ItemConjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();

        int unitChange = this.getSellIn() < 0 ? 4 : 2;

        this.setQuality(this.getQuality() >= unitChange ? this.getQuality() - unitChange : this.getQuality());
        this.setSellIn(this.getSellIn() - 1);
    }
}
