package org.designpatterns.c01strategypattern.models;


import org.designpatterns.c01strategypattern.behaviours.FlyBehaviour;
import org.designpatterns.c01strategypattern.behaviours.QuackBehaviour;

public class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck(){

    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
