import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Member> clubMembers;
//    private List<Team> teams;
//    private List<PerformanceRecord> performanceRecords;
//    private List<Membership> memberships;

    public Menu() {
        // Ret stien så den peger på src/MemberInfo.csv
        clubMembers = MemberCSVLoader.loadMembersFromCSV("files/MemberInfo.csv");
//        teams = new ArrayList<>();
//        performanceRecords = new ArrayList<>();
//        memberships = new ArrayList<>();
    }

    public void initializeMenu() {
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1 - Chairman");
            System.out.println("2 - Accountant");
            System.out.println("3 - Coach");
            System.out.println("0 - Exit");

            int input = InputHelper.getIntBoundedInput("Choice: ", 0, 4); // Input mellem 0 og 1

            switch (input) {
                case 1 -> chairmanMenu();  // Kalder chairmanMenu()
                case 2 -> accountantMenu();
                case 3 -> coachMenu();
                case 0 -> System.exit(0);  // Afslutter programmet
                default -> System.out.println("Invalid input! Try again.");
            }
        }
    }

    public void chairmanMenu() {
        Scanner scan = new Scanner(System.in);

        // Giv en besked og vent på korrekt input
        while (true) {
            // Bed brugeren om at indtaste koden
            System.out.print("Enter password: ");
            String chairmanCodeInput = scan.nextLine();

            // Den korrekte kode
            String chairmanCode = "1";

            // Tjek om input er korrekt
            if (chairmanCodeInput != null && chairmanCodeInput.equals(chairmanCode)) {
                // Koden er korrekt, bryd ud af løkken
                break;
            } else {
                // Hvis koden er forkert, vis en fejlbesked
                System.out.println("Invalid code, try again.");
            }
        }

        // Efter at have indtastet den korrekte kode, vis menuen
        while (true) {
            System.out.println("\n1 - Register member");
            System.out.println("2 - View all members");
            System.out.println("3 - View active members");
            System.out.println("4 - View passive members");
            System.out.println("0 - Exit");

            // Få input til menuen
            int input = InputHelper.getIntBoundedInput("Choice: ", 0, 4);

            switch (input) {
                case 1 -> registerMember();  // Funktion til at registrere medlem
                case 2 -> viewAllMembers();  // Funktion til at se alle medlemmer
                case 3 -> viewActiveMembers();  // Funktion til at se aktive medlemmer
                case 4 -> viewPassiveMembers();  // Funktion til at se passive medlemmer
                case 0 -> {
                    System.out.println("Exiting...");
                    return;  // Stopper menuen og går tilbage til hovedmenuen
                }
                default -> System.out.println("Invalid input! Try again.");
            }
        }
    }

    public void registerMember() {
        if (clubMembers.isEmpty()) {
            System.out.println("No members registered.");
        }

        String registerMemberInput = InputHelper.getStringInput("Would you like to register a member? ");

        if (registerMemberInput.equalsIgnoreCase("yes")) {
            Member member = new Member();
            int memberIDInput = InputHelper.getIntInput("Enter member ID: ");
            String nameInput = InputHelper.getStringInput("Enter name: ");
            String dateOfBirthInput = InputHelper.getStringInput("Enter date of birth (yyyy,MM,dd): ");
            int memberTypeInput = InputHelper.getIntInput("Enter member type (1 for Active, 2 for Passive): ");
            int swimmerTypeInput = InputHelper.getIntInput("Enter swimmer type: ");
            int teamIDInput = InputHelper.getIntInput("Enter team ID: ");
            int ageInput = InputHelper.getIntInput("Enter age: ");

            // Hvis medlemmet er under 18 år, skal der også indtastes forældres oplysninger
            if (ageInput < 18) {
                String parentNumberInput = InputHelper.getStringInput("Enter parent's number: ");
                String parentNameInput = InputHelper.getStringInput("Enter parent's name: ");
                member.setParentsNumber(parentNumberInput);
                member.setParentsName(parentNameInput);
            }

            member.setMemberID(memberIDInput);
            member.setName(nameInput);
            member.setDateOfBirth(LocalDate.parse(dateOfBirthInput));
            member.setMemberType(memberTypeInput == 1 ? "Active" : "Passive");
            member.setSwimmerType(String.valueOf(swimmerTypeInput));
            member.setTeamID(teamIDInput);
            member.setAge(ageInput);

            clubMembers.add(member);  // Tilføj medlemmet til listen

            System.out.println("Member registered successfully!");
        }
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

    public void viewActiveMembers() {
        System.out.println("\nActive members:");
        for (Member member : clubMembers) {
            if (member.getMemberType().equals("Active")) {
                System.out.println(member);
            }
        }
    }

    public void viewPassiveMembers() {
        System.out.println("\nPassive members:");
        for (Member member : clubMembers) {
            if (member.getMemberType().equals("Passive")) {
                System.out.println(member);
            }
        }
    }

    public void accountantMenu() {
        Scanner scan = new Scanner(System.in);

        // Giv en besked og vent på korrekt input
        while (true) {
            // Bed brugeren om at indtaste koden
            System.out.print("Enter password: ");
            String accountantCodeInput = scan.nextLine();

            // Den korrekte kode
            String accountantCode = "2";
            
            // Tjek om input er korrekt
            if (accountantCodeInput != null && accountantCodeInput.equals(accountantCode)) {
                // er koden korrekt, bryd ud af løkken
                break;
            } else {
                // Hvis koden er forkert, vis en fejlbesked
                System.out.println("Invalid code, try again.");
            }
        }

        // Efter at have indtastet den korrekte kode, vis menuen
        while (true) {
            System.out.println("\n1 - Create membership");
            System.out.println("\n2 - View memberships");
            System.out.println("\n3 - View members with outstanding payment");
            System.out.println("0 - Exit");

            // Få input til menuen
            int input = InputHelper.getIntBoundedInput("Choice: ", 0, 4);

            switch (input) {
                case 1 -> createMembership();
                case 2 -> viewMemberships();
                case 3 -> viewMembersWithOutstandingPayment();
                case 0 -> {}
                default -> System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid input, try again" + InputHelper.RESET);
            }
        }
    }

    public void createMembership() {}
    // TODO: færdiggør metoden

    public void viewMemberships() {}
    // TODO: færdiggør metoden

    public void viewMembersWithOutstandingPayment() {
        // TODO: færdiggør metoden
//        System.out.println("Membership with outstanding payment:");
//        for (Membership membership : ) {
//            System.out.println(membership.getName());
//
//        }
    }


    public void coachMenu() {
        Scanner scan = new Scanner(System.in);

        // Giv en besked og vent på korrekt input
        while (true) {
            // Bed brugeren om at indtaste koden
            System.out.print("Enter password: ");
            String coachCodeInput = scan.nextLine();

            // Den korrekte kode
            String coachCode = "3";

            // Tjek om input er korrekt
            if (coachCodeInput != null && coachCodeInput.equals(coachCode)) {
                // er koden korrekt, bryd ud af løkken
                break;
            } else {
                // Hvis koden er forkert, vis en fejlbesked
                System.out.println("Invalid code, try again.");
            }
        }

        // Efter at have indtastet den korrekte kode, vis menuen
        while (true) {
            System.out.println("\n1 - View stats");

            // Få input til menuen
            int input = InputHelper.getIntBoundedInput("Choice: ", 0, 1);

            switch (input) {
                case 1 -> viewStats();
                case 0 -> {}
                default -> System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid input, try again" + InputHelper.RESET);
            }
        }
    }

    public void viewStats() {}

    public List<Member> getMembers() {
        return clubMembers;
    }
}