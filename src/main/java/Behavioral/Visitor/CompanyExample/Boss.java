package main.java.Behavioral.Visitor.CompanyExample;

public class Boss implements Visitable{

    Integer salary;

    public Boss(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
