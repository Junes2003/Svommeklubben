<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class MemberController {

    private List<Member> allMembers;
    private List<Member> activeMembers;
    private List<Member> passiveMembers;
    private List<Member> competitiveSwimmers;

    public MemberController() {
        allMembers = new ArrayList<>();
        activeMembers = new ArrayList<>();
        passiveMembers = new ArrayList<>();
        competitiveSwimmers = new ArrayList<>();
    }

    public void loadAllMembers() {
        String allFile = "../files/MemberInfo.csv";
        String activeFile = "../files/ActiveMembers.csv";
        String passiveFile = "../files/PassiveMembers.csv";
        String competitiveFile = "../files/competitiveSwimmers.csv";

=======
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
>>>>>>> 9a3c5a35a3564a396f66f14fa811e906bfc01ca6
//        allMembers = MemberCSVLoader.loadMembersFromCSV(allFile);
//        activeMembers = MemberCSVLoader.loadMembersFromCSV(activeFile);
//        passiveMembers = MemberCSVLoader.loadMembersFromCSV(passiveFile);
//        competitiveSwimmers = MemberCSVLoader.loadMembersFromCSV(competitiveFile);
<<<<<<< HEAD

        MemberCSVLoader loader = new MemberCSVLoader(allFile);
        loader.getAllMembers();

        System.out.println("All members loaded: " + allMembers.size());
        System.out.println("Active members loaded: " + activeMembers.size());
        System.out.println("Passive members loaded: " + passiveMembers.size());
        System.out.println("Competitive swimmers loaded: " + competitiveSwimmers.size());
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

    public List<Member> getcompetitiveSwimmers(){
        return competitiveSwimmers;
    }
}
=======
//
//        System.out.println("All members loaded: " + allMembers.size());
//        System.out.println("Active members loaded: " + activeMembers.size());
//        System.out.println("Passive members loaded: " + passiveMembers.size());
//        System.out.println("Competitive swimmers loaded: " + competitiveSwimmers.size());
//    }
//
//    public List<Member> getAllMembers() {
//        return allMembers;
//    }
//
//    public List<Member> getActiveMembers() {
//        return activeMembers;
//    }
//
//    public List<Member> getPassiveMembers() {
//        return passiveMembers;
//    }
//
//    public List<Member> getCompetitiveSwimmers(){
//        return competitiveSwimmers;
//    }
//}
>>>>>>> 9a3c5a35a3564a396f66f14fa811e906bfc01ca6
