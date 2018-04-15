package test.java.Behavioral.Visitor.CompanyExample;

import main.java.Behavioral.Visitor.CompanyExample.Boss;
import main.java.Behavioral.Visitor.CompanyExample.Programmer;
import main.java.Behavioral.Visitor.CompanyExample.ProjectLead;
import main.java.Behavioral.Visitor.CompanyExample.YearlyBonusVisitor;
import main.java.Creational.Singleton.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {

    private StringBuilder log;

    @Before
    public void setUp() throws Exception {
        this.log = new StringBuilder();
        log.append("VISITOR\n\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }
    @Test
    public void test(){
        YearlyBonusVisitor yearlyBonusVisitor = new YearlyBonusVisitor();

        Boss boss = new Boss(100_000);
        log.append("Bonus for boss: ");
        log.append(yearlyBonusVisitor.visit(boss));
        log.append("\n");

        Programmer programmer = new Programmer(60_000);
        log.append("Bonus for programmer: ");
        log.append(yearlyBonusVisitor.visit(programmer));
        log.append("\n");

        ProjectLead projectLead = new ProjectLead(20_000);
        log.append("Bonus for project lead: ");
        log.append(yearlyBonusVisitor.visit(projectLead));
        log.append("\n");
    }

}