package ShoppingCart.Analytics;

import java.util.List;
import java.util.stream.Collectors;

import ShoppingCart.Action;
import ShoppingCart.ActionObserver;
import ShoppingCart.Products.Product;

public class Analytics implements ActionObserver {
    public void onAction(Action action, List<Product> products) {
        switch (action) {
            case ADD:
                logAddAction(products);
                break;
            case REMOVE:
                logRemoveAction(products);
                break;
            case CHECKOUT:
                logCheckoutAction(products);
                break;
            case CLEAR:
                logClearAction();
                break;
        }
    }

    private void logAddAction(List<Product> products) {
        // Log the add action here
        List<String> productNames = products.stream().map(product -> product.getName())
                .collect(Collectors.toList());
        System.out.println("ADD action performed with products: " + productNames);
    }

    private void logRemoveAction(List<Product> products) {
        // Log the remove action here
        List<String> productNames = products.stream()
                .map(product -> product.getName())
                .collect(Collectors.toList());
        System.out.println("REMOVE action performed with products: " + productNames);
    }

    private void logCheckoutAction(List<Product> products) {
        // Log the checkout action here
        List<String> productNames = products.stream()
                .map(product -> product.getName())
                .collect(Collectors.toList());
        System.out.println("CHECKOUT action performed with products: " + productNames);
    }

    private void logClearAction() {
        // Log the clear action here
        System.out.println("CLEAR action performed");
    }
}
