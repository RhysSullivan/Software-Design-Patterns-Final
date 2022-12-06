import ShoppingCart.ShoppingCart;
import ShoppingCart.Analytics.Analytics;
import ShoppingCart.Inventory.Inventory;
import ShoppingCart.Payments.CreditCard;
import ShoppingCart.Payments.PayPalAdapter;

public class main {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart(Inventory.getInventory());
    Analytics analytics = new Analytics();
    cart.registerObserver(analytics);

    // Set payment method to a credit card
    // Add items of ids 1 2 3 to the card
    // Clear the cart
    // Add items of ids 1 2 to the cart
    // Checkout the cart

    cart.setPaymentMethod(new CreditCard("john doe", "123", "12/25", "12/15"));
    cart.addProduct(1);
    cart.addProduct(2);
    cart.addProduct(3);
    cart.clear();
    cart.addProduct(1);
    cart.addProduct(2);
    cart.checkout();

    System.out.println("\n\n");
    // Demo changing payment method
    cart.setPaymentMethod(new PayPalAdapter("rhys@champlain", "drowssap"));
    cart.addProduct(5);
    cart.addProduct(6);
    cart.addProduct(8);
    cart.addProduct(9);
    cart.checkout();
  }
}