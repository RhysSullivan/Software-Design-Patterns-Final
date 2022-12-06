package ShoppingCart.Payments;

  // PaymentMethod is an interface that defines a pay method
  public interface PaymentMethod {
    void pay(double amount);
  }