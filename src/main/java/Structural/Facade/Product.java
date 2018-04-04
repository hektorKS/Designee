package main.java.Structural.Facade;

public class Product {

    public String getAll(){
        return "Products list...";
    }

    public String getProduct(Integer id){
        return "Product with ID " + id.toString();
    }
}
