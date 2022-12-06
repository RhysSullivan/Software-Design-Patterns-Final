// Written by Rhys Sullivan
package ShoppingCart.Inventory;

import java.util.HashMap;

import ShoppingCart.Products.Product;
import ShoppingCart.Products.ProductBuilder;

public class Inventory {
    private static Inventory inventory = new Inventory();

    private Inventory() {
        inventoryItems.put("1", new ProductBuilder(1, "Shoe", 1.00).setColor("red").build());
        inventoryItems.put("2", new ProductBuilder(2, "Hat", 1.00).setColor("red").build());
        inventoryItems.put("3", new ProductBuilder(3, "T-Shirt", 1.00).setColor("red").build());
        inventoryItems.put("4", new ProductBuilder(4, "Pants", 1.00).setColor("red").build());
        inventoryItems.put("5", new ProductBuilder(5, "Socks", 1.00).setColor("red").build());
        inventoryItems.put("6", new ProductBuilder(6, "Hair Tie", 1.50).build());
        inventoryItems.put("7", new ProductBuilder(7, "Keyboard", 2.00).build());
    }

    public static Inventory getInventory() {
        return inventory;
    }

    private HashMap<String, Product> inventoryItems = new HashMap<>();

    public Product getInventoryItem(int id) {
        // find by id and remove from inventory items
        return inventoryItems.remove(Integer.toString(id));

    }

    public void addInventoryItem(Product product) {
        inventoryItems.put(product.getId(), product);
    }
}
