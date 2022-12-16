package org.designpatterns.c01strategypattern.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
