// Written and inspired by Drew Marcotte, Rhys Sullivan, and Ben Roberts

package ShoppingCart;

import java.util.List;

import ShoppingCart.Products.Product;

public interface ActionObserver {
    void onAction(Action action, List<Product> products);
}