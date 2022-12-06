package ShoppingCart.Payments;

// The Adapter pattern allows us to use the PayPal class as a PaymentMethod
// by providing a PayPalAdapter that implements the PaymentMethod interface
public class PayPalAdapter implements PaymentMethod {
    private PayPal payPal;

    public PayPalAdapter(String email, String password) {
        this.payPal = new PayPal(email, password);
    }

    public void pay(double amount) {
        payPal.pay(amount);
    }
}