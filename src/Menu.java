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

//        clubMembers = MemberCSVLoader.loadMembersFromCSV("src/MemberInfo.csv");

        clubMembers = MemberCSVLoader.loadMembersFromCSV("files/MemberInfo.csv");
        teams = new ArrayList<>();
        performanceRecords = new ArrayList<>();
        memberships = new ArrayList<>();
    }



    public void initializeMenu() {
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Choose an option, please");
            System.out.println("1 - Chairman");
            System.out.println("2 - Accountant");
            System.out.println("3 - Coach");

            int menuInput = InputHelper.getIntBoundedInput("", 0, 4);

            switch (menuInput) {
                case 1 -> chairmanMenu();
                case 2 -> accountantMenu();
                case 3 -> coachMenu();
                default -> System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid input, try again" + InputHelper.RESET);
            }
        }
    }

    public void chairmanMenu() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            Integer chairmanCodeInput = InputHelper.getIntInput("Enter password: ");

            int chairmanCode = 1;

            if (!chairmanCodeInput.equals(chairmanCode)) {
                System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid code, try again" + InputHelper.RESET);
            }

            System.out.println("\n1 - Register member");
            System.out.println("2 - View all members");
            System.out.println("0 - Exit");

            int input = InputHelper.getIntBoundedInput("", 0, 3);

            switch (input) {
                case 1 -> registerMember();
                case 2 -> viewAllMembers();
                case 0 -> {}
                default -> System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid input, try again" + InputHelper.RESET);
            }
        }
    }

    public void registerMember() {
        if (clubMembers.isEmpty()) {
            System.out.println("No members registered.");
        }

        String registerMemberInput = InputHelper.getStringInput("Would you like to register a member? ");

        if (registerMemberInput.equals("yes")) {
            Member member = new Member();
            Integer memberIDInput = InputHelper.getIntInput("Enter member ID: ");
            Integer nameInput = InputHelper.getIntInput("Enter name: ");
            Integer dateOfBirth = InputHelper.getIntInput("Enter date of birth (yy-mm-dd): ");
            Integer memberTypeInput = InputHelper.getIntInput("Enter member type: ");
            Integer swimmerTypeInput = InputHelper.getIntInput("Enter swimmer type: ");
            Integer teamIDInput = InputHelper.getIntInput("Enter team ID: ");
            Integer ageInput = InputHelper.getIntInput("Enter age: ");

            if (ageInput < 18) {
                Integer parentNumberInput = InputHelper.getIntInput("Enter parent's number: ");
                Integer parentNameInput = InputHelper.getIntInput("Enter parent's name: ");
            }
        } else {}
    }

    public void viewAllMembers() {
        if (clubMembers.isEmpty()) {
            System.out.println("No members found.");
        }

        System.out.println("\nList of all members:");
        for (Member member : clubMembers) {
            System.out.println(member);
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

    public List<Member> getMembers() {
        return clubMembers;
    }
}
