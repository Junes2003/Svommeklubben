import java.util.ArrayList;
import java.util.List;

public class MemberController {

    private List<Member> allMembers;
    private List<Member> activeMembers;
    private List<Member> passiveMembers;

    public MemberController(){
        allMembers = new ArrayList<>();
        activeMembers = new ArrayList<>();
        passiveMembers = new ArrayList<>();

    }

    String allFiles = "src/Memberinfo.CSV";
    String activeFiles = "src/ActiveMembers.CSV";
    String passiveFiles = "src/Passive.CSV";

}
