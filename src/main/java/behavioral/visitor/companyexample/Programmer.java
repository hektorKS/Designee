package behavioral.visitor.companyexample;

public class Programmer implements Visitable {

  Integer salary;

  Programmer(Integer salary) {
    this.salary = salary;
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visit(this);
  }
}
