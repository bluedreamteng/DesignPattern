package com.tengfei.duck.quackheavior;

import com.tengfei.duck.Duck;
import com.tengfei.duck.flyBeheavior.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBeheavior = new FlyWithWings();
        this.quackHeavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("会飞的鸭子");
    }
}
