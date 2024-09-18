package n3e1;

public class TennisNewsEntry extends NewsEntry {
    protected String competition;
    protected String player;

    public TennisNewsEntry(String title, String competition, String player) {
        super(title);
        this.competition = competition;
        this.player = player;
    }

    private final int basePrice = 150;

    @Override
    public int calculatePrice() {
        int finalPrice = basePrice;
        if(player.contains("Federer") || player.contains("Nadal") || player.contains("Djokovic")) {
            finalPrice += 100;
        }
        return finalPrice;
    }

    private final int baseRating = 4;

    @Override
    public int calculateRating() {
        int finalRating = baseRating;
        if(player.contains("Federer") || player.contains("Nadal") || player.contains("Djokovic")) {
            finalRating += 3;
        }

        return finalRating;
    }
}
