package com.hektorKS.Creational.AbstractFactory;

import com.hektorKS.Creational.Singleton.Logger;

public class AbstractFactoryTester {

    private StringBuilder log;

    public AbstractFactoryTester() {
        this.log = new StringBuilder();
        log.append("Abstract Factory design pattern tests\n\n");
    }

    private void getOrderFromFactory(PlantFactory factory){

        Plant plant = factory.makePlant();
        Picker picker = factory.makePicker();
        log.append(picker.getName());
        log.append(" picks ");
        log.append(plant.getName());
        log.append(" in ");
        log.append(plant.getCropsTime());
        log.append("\n");

    }

    public void test(){

        AppleFactory factory1 = new AppleFactory();
        getOrderFromFactory(factory1);

        OrangeFactory factory2 = new OrangeFactory();
        getOrderFromFactory(factory2);

        log.append("-----------------------------------------------------------------------------------------------\n");

        Logger.INSTANCE.addToLog(log.toString());

    }
}
