package com.techreturners.cats;

public class LionCat extends AbstractCat {

    @Override
    public String getSetting() {
        return "wild";
    }

    @Override
    public int getAverageHeight() {
        return 1100;
    }
    @Override
    public String eat() {
        return "Roar!!!!";
    }
}
