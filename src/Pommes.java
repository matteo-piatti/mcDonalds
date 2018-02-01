import java.util.ArrayList;

public class Pommes extends Food{
    String[][] size = {
                            {"Mini", "Small", "Medium"},
                            {"2.90", "3.50", "3.90"},
                            {"240", "340", "450"}
    };

    int sizeIndex;

    public Pommes(String name, int sizeIndex) {
        super(name);
        this.sizeIndex = sizeIndex;
    }

    @Override
    public void printInfo() {
        System.out.println("Name : " + name + " PRICE : " + size[1][sizeIndex] + " CHF " + " SIZE : " + size[0][sizeIndex] + " KCAL : " + size[2][sizeIndex]);
    }
}
