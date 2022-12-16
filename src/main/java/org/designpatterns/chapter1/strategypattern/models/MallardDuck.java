package org.designpatterns.chapter1.strategypattern.models;

import org.designpatterns.chapter1.strategypattern.behaviours.FlyWithWings;
import org.designpatterns.chapter1.strategypattern.behaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
