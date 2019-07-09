package com.tengfei.duck.quackheavior;

import com.tengfei.duck.QuackHeavior;

public class Squeak implements QuackHeavior {

    @Override
    public void quack() {
        System.out.println("橡皮鸭子吱吱叫");
    }
}
