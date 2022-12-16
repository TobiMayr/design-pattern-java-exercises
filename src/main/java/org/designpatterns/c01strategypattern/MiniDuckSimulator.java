package org.designpatterns.c01strategypattern;


import org.designpatterns.c01strategypattern.behaviours.FlyRocketPowered;
import org.designpatterns.c01strategypattern.models.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("Mallard Duck:");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\nModel Duck:");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println("\nDuck Call Device:");
        Device duckCallDevice = new DuckCallDevice();
        duckCallDevice.performQuack();
    }
}
