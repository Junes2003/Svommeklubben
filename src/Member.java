import java.time.LocalDate;
<<<<<<< HEAD
import java.time.LocalDateTime;
=======
>>>>>>> 9a3c5a35a3564a396f66f14fa811e906bfc01ca6

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

<<<<<<< HEAD
    public Member(int memberID, String name, LocalDate dateOfBirth, String memberType, String swimmerType,
                  int ageGroup, String parentsNumber, String parentsName , int teamID) {
=======
    public Member(int memberID, String name, LocalDate dateOfBirth, String memberType, String swimmerType, int teamID, int age, String parentsNumber, String parentsName) {
>>>>>>> 9a3c5a35a3564a396f66f14fa811e906bfc01ca6
        this.memberID = memberID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.memberType = memberType;
        this.swimmerType = swimmerType;
        this.age = age;
        this.teamID = teamID;
        this.parentsNumber = parentsNumber;
        this.parentsName = parentsName;
<<<<<<< HEAD
        this.dateOfBirth = dateOfBirth;
        this.teamID = teamID;
=======
>>>>>>> 9a3c5a35a3564a396f66f14fa811e906bfc01ca6
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

<<<<<<< HEAD
    public int getteamID() {
        return teamID;
=======
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
>>>>>>> 9a3c5a35a3564a396f66f14fa811e906bfc01ca6
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

