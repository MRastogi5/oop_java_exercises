package com.techreturners.cats;

public abstract class AbstractCat implements Cat{

    public boolean sleep = false;
    public boolean setting;
    public int averageHeight;

    @Override
    public abstract String eat();

    @Override
    public abstract int getAverageHeight();

    @Override
    public boolean isAsleep() {
        return sleep;
    }

    @Override
    public void goToSleep() {
        sleep = true;
    }

    @Override
    public void wakeUp() {
        sleep = false;
    }

    public abstract String getSetting() ;
}
