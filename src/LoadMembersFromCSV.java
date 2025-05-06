import java.util.List;

public void loadMembersFromCSV() {
    String filePath = "src/members.csv";
    List<Member> loadedMembers = MemberLoader.loadMembersFromCSV(filePath);
    clubMembers.clear();
    clubMembers.addAll(loadedMembers);
    System.out.println("Members loaded from CSV successfully.");
}
