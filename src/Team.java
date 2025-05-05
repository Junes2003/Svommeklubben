public class Team {

    private int teamID;
    private int teamName;
    private int instructorID;
    private int instructorName;


    public int getTeamID() {
        return teamID;
    }

    public int getTeamName() {
        return teamName;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public int getInstructorName() {
        return instructorName;
    }

    public Team(int teamID, int teamName, int instructorID, int instructorName) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.instructorID = instructorID;
        this.instructorName = instructorName;
    }

    @Override
    public String toString() {
        return "Team{" + "teamID=" + teamID + ", teamName=" + teamName + ", instructorID=" + instructorID + ", instructorName=" + instructorName + '}';
    }
}



