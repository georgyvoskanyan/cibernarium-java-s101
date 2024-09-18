package n3e1;

import java.util.Scanner;

public class NewsManager {
    Scanner scanner;

    public NewsManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printNewsClassesMenu() {
        System.out.println("-------------------------------------------------");
        System.out.println("1. Futbol");
        System.out.println("2. Bàsquet");
        System.out.println("3. Tenis");
        System.out.println("4. F1");
        System.out.println("5. Motociclisme");
        System.out.println("-------------------------------------------------");
    }

    public NewsEntry requestNewsEntry() {
        printNewsClassesMenu();
        System.out.println("Tria:");
        int menuItem = scanner.nextInt();
        scanner.nextLine();

        String newsTitle = InputHelper.requestField("Titular: ");
        String newsText = InputHelper.requestOptionalField("Texte (opcional, buid per omisiò)");

        NewsEntry entry;

        switch(menuItem) {
            case 1: {

                String competition = InputHelper.requestField("Competició:");
                String club = InputHelper.requestField("Club:");
                String player = InputHelper.requestField("Jugador:");

                entry = new FootballNewsEntry(newsTitle, competition, club, player);
                break;
            }
            case 2: {
                String competition = InputHelper.requestField("Competició:");
                String club = InputHelper.requestField("Club:");

                entry = new BasketballNewsEntry(newsTitle, competition, club);
                break;
            }
            case 3: {
                String competition = InputHelper.requestField("Competició:");
                String player = InputHelper.requestField("Tenista:");

                entry = new TennisNewsEntry(newsTitle, competition, player);
                break;

            }
            case 4: {
                String flag = InputHelper.requestField("Escuderia:");
                entry = new F1NewsEntry(newsTitle, flag);
                break;

            }
            case 5: {
                String team = InputHelper.requestField("Equipo:");
                entry = new MotocyclismNewsEntry(newsTitle, team);
                break;
            }
            default: {
                System.out.println("ERROR: No s'ha pogut reconèixer la classe de noticia!");
                return null;
            }
        }

        if(!newsText.isEmpty()) {
            entry.setText(newsText);
        }

        return entry;


    }

}
