package com.hektorKS.Behavioral.Strategy;

import com.hektorKS.Creational.Singleton.Logger;


/**
 * Strategy design pattern
 *The strategy pattern is used to solve problems that might (or is foreseen they might) be implemented or
 * solved by different strategies and that possess a clearly defined interface for such cases.
 * Each strategy is perfectly valid on its own with some of the strategies being preferable in certain situations
 * that allow the application to switch between them during runtime.
 *
 */
public class StrategyTester {

    private Tax tax;
    private StringBuilder log;

    public StrategyTester() {
        this.log = new StringBuilder();
        log.append("Strategy design pattern tests\n");
        log.append("-> counting taxes in different countries using common interface\n");
    }

    public void test() {

        this.tax = new TaxPL();
        log.append("Tax in Poland: ");
        log.append(tax.count(100));
        log.append("\n");

        this.tax = new TaxFR();
        log.append("Tax in France: ");
        log.append(tax.count(100));
        log.append("\n");

        this.tax = new TaxDE();
        log.append("Tax in Germany: ");
        log.append(tax.count(100));
        log.append("\n");

        this.tax = new TaxEN();
        log.append("Tax in United Kingdom: ");
        log.append(tax.count(100));
        log.append("\n");
        log.append("-----------------------------------------------------------------------------------------------\n");

        Logger.INSTANCE.addToLog(log.toString());
    }

}

