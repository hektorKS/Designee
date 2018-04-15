package main.java.Behavioral.Visitor.CompanyExample;

public class Programmer implements Visitable {

    Integer salary;

    public Programmer(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
