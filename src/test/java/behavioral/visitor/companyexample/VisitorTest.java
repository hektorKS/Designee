package behavioral.visitor.companyexample;


import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VisitorTest {

  private StringBuilder log;

  @BeforeEach
  void setUp() {
    this.log = new StringBuilder();
    log.append("VISITOR\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  @Test
  void test() {
    Visitor yearlyBonusVisitor = new YearlyBonusVisitor();

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