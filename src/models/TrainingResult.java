package models;



import java.time.LocalDate;

public class TrainingResult {
    private int memberID;
    private SwimDiscipline swimDiscipline;
    private double time;
    private LocalDate date;

    public TrainingResult(int memberID, SwimDiscipline swimDiscipline, double time, LocalDate date) {
        this.memberID = memberID;
        this.swimDiscipline = swimDiscipline;
        this.time = time;
        this.date = date;
    }

    public int getMemberID() { return memberID; }
    public SwimDiscipline getSwimDiscipline() { return swimDiscipline; }
    public double getTime() { return time; }
    public LocalDate getDate() { return date; }

    @Override
    public String toString() {
        return String.format("TrainingResult { memberID=%d, discipline=%s, time=%.2f, date=%s }",
                memberID, swimDiscipline, time, date);
    }
}
