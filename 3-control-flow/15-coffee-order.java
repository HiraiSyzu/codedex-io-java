// Syzu 4/11/25
public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖

        // Variable Value
        boolean isLatte = true;
        boolean isIced = true;
        boolean withMatcha = false;

        int itemsOrdered = 20;
        int vanillaPumps = 15;

        // First Conditional
        if (isLatte && isIced) {
            System.out.println("espresso,milk,ice,syrup.");
        } else if (isLatte && withMatcha) {
            System.out.println("matcha,oat milk,ice,vanilla");
        } else if (isLatte) {
            System.out.println("espresso,steamed milk.");
        } else {
            System.out.println("Select a drink to get started!");
        }

        // Second Conditional
        if (itemsOrdered > 1) { // If customer order more than 1 items
            System.out.println("provide cup holder");
       }

        if (vanillaPumps >= 2 ) { // if customer orders more than 2 pumps of vanilla
            System.out.println("charge $1 extra");
       }
    }
}
