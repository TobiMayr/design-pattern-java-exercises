package org.designpatterns.c01strategypattern.behaviours;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
