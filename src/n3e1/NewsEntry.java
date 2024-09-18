package n3e1;

import java.util.Objects;

public abstract class NewsEntry {
    private String title;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NewsEntry(String title) {
        this.title = title;
    }

    abstract public int calculatePrice();
    abstract public int calculateRating();

    @Override
    public String toString() {
        return "Noticia {\n"
                    + "  Classe: \t"
                    + getClass() + "\n"
                    + "  Titular: \t"
                    + title + "\n"
                    + "  Text: \t"
                    + text + "\n"
                    + "  Preu: \t"
                    + calculatePrice() + " euros\n"
                    + "  Puntuaciò: \t"
                    + calculateRating() + " puntos\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsEntry newsEntry = (NewsEntry) o;
        return Objects.equals(title, newsEntry.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
