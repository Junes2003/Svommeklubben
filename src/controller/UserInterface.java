package controller;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner = new Scanner(System.in);

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMenu() {
        System.out.println("--- MENU ---");
        System.out.println("1. Chairman");
        System.out.println("2. Accountant");
        System.out.println("3. Coach");
        System.out.println("0. Exit");
    }

    public String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public int getIntInput(String prompt) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number.");
            return -1;
        }
    }

    public double getDoubleInput(String prompt) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number.");
            return -1.0;
        }
    }
}