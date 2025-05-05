import java.time.LocalDateTime;

public class Member {

   private int memberID;
   private String name;
   private LocalDateTime dateOfBirth;
   private String memberType;
   private String swimmerType;
   private int ageGroup;
   private int teamId;


    public void member (String name , String memberType , String swimmerType , int memberID , int ageGroup , int teamId , LocalDateTime dateOfBirth){
        this.name=name;
        this.ageGroup=ageGroup;
        this.dateOfBirth=dateOfBirth;
        this.memberID=memberID;
        this.swimmerType=swimmerType;
        this.name=name;
        this.memberType=memberType;
        this.teamId=teamId;

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

    @Override
    public String toString() {
        return "Member{" + "memberID=" + memberID + ", name='" + name + '\'' + ", dateOfBirth=" + dateOfBirth + ", memberType='" + memberType + '\'' + ", swimmerType='" + swimmerType + '\'' + ", ageGroup=" + ageGroup + ", teamId=" + teamId + '}';
    }
}
