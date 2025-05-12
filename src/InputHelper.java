import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);
    public static final String RED = "\u001B[31m"; // Rød tekst til fejl
    public static final String RESET = "\u001B[0m"; // Nulstil farve
    public static final String BOLD = "\u001B[1m"; // Fed skrift

    public static Integer getIntInput(String prompt) {
        Integer input = null;
        while (input == null) {
            try {
                System.out.print(prompt);
                input = Integer.parseInt(scanner.nextLine()); // Prøv at konvertere brugerens input til et heltal
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        return input;
    }

    public static String getStringInput(String prompt) {
        String input = null;
        while (input == null || input.trim().isEmpty()) {
            System.out.print(prompt);
            input = scanner.nextLine(); // Læs input som en streng
            if (input.trim().isEmpty()) {
                System.out.println("Invalid input! Please enter a non-empty string.");
            }
        }
        return input;
    }

    public static int getIntBoundedInput(String prompt, int min, int max) {
        Integer input = null;
        while (input == null || input < min || input > max) {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input < min || input > max) {
                    System.out.println("Please enter a value between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        return input;
    }
}