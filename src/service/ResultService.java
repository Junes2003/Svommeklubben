package service;

import models.TrainingResult;
import models.CompetitionResult;
import models.SwimDiscipline;
import models.Member;
import models.Discipline;
import repository.ResultRepository;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ResultService {
    private final ResultRepository resultRepository;
    private final MemberService memberService;

    public ResultService(ResultRepository resultRepository, MemberService memberService) {
        this.resultRepository = resultRepository;
        this.memberService = memberService;
    }

    public void addTrainingResult(int memberID, SwimDiscipline swimDiscipline, double time, String date) {
        resultRepository.addTrainingResult(new TrainingResult(memberID, swimDiscipline, time, java.time.LocalDate.parse(date)));
    }

    public void addCompetitionResult(int memberID, SwimDiscipline swimDiscipline, String event, int placement, double time) {
        resultRepository.addCompetitionResult(new CompetitionResult(memberID, swimDiscipline, event, placement, time));
    }

    public List<TrainingResult> getTop5TrainingResults(SwimDiscipline swimDiscipline, Discipline memberDiscipline) {
        List<Member> members = memberService.getMembers().stream()
                .filter(m -> m.isCompetitive() && m.getDiscipline() == memberDiscipline)
                .toList();
        return resultRepository.getTrainingResults().stream()
                .filter(r -> r.getSwimDiscipline() == swimDiscipline && members.stream().anyMatch(m -> m.getMemberID() == r.getMemberID()))
                .sorted(Comparator.comparingDouble(TrainingResult::getTime))
                .limit(5)
                .toList();
    }
}