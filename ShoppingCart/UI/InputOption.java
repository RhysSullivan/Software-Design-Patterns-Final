package ShoppingCart.UI;

public class InputOption {
    private String options[];

    InputOption(String options[]) {
        this.options = options;
    }

    private InputOption() {
    } // Hide default constructor

    public String getOptions() {
        String output = "";
        for (int i = 0; i < options.length; i++) {
            output += i + ". " + options[i];
        }
        return output;
    }
}
