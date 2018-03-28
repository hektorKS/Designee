package com.hektorKS.Structural.Adapter;

import com.hektorKS.Creational.Singleton.Logger;

/**
 * Convert the interface of a class into
 * another interface clients expect. Lets
 * classes work together that couldn't
 * otherwise because of incompatible
 * interfaces.
 *
 * Example:
 * We want to start using new SuperLibrary with fixed some functions,
 * but whole project is using old SuperLibrary,
 * which has completely different methods names
 *
 */
public class AdapterTester {

    private StringBuilder log;

    {
        this.log = new StringBuilder();
        log.append("Adapter design pattern tests\n\n");
    }

    public void test(){
        Client client = new Client(log);
        client.doFancyThingsWithSuperLibrary();

        log.append("-----------------------------------------------------------------------------------------------\n");

        Logger.INSTANCE.addToLog(log.toString());
    }

}
