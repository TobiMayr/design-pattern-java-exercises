package org.designpatterns.c01strategypattern.models;


import org.designpatterns.c01strategypattern.behaviours.FlyWithWings;
import org.designpatterns.c01strategypattern.behaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
