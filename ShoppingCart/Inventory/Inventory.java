package ShoppingCart.Inventory;

import java.util.ArrayList;
import java.util.List;

import ShoppingCart.Products.Product;
import ShoppingCart.Products.ProductBuilder;

public static class Inventory {
    private static Inventory inventory = new Inventory();
    private Inventory() {
        inventoryItems.add(new ProductBuilder(1, "Shoe", 1.00, 10).setColor("red").build());
        inventoryItems.add(new ProductBuilder(2, "Hair Tie", 1.50, 10).build());
        inventoryItems.add(new ProductBuilder(3, "Keyboard", 2.00, 10).build());
    }

    public Inventory getInventory() {
        return inventory;
    }

    private List<Product> inventoryItems = new ArrayList<>();
    
    public List<Product> getInventoryItems() {
        return inventoryItems;
    }

    public Product getInventoryItem(int id) {
        for (Product product : inventoryItems) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void addInventoryItem(Product product) {
        inventoryItems.add(product);
    }
}
