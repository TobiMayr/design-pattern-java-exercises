package org.designpatterns.chapter1.strategypattern.models;

import org.designpatterns.chapter1.strategypattern.behaviours.FlyNoWay;
import org.designpatterns.chapter1.strategypattern.behaviours.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
