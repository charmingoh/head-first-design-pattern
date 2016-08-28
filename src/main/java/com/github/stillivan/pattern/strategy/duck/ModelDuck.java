package com.github.stillivan.pattern.strategy.duck;

import com.github.stillivan.pattern.strategy.fly.FlyNoWay;
import com.github.stillivan.pattern.strategy.quack.Quack;

/**
 * Created by charming on 16/8/28.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck.");
    }
}