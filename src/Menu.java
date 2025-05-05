import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Member> clubMembers;

    public Menu (){
        clubMembers = new ArrayList<>();
    }

    public void initializeSystem() {
        System.out.println("");
    }

    public List<Member> getMembers() { // Giver adgang til listen over pizzaer
        return clubMembers;
    }
}