import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Member> clubMembers;
    private List<Team> teams;
    private List<PerformanceRecord> performanceRecords;
    private List<Membership> memberships;

    public Menu() {
        // Ret stien så den peger på src/MemberInfo.csv
        clubMembers = MemberCSVLoader.loadMembersFromCSV("src/MemberInfo.csv");
        teams = new ArrayList<>();
        performanceRecords = new ArrayList<>();
        memberships = new ArrayList<>();
    }
    


    public void initializeMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose an option, please");
        System.out.println("1 - Chairman");
        System.out.println("2 - Accountant");
        System.out.println("3 - Coach");

        int menuInput = scan.nextInt();
        scan.nextLine();  // spiser newline

        switch (menuInput) {
            case 1 -> chairmanMenu();
            case 2 -> accountantMenu();
            case 3 -> coachMenu();
            default -> System.out.println("Invalid input, try again");
        }
    }

    public void chairmanMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter password:");
        String chairmanCodeInput = scan.nextLine();

        String chairmanCode = "1";
        if (!chairmanCodeInput.equals(chairmanCode)) {
            System.out.println("Invalid code, try again");
            return;
        }

        while (true) {
            System.out.println("\n1 - Register member");
            System.out.println("2 - View all members");
            System.out.println("0 - Exit");

            int input = scan.nextInt();
            scan.nextLine();  // spiser newline

            switch (input) {
                case 1 -> registerMember();
                case 2 -> viewAllMembers();
                case 0 -> {
                    System.out.println("Exiting chairman menu...");
                    return;
                }
                default -> System.out.println("Invalid input, try again.");
            }
        }
    }

    public void accountantMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter code: ");
        String accountantCodeInput = scan.nextLine();

        String accountantCode = "2";
        if (!accountantCodeInput.equals(accountantCode)) {
            System.out.println("Invalid code, try again!");
            return;
        }

        System.out.println("\nWelcome, Accountant");
        // tilføj accountant funktioner her...
    }

    public void coachMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter code: ");
        String coachCodeInput = scan.nextLine();

        String coachCode = "3";
        if (!coachCodeInput.equals(coachCode)) {
            System.out.println("Invalid code, try again!");
            return;
        }

        System.out.println("\nWelcome, Coach");
        // tilføj coach funktioner her...
    }

    public void viewAllMembers() {
        if (clubMembers.isEmpty()) {
            System.out.println("No members found.");
            return;
        }

        System.out.println("\nList of all members:");
        for (Member member : clubMembers) {
            System.out.println(member);
        }
    }

    public void registerMember() {
        System.out.println("Register member function not implemented yet.");
        // her kan du tilføje kode til at oprette nye medlemmer
    }

    public List<Member> getMembers() {
        return clubMembers;
    }
}
