// Written by Ben Roberts

package ShoppingCart.Payments;

// PayPal represents a class that cannot be changed
public class PayPal {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean unchangeablePay(double amount) {
        System.out.println("Calling PayPal API");
        return true;
    }
}