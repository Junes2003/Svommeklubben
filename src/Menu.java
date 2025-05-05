import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Member> clubMembers;

    public Menu (){
        clubMembers = new ArrayList<>();
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

    public List<Member> getMembers() { // Giver adgang til listen over pizzaer
        return clubMembers;
    }


}