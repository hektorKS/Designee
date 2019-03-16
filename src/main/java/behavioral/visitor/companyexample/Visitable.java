package behavioral.visitor.companyexample;

public interface Visitable {
  String accept(Visitor visitor);
}
