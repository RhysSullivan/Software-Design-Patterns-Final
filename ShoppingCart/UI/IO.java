package ShoppingCart.UI;

import java.util.List;
import java.util.Scanner;

import ShoppingCart.Action;
import ShoppingCart.ActionObserver;
import ShoppingCart.ShoppingCart;
import ShoppingCart.Inventory.Inventory;
import ShoppingCart.Products.Product;

public class IO implements ActionObserver {
    ShoppingCart cart;
    public IO(ShoppingCart cart) {
        this.cart = cart;
        this.cart.registerObserver(this); // Enroll IO into cart observer
    }

    private void IOStart() {
        while(true) {

        }
    }
    // Observer (at play)
    @Override
    public void onAction(Action action, List<Product> cartProducts) {
        switch (action) {
            case ADD: 
                UpdateScreen("Added a new item to the shopping cart", true);
            case REMOVE:
                UpdateScreen("Removed an item from the shopping cart", true);
            case CHECKOUT:
                UpdateScreen("We're off to checkout!", true);
            case CLEAR:
                UpdateScreen("Screw it! We're starting over!!!", true);

        }
        InputOption productOptions = new InputOption(Inventory.getInventory().getInventoryItems());
        UpdateScreen("Buyable items:", false);
        UpdateScreen(productOptions, false);

        InputOption cartOptions = new InputOption(cartProducts);
        UpdateScreen("Current products in cart: ", false);
        UpdateScreen(cartOptions, false);

        InterpretInput(GetInput());
    }

    private void ClearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private void UpdateScreen(String output, boolean clear) {
        if (clear) {
            ClearScreen();
        }
        System.out.println(output);
    }

    private void UpdateScreen(InputOption output, boolean clear) {
        if (clear) {
            ClearScreen();
        }
        System.out.println(output.getOptions());
    }

    private String GetInput() {
        return(new Scanner(System.in).nextLine());
    }

    private void InterpretInput(String input) {

    }
}
