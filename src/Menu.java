import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Member> clubMembers;

    public Menu (){
        clubMembers = new ArrayList<>();
    }

    public void chairmanMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Velkommen Hr. Formand. Indtast venligst kode:");
        String chairmanCodeInput = scan.nextLine();

        String chairmanCode = "Jegerformand";

        if (!chairmanCodeInput.equals(chairmanCode)) {
            System.out.println("Ugyldig kode, prøv igen");
            chairmanCodeInput = scan.nextLine();
        }

    }

    public List<Member> getMembers() { // Giver adgang til listen over pizzaer
        return clubMembers;
    }
}