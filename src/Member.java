import java.time.LocalDateTime;

public class Member {

   private int memberID;
   private String name;
   private LocalDateTime dateOfBirth;
   private String memberType;
   private String swimmerType;
   private int ageGroup;
   private int teamId;
   private int parentsNumber;
   private String parentsName;

    public Member (int name, String memberType, LocalDateTime swimmerType, String memberID, String ageGroup, int teamId, int dateOfBirth, int parentsNumber, String parentsName){
        this.ageGroup = ageGroup;
        this.dateOfBirth = dateOfBirth;
        this.memberID = memberID;
        this.swimmerType = swimmerType;
        this.name = name;
        this.memberType = memberType;
        this.teamId = teamId;
        this.parentsNumber = parentsNumber;
        this.parentsName = parentsName;

    }


    public String getName(){
        return name;
    }

    public String getMemberType(){
        return memberType;
    }

    public int getMemberID(){
        return memberID;
    }

    public int getAgeGroup(){
        return ageGroup;
    }

    public int getTeamId(){
        return teamId;
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
        return "Member{" + "memberID=" + memberID + ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", memberType='" + memberType + '\'' +
                ", swimmerType='" + swimmerType + '\'' +
                ", ageGroup=" + ageGroup +
                ", teamId=" + teamId +
                ", parentsNumber=" + parentsNumber +
                ", parentsName='" + parentsName + '\'' +
                '}';
    }
}

