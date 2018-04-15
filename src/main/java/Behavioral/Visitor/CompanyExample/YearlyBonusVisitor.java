package main.java.Behavioral.Visitor.CompanyExample;

public class YearlyBonusVisitor implements Visitor {

    @Override
    public String visit(Boss boss) {
        return Double.toString(boss.salary * .1);
    }

    @Override
    public String visit(ProjectLead projectLead) {
        return Double.toString(projectLead.salary * .05);
    }

    @Override
    public String visit(Programmer programmer) {
        return Double.toString(programmer.salary * .2);
    }
}
