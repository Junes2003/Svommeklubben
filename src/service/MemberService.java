package service;

import models.Member;
import models.Discipline;
import models.Status;
import repository.MemberRepository;
import java.time.LocalDate;
import java.util.List;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void addMember(String name, Discipline discipline, Status status, boolean isCompetitive, int memberID, int age, int teamID,
                          LocalDate dateOfBirth, String parentsNumber, String parentsName) {
        Member member = new Member(name, discipline, status, isCompetitive, memberID, age, teamID, dateOfBirth, parentsNumber, parentsName);
        memberRepository.addMember(member);
    }

    public List<Member> getMembers() {
        return memberRepository.getMembers();
    }
}