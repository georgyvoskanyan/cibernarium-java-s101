package n2e1;

public class Telephone {
    private final String brand;
    private final String model;
    public void call(String numberBeingCalled) {
        System.out.printf("S’està trucant al número %s\n", numberBeingCalled);
    }

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
