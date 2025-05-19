package repository;

import models.TrainingResult;
import models.CompetitionResult;
import models.SwimDiscipline;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ResultRepository {
    private final CSVHandler csvHandler;
    private final String trainingFile = "files/TrainingResults.csv";
    private final String competitionFile = "files/CompetitionResults.csv";

    public ResultRepository(CSVHandler csvHandler) {
        this.csvHandler = csvHandler;
    }

    public List<TrainingResult> getTrainingResults() {
        List<String> lines = csvHandler.readFile(trainingFile);
        List<TrainingResult> results = new ArrayList<>();
        for (String line : lines) {
            String[] data = line.split(",");
            try {
                int memberID = Integer.parseInt(data[0]);
                SwimDiscipline swimDiscipline = SwimDiscipline.valueOf(data[1].toUpperCase());
                double time = Double.parseDouble(data[2]);
                LocalDate date = LocalDate.parse(data[3]);
                results.add(new TrainingResult(memberID, swimDiscipline, time, date));
            } catch (Exception e) {
                System.err.println("Error parsing training result: " + line + " (" + e.getMessage() + ")");
            }
        }
        return results;
    }

    public List<CompetitionResult> getCompetitionResults() {
        List<String> lines = csvHandler.readFile(competitionFile);
        List<CompetitionResult> results = new ArrayList<>();
        for (String line : lines) {
            String[] data = line.split(",");
            try {
                int memberID = Integer.parseInt(data[0]);
                SwimDiscipline swimDiscipline = SwimDiscipline.valueOf(data[1].toUpperCase());
                String event = data[2];
                int placement = Integer.parseInt(data[3]);
                double time = Double.parseDouble(data[4]);
                results.add(new CompetitionResult(memberID, swimDiscipline, event, placement, time));
            } catch (Exception e) {
                System.err.println("Error parsing competition result: " + line + " (" + e.getMessage() + ")");
            }
        }
        return results;
    }

    public void addTrainingResult(TrainingResult result) {
        csvHandler.appendToFile(trainingFile, toCSV(result));
    }

    public void addCompetitionResult(CompetitionResult result) {
        csvHandler.appendToFile(competitionFile, toCSV(result));
    }

    private String toCSV(TrainingResult result) {
        return String.format("%d,%s,%.2f,%s",
                result.getMemberID(), result.getSwimDiscipline(), result.getTime(), result.getDate());
    }

    private String toCSV(CompetitionResult result) {
        return String.format("%d,%s,%s,%d,%.2f",
                result.getMemberID(), result.getSwimDiscipline(), result.getEvent(), result.getPlacement(), result.getTime());
    }
}
