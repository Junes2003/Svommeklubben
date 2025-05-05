import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Member> clubMembers;

    public Menu (){
        clubMembers = new ArrayList<>();
    }

    public void initializeMenu() {
        System.out.println("1 - Formand");
        System.out.println("2 - Kasserer");
        System.out.println("3 - Træner");
    }

    public void chairmanMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Velkommen Hr. Formand. Indtast venligst kode:");
        int chairmanCodeInput = scan.nextInt();

        String chairmanCode = "Jegerformand";

        if () {
            System.out.println("Ugyldig kode, prøv igen");
        }

    }

    public List<Member> getMembers() { // Giver adgang til listen over pizzaer
        return clubMembers;
    }


}