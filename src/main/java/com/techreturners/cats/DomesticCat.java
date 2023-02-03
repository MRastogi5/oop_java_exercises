package com.techreturners.cats;

public class DomesticCat extends AbstractCat {
    @Override
    public String getSetting() {
        return setting = "domestic";
    }

    @Override
    public int getAverageHeight() {
        return averageHeight = 23;
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }
}
