import java.time.LocalDateTime;

public class PerformanceRecord {

    private int memberID;
    private int recordID;
    private int disciplineID;
    private String trainingBestDate;
    private String trainingBestTime;

    public PerformanceRecord(int memberID, int recordID, int disciplineID, String trainingBestDate, String trainingBestTime) {
        this.memberID = memberID;
        this.recordID = recordID;
        this.disciplineID = disciplineID;
        this.trainingBestDate = trainingBestDate;
        this.trainingBestTime = trainingBestTime;
    }

public String getTrainingBestTime(){
    return trainingBestTime;
}

public int getMemberID(){
    return memberID;
}

public int getRecordID(){
    return recordID;
}

public int getDiciplineID(){
    return disciplineID;

}

public LocalDateTime getTrainingBestDate(){
    return trainingBestDate;
}
@Override
public String toString() {
    return "PerformanceRecord{" + "memberID=" + memberID + ", recordID=" + recordID + ", diciplineID=" + diciplineID + ", trainingBestDate=" + trainingBestDate + ", trainingBestTime='" + trainingBestTime + '\'' + '}';
}

}










