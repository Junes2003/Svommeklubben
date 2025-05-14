import java.time.LocalDate;
import java.time.LocalDateTime;

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

    public Member(String name, String memberType, String swimmerType, int memberID, int age, int teamID, LocalDate dateOfBirth, String parentsNumber, String parentsName) {
    public Member(int memberID, String name, LocalDate dateOfBirth, String memberType, String swimmerType,
        int ageGroup, String parentsNumber, String parentsName, int teamID) {
        }

    public Member(int memberID, String name, LocalDate dateOfBirth, String memberType, String swimmerType, int teamID, int age, String parentsNumber, String parentsName) {
            this.memberID = memberID;
            this.name = name;
            this.memberType = memberType;
            this.swimmerType = swimmerType;
            this.memberID = memberID;
            this.age = age;
            this.teamID = teamID;
            this.dateOfBirth = dateOfBirth;
            this.parentsNumber = parentsNumber;
            this.parentsName = parentsName;

            this.dateOfBirth = dateOfBirth;
            this.teamID = teamID;
        }

    public Member(int memberID, String name, LocalDate dateOfBirth, String memberType, String swimmerType, int age, int teamID) {
            this.memberID = memberID;
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.memberType = memberType;
            this.swimmerType = swimmerType;
            this.age = age;
            this.teamID = teamID;
        }

    public Member() {
        }

        public void setMemberID(int memberID) {
            this.memberID = memberID;
        }

        public void setParentsName(String parentsName) {
            this.parentsName = parentsName;
        }

        public void setParentsNumber(String parentsNumber) {
            this.parentsNumber = parentsNumber;
        }

        public void setTeamID(int teamID) {
            this.teamID = teamID;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSwimmerType(String swimmerType) {
            this.swimmerType = swimmerType;
        }

        public void setMemberType(String memberType) {
            this.memberType = memberType;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public void setName(String name) {
            this.name = name;
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
                            "  age          = %d\n" +
                            "  teamID       = %d\n" +
                            "  parentsNumber= %s\n" +
                            "  parentsName  = '%s'\n" +
                    "}", memberID, name, dateOfBirth, memberType, swimmerType, age, teamID, parentsNumber, parentsName
                            "}",
                    memberID, name, dateOfBirth, memberType, swimmerType,
                    age, teamID, parentsNumber, parentsName
            );
        }

    public Member() {
    }

    public Member() {
    }