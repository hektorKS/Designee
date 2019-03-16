package behavioral.visitor.companyexample;

public class Boss implements Visitable {

  Integer salary;

  Boss(Integer salary) {
    this.salary = salary;
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visit(this);
  }
}
