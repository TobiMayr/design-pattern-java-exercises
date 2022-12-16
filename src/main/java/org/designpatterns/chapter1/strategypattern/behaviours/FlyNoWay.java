package org.designpatterns.chapter1.strategypattern.behaviours;

public class FlyNoWay implements FlyBehaviour{

    public void fly() {
        System.out.println("I can't fly");
    }
}
