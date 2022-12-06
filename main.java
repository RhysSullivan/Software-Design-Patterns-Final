import ShoppingCart.ShoppingCart;
import ShoppingCart.Inventory.Inventory;
import ShoppingCart.Payments.CreditCard;

public class Main {
  public static void main(String[] args) {
    Inventory inventory = new Inventory();
    ShoppingCart cart = new ShoppingCart(inventory);
    cart.setPaymentMethod(new CreditCard("1234567890123456", "123", "12/25", "John Doe"));
    cart.addProduct(1);
    cart.checkout();
  }
}