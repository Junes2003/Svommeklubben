import java.time.LocalDateTime;

public class Member {

    private int memberID;
    private String name;
    private int dateOfBirth;
    private String memberType;
    private String swimmerType;
    private int ageGroup;
    private int teamId;
    private int parentsNumber;
    private String parentsName;

    public Member(int name, String memberType, LocalDateTime swimmerType, String memberID, String ageGroup, int teamId, int dateOfBirth, int parentsNumber, String parentsName) {
        this.ageGroup = Integer.parseInt(ageGroup);
        this.dateOfBirth = dateOfBirth;
        this.memberID = Integer.parseInt(memberID);
        this.swimmerType = String.valueOf(swimmerType);
        this.name = String.valueOf(name);
        this.memberType = memberType;
        this.teamId = teamId;
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

    public int getTeamId() {
        return teamId;
    }

    public int getDateOfBirth() {
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
                ", TeamId=" + teamId +
                ", ParentsNumber=" + parentsNumber +
                ", ParentsName='" + parentsName + '\'' +
                '}';
    }
}

