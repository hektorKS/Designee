package main.java.Structural.Facade;

public class API {

    private User user;
    private Cart cart;
    private Product product;

    public String login(){
        if(this.user != null) {
            return user.login();
        }
        else {
            this.user = new User();
            return user.login();
        }
    }

    public String register(){
        if(this.user != null) {
            return user.register();
        }
        else {
            this.user = new User();
            return user.register();
        }
    }

    public String getItems() {
        if (this.cart != null) {
            return cart.getItems();
        } else {
            this.cart = new Cart();
            return cart.getItems();
        }
    }

    public String getAll(){
        if (this.product != null) {
            return product.getAll();
        } else {
            this.product = new Product();
            return product.getAll();
        }
    }

    public String getProduct(Integer id){
        if (this.product != null) {
            return product.getProduct(id);
        } else {
            this.product = new Product();
            return product.getProduct(id);
        }
    }
}
