package org.designpatterns.c01strategypattern.models;


import org.designpatterns.c01strategypattern.behaviours.FlyNoWay;
import org.designpatterns.c01strategypattern.behaviours.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
