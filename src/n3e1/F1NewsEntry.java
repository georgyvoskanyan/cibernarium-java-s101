package n3e1;

public class F1NewsEntry extends NewsEntry {
    protected String flag;

    public F1NewsEntry(String title, String flag) {
        super(title);
        this.flag = flag;
    }

    private final int basePrice = 100;

    @Override
    public int calculatePrice() {
        int finalPrice = basePrice;
        if(flag.contains("Ferrari") || flag.contains("Mercedes")) {
            finalPrice += 50;
        }
        return finalPrice;
    }

    private final int baseRating = 4;

    @Override
    public int calculateRating() {
        int finalRating = baseRating;
        if(flag.contains("Ferrari") || flag.contains("Mercedes")) {
            finalRating += 2;
        }

        return finalRating;
    }
}
