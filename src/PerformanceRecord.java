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




    //-trainingBestDate: LocalDate
    //-disciplineID: Integer
    //-memberID: Integer
    //recordID: Integer
    //-trainingBestTime: boolean
    //+ getRecordID(): Integer
    //+ getMemberID(): Integer
    //+getDisciplineID(): Integer
    //+ getTrainingBestTime(): boolean
    //+ getTrainingBestDate(): LocalDate





}
