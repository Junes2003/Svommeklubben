package models;

import java.time.LocalDate;

public class Member {
    private int memberID;
    private String name;
    private LocalDate dateOfBirth;
    private Discipline discipline;
    private Status status;
    private boolean isCompetitive;
    private int age;
    private int teamID;
    private String parentsNumber;
    private String parentsName;

    public Member(String name, Discipline discipline, Status status, boolean isCompetitive, int memberID, int age, int teamID,
                  LocalDate dateOfBirth, String parentsNumber, String parentsName) {
        this.name = name;
        this.discipline = discipline;
        this.status = status;
        this.isCompetitive = isCompetitive;
        this.memberID = memberID;
        this.age = age;
        this.teamID = teamID;
        this.dateOfBirth = dateOfBirth;
        this.parentsNumber = parentsNumber;
        this.parentsName = parentsName;
    }

    public Member() {}

    // Getters and setters
    public void setMemberID(int memberID) { this.memberID = memberID; }
    public void setParentsName(String parentsName) { this.parentsName = parentsName; }
    public void setParentsNumber(String parentsNumber) { this.parentsNumber = parentsNumber; }
    public void setTeamID(int teamID) { this.teamID = teamID; }
    public void setAge(int age) { this.age = age; }
    public void setStatus(Status status) { this.status = status; }
    public void setDiscipline(Discipline discipline) { this.discipline = discipline; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setName(String name) { this.name = name; }
    public void setCompetitive(boolean isCompetitive) { this.isCompetitive = isCompetitive; }

    public String getName() { return name; }
    public Discipline getDiscipline() { return discipline; }
    public int getMemberID() { return memberID; }
    public int getAge() { return age; }
    public int getTeamID() { return teamID; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public String getParentsNumber() { return parentsNumber; }
    public String getParentsName() { return parentsName; }
    public Status getStatus() { return status; }
    public boolean isCompetitive() { return isCompetitive; }

    @Override
    public String toString() {
        return String.format(
                "Member {\n" +
                        "  memberID     = %d\n" +
                        "  name         = '%s'\n" +
                        "  dateOfBirth  = %s\n" +
                        "  discipline   = %s\n" +
                        "  status       = %s\n" +
                        "  competitive  = %s\n" +
                        "  age          = %d\n" +
                        "  teamID       = %d\n" +
                        "  parentsNumber= '%s'\n" +
                        "  parentsName  = '%s'\n" +
                        "}", memberID, name, dateOfBirth, discipline, status, isCompetitive ? "Yes" : "No", age, teamID, parentsNumber, parentsName
        );
    }
}