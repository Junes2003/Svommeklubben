package controller;

import models.TrainingResult;
import models.SwimDiscipline;
import models.Discipline;
import service.ResultService;
import java.util.List;

public class ResultController {
    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    public void addTrainingResult(int memberID, SwimDiscipline swimDiscipline, double time, String date) {
        resultService.addTrainingResult(memberID, swimDiscipline, time, date);
    }

    public void addCompetitionResult(int memberID, SwimDiscipline swimDiscipline, String event, int placement, double time) {
        resultService.addCompetitionResult(memberID, swimDiscipline, event, placement, time);
    }

    public List<TrainingResult> getTop5TrainingResults(SwimDiscipline swimDiscipline, Discipline memberDiscipline) {
        return resultService.getTop5TrainingResults(swimDiscipline, memberDiscipline);
    }
}
