// Written by Rhys Sullivan
package ShoppingCart.Products;

public class Product {
  // Required fields
  private int id;

  private String name;
  private double price;

  // optional fields
  private String color;
  private String size;
  private String type;

  Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getId() {
    return Integer.toString(id);
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  // Set the name of the product
  public void setName(String name) {
    this.name = name;
  }

  // Set the price of the product
  public void setPrice(double price) {
    this.price = price;
  }

  // Get the name of the product
  public String getName() {
    return name;
  }

  // Get the price of the product
  public double getPrice() {
    return price;
  }

}