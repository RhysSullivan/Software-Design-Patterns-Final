package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

import ShoppingCart.Inventory.Inventory;
import ShoppingCart.Payments.PaymentMethod;
import ShoppingCart.Products.Product;

public class ShoppingCart {
    // list of products in the cart
    private List<Product> products = new ArrayList<>();
    private Inventory inventory;

    public ShoppingCart(Inventory inventory) {
        this.inventory = inventory;
    }

    // payment method for checkout
    private PaymentMethod paymentMethod;

    // observer list to dispatch actions
    private List<ActionObserver> observers = new ArrayList<>();

    public void addProduct(int id) {
        Product product = inventory.getInventoryItem(id);
        if (product != null) {
            products.add(product);
        }
        dispatchAction(Action.ADD);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        inventory.addInventoryItem(product);
        dispatchAction(Action.REMOVE);
    }

    public void checkout() {
        var amountToPay = products.stream().mapToDouble(p -> p.getPrice()).sum();
        if (paymentMethod.pay(amountToPay)) {
            dispatchAction(Action.CHECKOUT);
        }
    }

    public void clear() {
        // add back to inventory
        for (Product product : products) {
            inventory.addInventoryItem(product);
        }
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
