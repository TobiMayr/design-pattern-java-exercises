package org.designpatterns.c01strategypattern.models;


import org.designpatterns.c01strategypattern.behaviours.QuackBehaviour;

public class Device {
    QuackBehaviour quackBehaviour;

    public Device() {}

    public void performQuack() {
        quackBehaviour.quack();
    }
}
