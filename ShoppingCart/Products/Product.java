package ShoppingCart.Products;

 public class Product {
    private String name;
    private double price;
    private int quantity;

    // Set the name of the product
    public void setName(String name) {
      this.name = name;
    }

    // Set the price of the product
    public void setPrice(double price) {
      this.price = price;
    }

    // Set the quantity of the product
    public void setQuantity(int quantity) {
      this.quantity = quantity;
    }

    // Get the name of the product
    public String getName() {
      return name;
    }

    // Get the price of the product
    public double getPrice() {
      return price;
    }

    // Get the quantity of the product
    public int getQuantity() {
      return quantity;
    }
  }