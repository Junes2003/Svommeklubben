import java.time.LocalDateTime;

public class Member {

    private int memberID;
    private String name;
    private LocalDateTime dateOfBirth;
    private String memberType;
    private String swimmerType;
    private int ageGroup;
    private int teamID;
    private String parentsNumber;
    private String parentsName;

    public Member(int memberID, String name, String birthDate, String memberType, String swimmerType,
                  int ageGroup, String parentsNumber, String parentsName) {
        this.memberID = memberID;
        this.name = name;
        this.memberType = memberType;
        this.swimmerType = swimmerType;
        this.ageGroup = ageGroup;
        this.parentsNumber = parentsNumber;
        this.parentsName = parentsName;
        this.dateOfBirth = LocalDateTime.parse(birthDate);
    }


    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public int getMemberID() {
        return memberID;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public int getTeamID() {
        return teamID;
    }

    public LocalDateTime getDateOfBirth() {
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
        return "Member{" +
                "memberID=" + memberID +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", memberType='" + memberType + '\'' +
                ", swimmerType='" + swimmerType + '\'' +
                ", ageGroup=" + ageGroup +
                ", teamID=" + teamID +
                ", parentsNumber=" + parentsNumber +
                ", parentsName='" + parentsName + '\'' +
                '}';
    }

}

