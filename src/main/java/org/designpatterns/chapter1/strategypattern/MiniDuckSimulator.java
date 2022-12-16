package org.designpatterns.chapter1.strategypattern;

import org.designpatterns.chapter1.strategypattern.behaviours.FlyRocketPowered;
import org.designpatterns.chapter1.strategypattern.models.*;

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
