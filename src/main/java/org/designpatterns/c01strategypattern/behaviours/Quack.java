package org.designpatterns.c01strategypattern.behaviours;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
