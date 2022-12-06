import ShoppingCart.Products.Product;
import ShoppingCart.Products.ProductBuilder;

// make the main method
class Main {

    public static void main(String[] args) {
        Product product = new ProductBuilder().setName("potatoes").setQuantity(4).build();
        System.out.println(product.getName());
    }
}