package n1e1;

public abstract class Instrument {
    abstract public void play();
    private final String name;
    private final double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("L'instrument " + name + " te el preu de " + price + ".");
    }
}

