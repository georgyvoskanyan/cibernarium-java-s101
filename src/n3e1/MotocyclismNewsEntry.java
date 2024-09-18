package n3e1;

public class MotocyclismNewsEntry extends NewsEntry {
    protected String team;

    public MotocyclismNewsEntry(String title, String team) {
        super(title);
        this.team = team;
    }

    private final int basePrice = 100;

    @Override
    public int calculatePrice() {
        int finalPrice = basePrice;
        if(team.contains("Honda") || team.contains("Yamaha")) {
            finalPrice += 50;
        }
        return finalPrice;
    }

    private final int baseRating = 3;

    @Override
    public int calculateRating() {
        int finalRating = baseRating;

        if(team.contains("Honda") || team.contains("Yamaha")) {
            finalRating += 2;
        }

        return finalRating;
    }
}
