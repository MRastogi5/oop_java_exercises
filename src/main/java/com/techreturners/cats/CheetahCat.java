package com.techreturners.cats;

public class CheetahCat extends AbstractCat {

    @Override
    public String getSetting() {
        return setting = "wild";
    }

    @Override
    public int getAverageHeight() {
        return averageHeight = 1100;
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
