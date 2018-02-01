public abstract class Food {
    String name;

    public Food(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("NAME : " + name);
    }
}
