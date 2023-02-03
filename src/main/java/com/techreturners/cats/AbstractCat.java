package com.techreturners.cats;

public abstract class AbstractCat implements Cat{

    public boolean sleep;
    public boolean setting;
    public int averageHeight;

    @Override
    public String eat() {
        return "Cat is sleeping";
    }

    @Override
    public int getAverageHeight() {
        return 178;
    }

    @Override
    public boolean isAsleep() {
        return false;
    }

    @Override
    public void goToSleep() {

    }

    @Override
    public void wakeUp() {

    }

    public abstract String getSetting() ;
}
