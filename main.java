import ShoppingCart.ShoppingCart;
import ShoppingCart.Inventory.Inventory;
import ShoppingCart.Payments.CreditCard;
import ShoppingCart.UI.*;

public class main {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart(Inventory.getInventory());
    cart.setPaymentMethod(new CreditCard("1234567890123456", "123", "12/25", "John Doe"));
    cart.addProduct(1);
    cart.checkout();
    
    IO cartOutput = new IO(cart);
  }
}