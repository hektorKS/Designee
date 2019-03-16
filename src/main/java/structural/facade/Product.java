package structural.facade;

public class Product {

  public String getAll() {
    return "Products list...";
  }

  public String getProduct(Integer id) {
    return "Product with ID " + id.toString();
  }
}
