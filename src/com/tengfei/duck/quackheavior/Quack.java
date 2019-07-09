package com.tengfei.duck.quackheavior;

import com.tengfei.duck.QuackHeavior;

public class Quack implements QuackHeavior {
    @Override
    public void quack() {
        System.out.println("实现鸭子呱呱叫");
    }
}
