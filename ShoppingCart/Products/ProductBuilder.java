package ShoppingCart.Products;

public class ProductBuilder {
  // The product that is being built
  private final Product product;

  // Construct a new ProductBuilder instance
  public ProductBuilder(int id, String name, double price) {
    this.product = new Product(id, name, price);
  }

  // Set the name of the product
  public ProductBuilder setName(String name) {
    product.setName(name);
    return this;
  }

  // Set the price of the product
  public ProductBuilder setPrice(double price) {
    product.setPrice(price);
    return this;
  }

  // Set the color of the product
  public ProductBuilder setColor(String color) {
    product.setColor(color);
    return this;
  }

  // Set the size of the product
  public ProductBuilder setSize(String size) {
    product.setSize(size);
    return this;
  }

  // Set the type of the product
  public ProductBuilder setType(String type) {
    product.setType(type);
    return this;
  }

  // Return the built product
  public Product build() {
    return product;
  }
}
