import java.time.LocalDateTime;

public class PerformanceRecord {

    private int memberID;
    private int recordID;
    private int diciplineID;
    private LocalDateTime trainingBestDate;
    private String trainingBestTime;

    public PerformanceRecord(int memberID , int recordID , int diciplineID , LocalDateTime trainingBestDate , String trainingBestTime ){
        this.memberID=memberID;
        this.diciplineID=diciplineID;
        this.recordID=recordID;
        this.trainingBestDate=trainingBestDate;
        this.trainingBestTime=trainingBestTime;

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
        return diciplineID;

    }

    public LocalDateTime getTrainingBestDate(){
        return trainingBestDate;

    }
    @Override
    public String toString() {
        return "PerformanceRecord{" + "memberID=" + memberID + ", recordID=" + recordID + ", diciplineID=" + diciplineID + ", trainingBestDate=" + trainingBestDate + ", trainingBestTime='" + trainingBestTime + '\'' + '}';
    }

}

