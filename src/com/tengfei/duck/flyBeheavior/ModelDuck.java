package com.tengfei.duck.flyBeheavior;

import com.tengfei.duck.Duck;
import com.tengfei.duck.quackheavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBeheavior = new FlyNoWay();
        this.quackHeavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("model duck");
    }
}
