package n3e1;

public class BasketballNewsEntry extends NewsEntry {
    protected String competition;
    protected String club;

    public BasketballNewsEntry(String title, String competition, String club) {
        super(title);
        this.competition = competition;
        this.club = club;
    }

    private final int basePrice = 250;

    @Override
    public int calculatePrice() {
        int finalPrice = basePrice;
        if(competition.contains("Eurolliga")) {
            finalPrice += 75;
        }
        if(club.contains("Barça") || club.contains("Madrid")) {
            finalPrice += 75;
        }
        return finalPrice;
    }

    private final int baseRating = 4;

    @Override
    public int calculateRating() {
        int finalRating = baseRating;
        if(competition.contains("Eurolliga")) {
            finalRating += 3;
        } else if(competition.contains("ACB")) {
            finalRating += 2;
        }

        if(club.contains("Barça") || club.contains("Madrid")) {
            finalRating += 1;
        }

        return finalRating;
    }
}
