package n3e1;

public class FootballNewsEntry extends NewsEntry {

    public FootballNewsEntry(String title, String competition, String club, String player) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    protected String competition;
    protected String club;
    protected String player;

    private final int basePrice = 300;

    @Override
    public int calculatePrice() {
        int finalPrice = basePrice;
        if(competition.contains("Lliga de Campions")) {
            finalPrice += 100;
        }
        if(club.contains("Barça") || club.contains("Madrid")) {
            finalPrice += 100;
        }
        if(player.contains("Ferran Torres") || player.contains("Benzema")) {
            finalPrice += 50;
        }
        return finalPrice;
    }

    private final int baseRating = 5;

    @Override
    public int calculateRating() {
        int finalRating = baseRating;
        if(competition.contains("Lliga de Campions")) {
            finalRating += 3;
        } else if(competition.contains("Lliga")) {
            finalRating += 2;
        }

        if(club.contains("Barça") || club.contains("Madrid")) {
            finalRating += 1;
        }
        if(player.contains("Ferran Torres") || player.contains("Benzema")) {
            finalRating += 1;
        }
        return finalRating;
    }

}
