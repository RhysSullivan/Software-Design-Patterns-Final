package ShoppingCart.Payments;

// CreditCard is a concrete implementation of PaymentMethod
public class CreditCard implements PaymentMethod {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public void pay(double amount) {
        // implement credit card payment
    }
}
