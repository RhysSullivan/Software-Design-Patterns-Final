package ShoppingCart.UI;

import java.util.Scanner;

public class IO {
    private void ClearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public void UpdateScreenOptions(InputOption output) {
        ClearScreen();
        System.out.println(output.getOptions());
    }

    public void UpdateScreenText(String output) {
        ClearScreen();
        System.out.println(output);
    }

    public String GetInput() {
        return(new Scanner(System.in).nextLine());
    }
}
