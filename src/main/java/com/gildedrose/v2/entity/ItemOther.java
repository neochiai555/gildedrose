package com.gildedrose.v2.entity;

public class ItemOther extends ItemAbstract {
    public ItemOther() {
        super();
    }

    public ItemOther(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();

        int unitChange = this.getSellIn() < 0 ? 2 : 1;

        this.setQuality(this.getQuality() >= unitChange ? this.getQuality() - unitChange : this.getQuality());
        this.setSellIn(this.getSellIn() - 1);
    }
}
