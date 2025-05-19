package controller;

import models.Member;
import models.Membership;
import models.Discipline;
import models.Status;
import service.MemberService;
import java.util.ArrayList;
import java.util.List;

public class MemberController {
    private final MemberService memberService;
    private List<Member> allMembers;
    private List<Member> activeMembers;
    private List<Member> passiveMembers;
    private List<Membership> memberships;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
        allMembers = new ArrayList<>();
        activeMembers = new ArrayList<>();
        passiveMembers = new ArrayList<>();
        memberships = new ArrayList<>();
    }

    public void loadAllMembers() {
        allMembers = memberService.getMembers();

        for (Member member : allMembers) {
            if (member.getStatus() == Status.ACTIVE) {
                activeMembers.add(member);
            } else if (member.getStatus() == Status.PASSIVE) {
                passiveMembers.add(member);
            }
            Membership membership = new Membership(
                    member.getName(), member.getDiscipline(), member.getStatus(), member.isCompetitive(),
                    member.getMemberID(), member.getAge(), member.getTeamID(),
                    member.getDateOfBirth(), member.getParentsNumber(), member.getParentsName(),
                    member.getDiscipline().toString(), calculateMembershipPrice(member)
            );
            memberships.add(membership);
        }
    }

    private double calculateMembershipPrice(Member member) {
        if (member.getStatus() == Status.PASSIVE) {
            return 500.0;
        }
        if (member.getAge() >= 60) {
            return 1600.0 * 0.75; // 25% rabat
        }
        if (member.getAge() < 18) {
            return 1000.0;
        }
        return 1600.0;
    }

    public List<Member> getAllMembers() { return allMembers; }
    public List<Member> getActiveMembers() { return activeMembers; }
    public List<Member> getPassiveMembers() { return passiveMembers; }
    public List<Membership> getMemberships() { return memberships; }

    public void addMember(Member member) {
        memberService.addMember(
                member.getName(), member.getDiscipline(), member.getStatus(), member.isCompetitive(),
                member.getMemberID(), member.getAge(), member.getTeamID(),
                member.getDateOfBirth(), member.getParentsNumber(), member.getParentsName()
        );
        allMembers.add(member);
        if (member.getStatus() == Status.ACTIVE) {
            activeMembers.add(member);
        } else {
            passiveMembers.add(member);
        }
        Membership membership = new Membership(
                member.getName(), member.getDiscipline(), member.getStatus(), member.isCompetitive(),
                member.getMemberID(), member.getAge(), member.getTeamID(),
                member.getDateOfBirth(), member.getParentsNumber(), member.getParentsName(),
                member.getDiscipline().toString(), calculateMembershipPrice(member)
        );
        memberships.add(membership);
    }
}