package models;

public class Team {
    private int teamID;
    private String teamName; // JuniorTeam or SeniorTeam

    public Team(int teamID, String teamName) {
        this.teamID = teamID;
        this.teamName = teamName;
    }

    public int getTeamID() { return teamID; }
    public String getTeamName() { return teamName; }

    @Override
    public String toString() {
        return "Team { teamID=" + teamID + ", name='" + teamName + "' }";
    }
}