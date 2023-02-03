package com.techreturners.cats;

public abstract class AbstractCat implements Cat{

    public boolean sleep;
    public boolean setting;
    public int averageHeight;

    @Override
    public abstract String eat();

    @Override
    public abstract int getAverageHeight();

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
