package behavioral.visitor.companyexample;

public class ProjectLead implements Visitable {

  Integer salary;

  ProjectLead(Integer salary) {
    this.salary = salary;
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visit(this);
  }
}
