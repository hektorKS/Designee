package behavioral.visitor.fruitsexample;

public interface IFruitVisitor {

  void Visit(Orange fruit);

  void Visit(Apple fruit);

  void Visit(Banana fruit);

}
