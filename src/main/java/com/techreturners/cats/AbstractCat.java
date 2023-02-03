package com.techreturners.cats;

public abstract class AbstractCat implements Cat{

    protected boolean isAsleep = false;
    protected String setting;
    protected int averageHeight;

    @Override
    public abstract String eat();
    @Override
    public abstract int getAverageHeight();
    @Override
    public abstract String getSetting() ;

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }
    @Override
    public void goToSleep() {
        isAsleep = true;
    }
    @Override
    public void wakeUp() {
        isAsleep = false;
    }

}
