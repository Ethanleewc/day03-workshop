
/**
 * Main
 * App
 */

public class MultiUserShoppingCart {

    public static void main(String[] args) {
        
        ShoppingCartDB cart = new ShoppingCartDB("cartdb"); // default folder: "db"
        // cart.setup();
        cart.startShell();
        
    }
    
}