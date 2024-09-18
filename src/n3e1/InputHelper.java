package n3e1;

import java.util.Scanner;

public class InputHelper {


    public static String requestField(String message) {
        Scanner scanner = new Scanner(System.in);

        String result = "";
        while(true) {
            System.out.println(message);
            result = scanner.nextLine();
            if(!result.isEmpty()) break;
            System.out.println("Si us plau, introdueix un valor");
        }
        return result;

    }

    public static String requestOptionalField(String message) {
        Scanner scanner = new Scanner(System.in);

        String result = "";

        System.out.println(message);
        result = scanner.nextLine();

        return result;

    }
}
