package n1e1;

public class StringInstrument extends Instrument {
    static {
        System.out.println("La classe StringInstrument s'està carregant");
    }
    public StringInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }
}
