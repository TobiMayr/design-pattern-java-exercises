package org.designpatterns.c01strategypattern.models;


import org.designpatterns.c01strategypattern.behaviours.Quack;

public class DuckCallDevice extends Device {

    public DuckCallDevice () {
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a device that quacks");
    }
}
