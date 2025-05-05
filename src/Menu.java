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

        System.out.println("1 - Chairman");
        System.out.println("2 - Accountant");
        System.out.println("3 - Coach");

        int menuInput = scan.nextInt();

        switch (menuInput) {
            case 1 -> chairmanMenu();
        }
    }

    public void chairmanMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Velkommen Hr. Formand. Indtast venligst kode:");
        String chairmanCodeInput = scan.nextLine();

        String chairmanCode = "Jegerformand";
        // der skal bruges et while loop et sted her
        if (chairmanCodeInput.equals(chairmanCode)) {
            System.out.println("Ugyldig kode, prøv igen");
        }

    }

    public List<Member> getMembers() {
        return clubMembers;
    }

    public void AccountantMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Velkommen Accountant. Indtast venligst kode:");
        String accountantCodeInput = scan.nextLine();

        String accountantCode = "Accountant";
        // der skal bruges et while loop et sted her
        if (accountantCodeInput.equals(accountantCode)) {
            System.out.println("Ugyldig kode, prøv igen");
        }

    }


}