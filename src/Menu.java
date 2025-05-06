import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Member> clubMembers;
    private List<Team> teams;
    private List<PerformanceRecord> performanceRecords;
    private List<Membership> memberships;

    public Menu (){
        clubMembers = new ArrayList<>();
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

        switch (menuInput) {
            case 1 -> chairmanMenu();
            case 2 -> accountantMenu();
            case 3 -> coachMenu();
            default -> System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid input, try again" + InputHelper.RESET);

        }
    }

    public void chairmanMenu() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter password:");
            String chairmanCodeInput = scan.nextLine();

            String chairmanCode = "Jegerformand";
            // der skal bruges et while loop et sted her

            if (!chairmanCodeInput.equals(chairmanCode)) {
                System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid code, try again" + InputHelper.RESET);
           } else {
                System.out.println("مرحبا بك, Chairman");
                System.out.println("\n1 - Register member");
                System.out.println("2 - View all members");
                System.out.println("3 - View active members");
                System.out.println("4 - View passive members");
                System.out.println("5 - Remove member");
                System.out.println("0 - Exit");

            }



            // IKKE SLET, VI SKAL BRUGE DET OM LIDT
            int chairmanMenuInput = scan.nextInt();
            switch (chairmanMenuInput) {
               case 1 -> registerMember();
               case 2 -> reviewAllMembers();
               case 3 -> reviewActiveMembers();
               case 4 -> reviewPassiveMembers();
                case 5 -> removeMember();
                case 0 -> {}
                default -> System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid input! Try again" + InputHelper.BOLD + InputHelper.RESET); // Fejlmeddelelse for ugyldigt input
            }
        }
    }



    public void accountantMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter code: ");
        String accountantCodeInput = scan.nextLine();

        String accountantCode = "Jegerkasserer";
        // der skal bruges et while loop et sted her
        if (!accountantCodeInput.equals(accountantCode)) {
            System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid code, try again!" + InputHelper.RESET);
        } else {
           System.out.println("مرحبا بك, Accountant");
           System.out.println("\n1 - Register membership");
           System.out.println("2 - View membership fee");
           System.out.println("3 - View expected paid membership");
           System.out.println("4 - View members in arrears");
           System.out.println("0 - Exit");

            int chairmanMenuInput = scan.nextInt();
            switch (chairmanMenuInput) {
//                case 1 -> registerMembership();
//                case 2 -> viewMembershipFee();
//                case 3 -> viewExpectedPaidMembership();
//                case 4 -> viewMembersInOutstandingPayment();
//                case 0 -> {}
//                default -> System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid input! Try again" + InputHelper.BOLD + InputHelper.RESET); // Fejlmeddelelse for ugyldigt input
            }
        }
    }

    public void coachMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter code: ");
        String coachCodeInput = scan.nextLine();

        String coachCode = "Jegertræner";
        // der skal bruges et while loop et sted her
        if (!coachCodeInput.equals(coachCode)) {
            System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid code, try again!" + InputHelper.RESET);
        } else {
            System.out.println("مرحبا بك, Coach");
            System.out.println("\n1 - View Stats");
            System.out.println("2 - View Teams");
            System.out.println("0 - Exit");

//            case 1 -> ViewStats();
//            case 2 -> viewTeams();
//            case 0 -> {}
//            default -> System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid input! Try again" + InputHelper.BOLD + InputHelper.RESET); // Fejlmeddelelse for ugyldigt input
        }


    }

    public List<Member> getMembers() {
        return clubMembers;
    }

}