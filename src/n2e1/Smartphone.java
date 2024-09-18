package n2e1;

public class Smartphone extends Telephone implements Camera, Watch {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void takePhoto() {
        System.out.println("S’està fent una foto");
    }
    public void executeAlarm() {
        System.out.println("Està sonant l’alarma");
    }
}
