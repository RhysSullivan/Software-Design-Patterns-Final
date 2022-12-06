import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // create a variable to store the selected option
        int option;

        // create a variable to store the selected payment provider
        String paymentProvider = "";

        // create a list to store the selected items in the cart
        List<String> cart = new ArrayList<>();

        // display the main menu
        displayMainMenu(cart, paymentProvider);

        // read the selected option from the user
        option = scanner.nextInt();

        // loop until the user selects the "Back to main menu" option
        while (option != 4) {
            // handle the selected option
            switch (option) {
                case 1:
                    // if the user selected the "Choose Products" option, display the "Choose
                    // Products" menu
                    displayChooseProductsMenu(cart);
                    break;
                case 2:
                    // if the user selected the "Choose Payment Provider" option, display the
                    // "Choose Payment Provider" menu
                    paymentProvider = displayChoosePaymentProviderMenu(scanner);
                    break;
            }

            // display the main menu
            displayMainMenu(cart, paymentProvider);

            // read the selected option from the user
            option = scanner.nextInt();
        }
    }

    public static void displayMainMenu(List<String> cart, String paymentProvider) {
        // clear the console
        System.out.println("\033[H\033[2J");

        // display the main menu
        System.out.println("Main Menu:");
        System.out.println("Cart Items: " + cart);
        System.out.println("Payment Provider: " + paymentProvider);
        System.out.println("1. Choose Products");
        System.out.println("2. Choose Payment Provider");
    }

  public static void displayChooseProductsMenu(List<String> cart) {
    // clear the console
    System.out.println("\033[H\033[2J");

    // display the "Choose Products" menu
    System.out.println("Choose Products:");
    System.out.println("1 ( ) Shoes");
    System.out.println("2 ( ) Onions");
    System.out.println("3 ( ) Dogs");
    System.out.println("4 Back to main menu");

    // read the selected option from the user
    int option = scanner.nextInt();

    // add the selected item to the cart
    switch (option) {
      case 1:
        cart.add("Shoes");
        break;
      case 2:
        cart.add("Onions");
        break;
      case 3:
        cart.add("Dogs");
        break;
    }
  }

public static String displayChoosePaymentProviderMenu(Scanner scanner) {
    // clear the console
    System.out.println
