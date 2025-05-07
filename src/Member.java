import java.time.LocalDateTime;

public class Member {

    private int memberID;
    private String name;
    private LocalDateTime dateOfBirth;
    private String memberType;
    private String swimmerType;
    private int ageGroup;
    private int teamID;
    private int parentsNumber;
    private String parentsName;

    public Member(String name, String memberType, String swimmerType, int memberID, int ageGroup, int teamId, LocalDateTime dateOfBirth, int parentsNumber, String parentsName) {
        this.ageGroup = ageGroup;
        this.dateOfBirth = LocalDateTime.parse(String.valueOf(dateOfBirth));
        this.memberID = memberID;
        this.swimmerType = String.valueOf(swimmerType);
        this.name = String.valueOf(name);
        this.memberType = memberType;
        this.teamID = teamID;
        this.parentsNumber = parentsNumber;
        this.parentsName = parentsName;

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

    public int getParentsNumber() {
        return parentsNumber;
    }

    public String getParentsName() {
        return parentsName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "ID=" + memberID +
                ", Name='" + name + '\'' +
                ", DOB=" + dateOfBirth +
                ", Type='" + memberType + '\'' +
                ", SwimmerType='" + swimmerType + '\'' +
                ", AgeGroup=" + ageGroup +
                ", TeamId=" + teamID +
                ", ParentsNumber=" + parentsNumber +
                ", ParentsName='" + parentsName + '\'' +
                '}';
    }
}

