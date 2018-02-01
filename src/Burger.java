public class Burger extends Food {
    String[][] burgerList = {
            {"Big Mac", "Filet-O-Fish", "Cheeseburger", "Hamburger"}
    };



    int burgerIndex;
    int sizeIndex;

    public Burger(String name, int burgerIndex, int sizeIndex) {
        super(name);
        this.burgerIndex = burgerIndex;
        this.sizeIndex = sizeIndex;
    }



}
