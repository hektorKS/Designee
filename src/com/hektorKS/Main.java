package com.hektorKS;

import com.hektorKS.Behavioral.Strategy.StrategyTester;
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


        Logger.INSTANCE.saveLog();
    }
}
