package main.java.Behavioral.Visitor.CompanyExample;

public class ProjectLead implements Visitable {

    Integer salary;

    public ProjectLead(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
