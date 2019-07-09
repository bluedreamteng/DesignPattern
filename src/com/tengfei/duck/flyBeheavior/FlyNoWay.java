package com.tengfei.duck.flyBeheavior;


import com.tengfei.duck.FlyBeheavior;


public class FlyNoWay implements FlyBeheavior {
    @Override
    public void fly() {
        System.out.println("这个是不会飞的哦");
    }
}
