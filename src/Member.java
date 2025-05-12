import java.time.LocalDate;
import java.time.LocalDateTime;

public class Member {

    private int memberID;
    private String name;
    private LocalDate dateOfBirth;
    private String memberType;
    private String swimmerType;
    private int ageGroup;
    private int teamID;
    private String parentsNumber;
    private String parentsName;

    public Member(int memberID, String name, LocalDate dateOfBirth, String memberType, String swimmerType,
                  int ageGroup, String parentsNumber, String parentsName , int teamID) {
        this.memberID = memberID;
        this.name = name;
        this.memberType = memberType;
        this.swimmerType = swimmerType;
        this.ageGroup = ageGroup;
        this.parentsNumber = parentsNumber;
        this.parentsName = parentsName;
        this.dateOfBirth = dateOfBirth;
        this.teamID = teamID;
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

    public int getteamID() {
        return teamID;
    }


    @Override
    public String toString() {
        return String.format(
                "Member {\n" +
                        "  memberID     = %d\n" +
                        "  name         = '%s'\n" +
                        "  dateOfBirth  = %s\n" +
                        "  memberType   = '%s'\n" +
                        "  swimmerType  = '%s'\n" +
                        "  ageGroup     = %s\n" +
                        "  teamID       = %s\n" +
                        "  parentsNumber= %s\n" +
                        "  parentsName  = '%s'\n" +
                        "}",
                memberID, name, dateOfBirth, memberType, swimmerType,
                ageGroup, teamID, parentsNumber, parentsName
        );
    }
}

