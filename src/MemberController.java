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
    String allfile = "src/Memberinfo.CSV";
    String activeFile = "src/ActiveMembers.CSV";
    String passiveFile = "src/Passive.CSV";

}
