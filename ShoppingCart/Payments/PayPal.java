package ShoppingCart.Payments;

// PayPal is another concrete implementation of PaymentMethod
// but it requires a different set of parameters to initialize
public class PayPal implements PaymentMethod {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(double amount) {
        // implement PayPal payment
    }
}