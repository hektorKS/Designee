package behavioral.visitor.companyexample;

public interface Visitor {
  String visit(Boss boss);

  String visit(ProjectLead projectLead);

  String visit(Programmer programmer);
}
