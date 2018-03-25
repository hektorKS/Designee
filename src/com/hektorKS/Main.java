package com.hektorKS;

import com.hektorKS.Behavioral.Strategy.StrategyTester;
import com.hektorKS.Creational.AbstractFactory.AbstractFactoryTester;
import com.hektorKS.Creational.DependencyInjection.DependencyInjectionTester;
import com.hektorKS.Creational.FactoryMethod.FactoryMethodTester;
import com.hektorKS.Creational.FactoryMethod.NoPizzaException;
import com.hektorKS.Creational.Prototype.PrototypeTester;
import com.hektorKS.Creational.Singleton.Logger;

public class Main {

    public static void main(String[] args) {

        StrategyTester strategy = new StrategyTester();
        strategy.test();

        PrototypeTester prototype = new PrototypeTester();
        try {
            prototype.test();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        AbstractFactoryTester abstractFactory = new AbstractFactoryTester();
        abstractFactory.test();

        DependencyInjectionTester dependencyInjection = new DependencyInjectionTester();
        dependencyInjection.test();

        try {
            FactoryMethodTester factoryMethod = new FactoryMethodTester();
            factoryMethod.test();
        } catch (NoPizzaException e) {
            System.out.println(e);
        }


        Logger.INSTANCE.saveLog();
    }
}
