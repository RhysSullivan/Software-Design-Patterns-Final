package ShoppingCart.Products;

public class ProductBuilder {
    // The product that is being built
    private final Product product;
  
    // Construct a new ProductBuilder instance
    public ProductBuilder() {
      this.product = new Product();
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
  
    // Set the quantity of the product
    public ProductBuilder setQuantity(int quantity) {
      product.setQuantity(quantity);
      return this;
    }
  
    // Return the built product
    public Product build() {
      return product;
    }
  }
  