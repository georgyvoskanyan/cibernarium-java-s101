package n1e1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hola i benvingut/da al grup!");

        StringInstrument violin = new StringInstrument("Violin", 100);
        WindInstrument clarinet = new WindInstrument("Clarinete", 150);
        PercussionInstrument cymbal = new PercussionInstrument("Timbal", 50);

        violin.play();
        clarinet.play();
        cymbal.play();
    }
}