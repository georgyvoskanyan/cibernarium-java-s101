package n3e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Editor {
    private String name;
    private final String DNI;
    private static int salary = 1500;

    List<NewsEntry> newsEntries = new ArrayList<>();

    public String getDNI() {
        return DNI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editor editor = (Editor) o;
        return Objects.equals(DNI, editor.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DNI);
    }

    public Editor(String DNI, String name) {
        this.DNI = DNI;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printNews() {
        if(getNewsEntriesCount()==0) {
            System.out.printf("Redactor/a %s encara no té cap noticia\n", getName());
            return;
        }
        for(NewsEntry newsEntry : newsEntries){
            System.out.println(newsEntry);
        }
    }

    public void addNewsEntry(NewsEntry entry) {
        newsEntries.add(entry);
    }

    public boolean deleteNewsEntry(String title) {
        return newsEntries.removeIf(newsEntry -> newsEntry.getTitle().equals(title));
    }
    
    public NewsEntry findNewsEntry(String title) {
        return newsEntries.stream()
                .filter(entry -> entry.getTitle().equals(title))
                .findAny().orElse(null);
    }

    public int getNewsEntriesCount() {
        return newsEntries.size();
    }
}
