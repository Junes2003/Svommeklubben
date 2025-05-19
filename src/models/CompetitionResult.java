package models;

public class CompetitionResult {
    private int memberID;
    private SwimDiscipline swimDiscipline;
    private String event;
    private int placement;
    private double time;

    public CompetitionResult(int memberID, SwimDiscipline swimDiscipline, String event, int placement, double time) {
        this.memberID = memberID;
        this.swimDiscipline = swimDiscipline;
        this.event = event;
        this.placement = placement;
        this.time = time;
    }

    public int getMemberID() { return memberID; }
    public SwimDiscipline getSwimDiscipline() { return swimDiscipline; }
    public String getEvent() { return event; }
    public int getPlacement() { return placement; }
    public double getTime() { return time; }

    @Override
    public String toString() {
        return String.format("CompetitionResult { memberID=%d, discipline=%s, event='%s', placement=%d, time=%.2f }",
                memberID, swimDiscipline, event, placement, time);
    }
}
