package com.gildedrose.v2.entity;

public interface ItemInterface {
    String getName();
    void setName(String name);
    int getQuality();
    void setQuality(int quality);
    int getSellIn();
    void setSellIn(int sellIn);

    void updateQuality();
}
