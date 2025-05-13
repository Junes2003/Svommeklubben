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
        allMembers = MemberCSVLoader.loadMembersFromCSV("files/MemberInfo.csv");

        for (Member member : allMembers) {
            if (member.getSwimmerType().equalsIgnoreCase("Active")) {
                activeMembers.add(member);
            } else if (member.getSwimmerType().equalsIgnoreCase("Passive")) {
                passiveMembers.add(member);
            }
        }
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