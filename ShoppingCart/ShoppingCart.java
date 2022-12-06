package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

import ShoppingCart.Payments.PaymentMethod;
import ShoppingCart.Products.Product;

public class ShoppingCart {
    // list of products in the cart
    private List<Product> products = new ArrayList<>();
    // payment method for checkout
    private PaymentMethod paymentMethod;

    // observer list to dispatch actions
    private List<ActionObserver> observers = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        dispatchAction(Action.ADD);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        dispatchAction(Action.REMOVE);
    }

    public void checkout() {
        dispatchAction(Action.CHECKOUT);
    }

    public void clear() {
        products.clear();
        dispatchAction(Action.CLEAR);
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // register an observer to receive actions
    public void registerObserver(ActionObserver observer) {
        observers.add(observer);
    }

    // unregister an observer to stop receiving actions
    public void unregisterObserver(ActionObserver observer) {
        observers.remove(observer);
    }

    // dispatch an action to all registered observers
    private void dispatchAction(Action action) {
        for (ActionObserver observer : observers) {
            observer.onAction(action, this.products);
        }
    }
}
