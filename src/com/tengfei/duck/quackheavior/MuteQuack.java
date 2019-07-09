package com.tengfei.duck.quackheavior;

import com.tengfei.duck.QuackHeavior;

public class MuteQuack implements QuackHeavior {
    @Override
    public void quack() {
        System.out.println("什么都不做 不会叫");
    }
}
