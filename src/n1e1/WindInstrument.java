package n1e1;

public class WindInstrument extends Instrument {
    static {
        System.out.println("La classe WindInstrument s'està carregant");
    }
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }
}
