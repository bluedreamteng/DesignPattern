package com.tengfei.duck;

import com.tengfei.duck.flyBeheavior.FlyWithWings;
import com.tengfei.duck.flyBeheavior.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBeheavior(new FlyWithWings());
        modelDuck.performFly();
    }
}
