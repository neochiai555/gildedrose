package com.gildedrose.v2.entity;

public class ItemBackstagePass extends ItemAbstract {
    public ItemBackstagePass() {
        super();
    }

    public ItemBackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();

        if (this.getSellIn() < 0) {
            // Nothing
        } else if (this.getSellIn() == 0) {
            this.setQuality(0);
        } else if (this.getSellIn() <= 5) {
            this.setQuality(this.getQuality() <= 47 ? this.getQuality() + 3 : this.getQuality());
        } else if (this.getSellIn() <= 10) {
            this.setQuality(this.getQuality() <= 48 ? this.getQuality() + 2 : this.getQuality());
        } else {
            this.setQuality(this.getQuality() + 1);
        }
        this.setSellIn(this.getSellIn() - 1);
    }
}
