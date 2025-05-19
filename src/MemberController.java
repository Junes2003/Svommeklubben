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

//import java.util.ArrayList;
//import java.util.List;
//
//public class MemberController {
//
//    private List<Member> allMembers;
//    private List<Member> activeMembers;
//    private List<Member> passiveMembers;
//    private List<Member> competitiveSwimmers;
//
//    public MemberController() {
//        allMembers = new ArrayList<>();
//        activeMembers = new ArrayList<>();
//        passiveMembers = new ArrayList<>();
//        competitiveSwimmers = new ArrayList<>();
//    }
//
//    public void loadAllMembers() {
//        String allFile = "files/MemberInfo.csv";
//        String activeFile = "files/ActiveMembers.csv";
//        String passiveFile = "files/PassiveMembers.csv";
//        String competitiveFile = "files/competitiveSwimmers.csv";
//
//        allMembers = MemberCSVLoader.loadMembersFromCSV(allFile);
//        activeMembers = MemberCSVLoader.loadMembersFromCSV(activeFile);
//        passiveMembers = MemberCSVLoader.loadMembersFromCSV(passiveFile);
//        competitiveSwimmers = MemberCSVLoader.loadMembersFromCSV(competitiveFile);


//        MemberCSVLoader loader = new MemberCSVLoader(allFile);
//        loader.getAllMembers();

        System.out.println("All members loaded: " + allMembers.size());
        System.out.println("Active members loaded: " + activeMembers.size());
        System.out.println("Passive members loaded: " + passiveMembers.size());
//        System.out.println("Competitive swimmers loaded: " + competitiveSwimmers.size());

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
