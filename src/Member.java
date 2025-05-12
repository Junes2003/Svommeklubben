import java.time.LocalDate;

public class Member {

    private int memberID;
    private String name;
    private LocalDate dateOfBirth;
    private String memberType;
    private String swimmerType;
    private int age;
    private int teamID;
    private String parentsNumber;
    private String parentsName;

    public Member(int memberID, String name, LocalDate dateOfBirth, String memberType, String swimmerType, int teamID, int age, String parentsNumber, String parentsName) {
        this.memberID = memberID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.memberType = memberType;
        this.swimmerType = swimmerType;
        this.age = age;
        this.teamID = teamID;
        this.parentsNumber = parentsNumber;
        this.parentsName = parentsName;
    }

    public Member(int memberID, String name, LocalDate dateOfBirth, String memberType, String swimmerType, int teamID, int age) {
        this.memberID = memberID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.memberType = memberType;
        this.swimmerType = swimmerType;
        this.age = age;
        this.teamID = teamID;
    }

    public Member() {}

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public int getMemberID() {
        return memberID;
    }

    public int getAge() {
        return age;
    }

    public int getTeamID() {
        return teamID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getParentsNumber() {
        return parentsNumber;
    }

    public String getParentsName() {
        return parentsName;
    }

    public String getSwimmerType() {
        return swimmerType;
    }

    @Override
    public String toString() {
        // TODO: lav tabel layout
        return "Member" +
                "memberID=" + memberID +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", memberType='" + memberType + '\'' +
                ", swimmerType='" + swimmerType + '\'' +
                ", ageGroup=" + age +
                ", teamID=" + teamID +
                ", parentsNumber=" + parentsNumber +
                ", parentsName='" + parentsName + '\'' +
                '}';
    }

}

