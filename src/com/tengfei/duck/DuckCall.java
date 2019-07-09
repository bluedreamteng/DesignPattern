package com.tengfei.duck;

import com.tengfei.duck.quackheavior.MallardDuck;

public class DuckCall {
    private Duck duck;

    public DuckCall(Duck duck) {
        this.duck = duck;
    }
    public void performQuack(){
        duck.performQuack();
    }


    public static void main(String[] args) {
        DuckCall duckCall = new DuckCall(new MallardDuck());
        duckCall.performQuack();
    }
}
