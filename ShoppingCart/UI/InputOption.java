package ShoppingCart.UI;

import java.util.ArrayList;
import java.util.List;

import ShoppingCart.Products.Product;

public class InputOption {
    private List<Product> options;
    
    InputOption(List<Product> options) {

        List<String> finalOptions = new ArrayList<String>();
        for (Product product : options) {
            finalOptions.add(product.getPrice() + "x " + product.getName() + " = " + product.getPrice());
        }

        this.options = options;
    }
    private InputOption(){} // Hide default constructor
    
    public String getOptions() {
        String output = "";
        for (int i = 0; i < options.size(); i++) {
            output += i + ". " + options.get(i) + "\n";
        }
        return output;
    }
}
