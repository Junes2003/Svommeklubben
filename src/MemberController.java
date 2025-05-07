import java.util.ArrayList;
import java.util.List;

public class MemberController {

    private List<Member> allMembers;
    private List<Member> activeMembers;
    private List<Member> passiveMembers;

    public MemberController() {
        allMembers = new ArrayList<>();
        activeMembers = new ArrayList<>();
        passiveMembers = new ArrayList<>();
    }

    public void loadAllMembers() {
        String allFile = "src/MemberInfo.csv";
        String activeFile = "src/ActiveMembers.csv";
        String passiveFile = "src/PassiveMembers.csv";

        allMembers = MemberCSVLoader.loadMembersFromCSV(allFile);
        activeMembers = MemberCSVLoader.loadMembersFromCSV(activeFile);
        passiveMembers = MemberCSVLoader.loadMembersFromCSV(passiveFile);

        System.out.println("All members loaded: " + allMembers.size());
        System.out.println("Active members loaded: " + activeMembers.size());
        System.out.println("Passive members loaded: " + passiveMembers.size());
    }

    public List<Member> getAllMembers() {
        return allMembers;
    }

    public List<Member> getActiveMembers() {
        return activeMembers;
    }

    public List<Member> getPassiveMembers() {
        return passiveMembers;
    }
}
