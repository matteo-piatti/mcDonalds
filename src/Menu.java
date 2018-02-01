import java.util.*;

public class Menu {
    ArrayList<Food> foods = new ArrayList<>();
    int foodItem;



    public void printMenu() {
        System.out.println("    |Menu|\n \n|1. Burger \n|2. Wraps \n|3. Snacks \n|4. Getränke \n\n|5. Warenkorb \n|6. Bestellen");
        System.out.println("\nDeine Auswahl : ");
        Scanner reader = new Scanner(System.in);
        foodItem = reader.nextInt();
        reader.close();
        clear();
        print(foodItem);
    }

    public void print(int foodItem) {
        if (foodItem == 1) {
            System.out.println("Burger ");
            System.out.println("...");
        }
        if (foodItem == 2) {
            System.out.println("Wraps ");
            System.out.println("...");
        }
        if (foodItem == 3) {
            System.out.println("Snacks");
            System.out.println("...");
        }
        if (foodItem == 4) {
            System.out.println("Getränke");
            System.out.println("...");
        }
        if (foodItem == 5) {
            System.out.println("Dein Warenkorb ");
            System.out.println("...");
        }
        if (foodItem == 6) {
            System.out.println("Du hast folgendes bestellt ");
            System.out.println("...");
        }
    }

    public void clear(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
