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
        }
    }

    public void chairmanMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter password:");
        String chairmanCodeInput = scan.nextLine();

        String chairmanCode = "Jegerformand";
        // der skal bruges et while loop et sted her

        if (!chairmanCodeInput.equals(chairmanCode)) {
            System.out.println(InputHelper.RED + InputHelper.BOLD + "Invalid code, try again" + InputHelper.RESET);
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
            System.out.println("صباح الخير, Træner");
        }

    }

    public List<Member> getMembers() {
        return clubMembers;
    }

}