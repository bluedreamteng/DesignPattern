package com.tengfei.duck;

public abstract class Duck {
    protected FlyBeheavior flyBeheavior;
    protected QuackHeavior quackHeavior;
    public void performQuack(){

        quackHeavior.quack();
    }
    public void performFly(){

        flyBeheavior.fly();
    }
    public void setFlyBeheavior(FlyBeheavior flyBeheavior) {

        this.flyBeheavior =flyBeheavior;
    }
    public abstract void display();
}
