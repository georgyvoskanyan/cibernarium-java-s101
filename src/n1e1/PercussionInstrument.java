package n1e1;

public class PercussionInstrument extends Instrument {
    static {
        System.out.println("La classe PercussionInstrument s'està carregant");
    }
    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
