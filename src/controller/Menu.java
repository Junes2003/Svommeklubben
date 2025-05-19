package controller;

import models.Member;
import models.Membership;
import models.Discipline;
import models.Status;
import models.SwimDiscipline;
import models.TrainingResult;
import repository.CSVHandler;
import repository.MemberRepository;
import repository.ResultRepository;
import service.MemberService;
import service.ResultService;
import java.time.LocalDate;
import java.util.List;

public class Menu {
    private final MemberController memberController;
    private final ResultController resultController;
    private final UserInterface ui;

    public Menu() {
        CSVHandler csvHandler = new CSVHandler();
        MemberRepository memberRepository = new MemberRepository(csvHandler);
        ResultRepository resultRepository = new ResultRepository(csvHandler);
        MemberService memberService = new MemberService(memberRepository);
        ResultService resultService = new ResultService(resultRepository, memberService);
        this.memberController = new MemberController(memberService);
        this.resultController = new ResultController(resultService);
        this.ui = new UserInterface();
        memberController.loadAllMembers();
    }

    public void initializeMenu() {
        while (true) {
            ui.printMenu();
            String choice = ui.getStringInput("Enter choice: ");

            switch (choice) {
                case "1" -> chairmanMenu();
                case "2" -> accountantMenu();
                case "3" -> coachMenu();
                case "0" -> System.exit(0);
                default -> ui.printMessage("Invalid choice! Try again.");
            }
        }
    }

    private void chairmanMenu() {
        while (true) {
            ui.printMessage("Enter password: ");
            String code = ui.getStringInput("");
            if (!code.equals("1")) {
                ui.printMessage("Incorrect password, try again.");
                continue;
            }

            ui.printMessage("\n1 - Register member");
            ui.printMessage("2 - View all members");
            ui.printMessage("3 - View active members");
            ui.printMessage("4 - View passive members");
            ui.printMessage("0 - Back");
            String choice = ui.getStringInput("Enter choice: ");

            switch (choice) {
                case "1" -> registerMember();
                case "2" -> showMembers(memberController.getAllMembers());
                case "3" -> showMembers(memberController.getActiveMembers());
                case "4" -> showMembers(memberController.getPassiveMembers());
                case "0" -> { return; }
                default -> ui.printMessage("Invalid choice!");
            }
        }
    }

    private void accountantMenu() {
        ui.printMessage("\n1 - View members with outstanding payments");
        ui.printMessage("2 - View total expected membership fees");
        ui.printMessage("0 - Back");
        String choice = ui.getStringInput("Enter choice: ");

        switch (choice) {
            case "1" -> {
                Membership membership = new Membership("", Discipline.JUNIOR, Status.ACTIVE, false, 0, 0, 0, null, "", "", "", 0.0);
                List<Membership> outstanding = membership.membersWithOutstandingPayment(memberController.getMemberships());
                for (Membership m : outstanding) {
                    ui.printMessage(m.toString());
                }
            }
            case "2" -> {
                Membership membership = new Membership("", Discipline.JUNIOR, Status.ACTIVE, false, 0, 0, 0, null, "", "", "", 0.0);
                double total = membership.calculateTotalMembershipFees(memberController.getMemberships());
                ui.printMessage("Total expected membership fees: " + total + " DKK");
            }
            case "0" -> { return; }
            default -> ui.printMessage("Invalid choice!");
        }
    }

    private void coachMenu() {
        ui.printMessage("\n1 - Register training result");
        ui.printMessage("2 - Register competition result");
        ui.printMessage("3 - View top 5 swimmers by discipline");
        ui.printMessage("0 - Back");
        String choice = ui.getStringInput("Enter choice: ");

        switch (choice) {
            case "1" -> registerTrainingResult();
            case "2" -> registerCompetitionResult();
            case "3" -> viewTop5Swimmers();
            case "0" -> { return; }
            default -> ui.printMessage("Invalid choice!");
        }
    }

    private void registerMember() {
        int memberID = ui.getIntInput("Member ID: ");
        String name = ui.getStringInput("Name: ");
        String dateOfBirthStr = ui.getStringInput("Date of birth (YYYY-MM-DD): ");
        String disciplineStr = ui.getStringInput("Discipline (Junior/Senior/Veteran): ");
        String statusStr = ui.getStringInput("Status (Active/Passive): ");
        String competitiveStr = ui.getStringInput("Competitive swimmer (true/false): ");
        int age = ui.getIntInput("Age: ");
        int teamID = ui.getIntInput("Team ID (101-199 for Junior, 200+ for Senior): ");
        String parentsNumber = ui.getStringInput("Parents' phone number (or empty): ");
        String parentsName = ui.getStringInput("Parents' name (or empty): ");

        try {
            LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);
            Discipline discipline = Discipline.valueOf(disciplineStr.toUpperCase());
            Status status = Status.valueOf(statusStr.toUpperCase());
            boolean isCompetitive = Boolean.parseBoolean(competitiveStr);
            Member member = new Member(name, discipline, status, isCompetitive, memberID, age, teamID,
                    dateOfBirth, parentsNumber, parentsName);
            memberController.addMember(member);
            ui.printMessage("Member registered successfully!");
        } catch (IllegalArgumentException e) {
            ui.printMessage("Error: Invalid discipline, status, or competitive flag. Use Junior/Senior/Veteran, Active/Passive, true/false.");
        } catch (Exception e) {
            ui.printMessage("Error during registration: " + e.getMessage());
        }
    }

    private void registerTrainingResult() {
        int memberID = ui.getIntInput("Member ID: ");
        String swimDisciplineStr = ui.getStringInput("Swim discipline (Butterfly/Crawl/Backstroke/Breaststroke): ");
        double time = ui.getDoubleInput("Time (seconds): ");
        String dateStr = ui.getStringInput("Date (YYYY-MM-DD): ");

        try {
            SwimDiscipline swimDiscipline = SwimDiscipline.valueOf(swimDisciplineStr.toUpperCase());
            resultController.addTrainingResult(memberID, swimDiscipline, time, dateStr);
            ui.printMessage("Training result registered successfully!");
        } catch (IllegalArgumentException e) {
            ui.printMessage("Error: Invalid swim discipline. Use Butterfly/Crawl/Backstroke/Breaststroke.");
        } catch (Exception e) {
            ui.printMessage("Error during registration: " + e.getMessage());
        }
    }

    private void registerCompetitionResult() {
        int memberID = ui.getIntInput("Member ID: ");
        String swimDisciplineStr = ui.getStringInput("Swim discipline (Butterfly/Crawl/Backstroke/Breaststroke): ");
        String event = ui.getStringInput("Event name: ");
        int placement = ui.getIntInput("Placement: ");
        double time = ui.getDoubleInput("Time (seconds): ");

        try {
            SwimDiscipline swimDiscipline = SwimDiscipline.valueOf(swimDisciplineStr.toUpperCase());
            resultController.addCompetitionResult(memberID, swimDiscipline, event, placement, time);
            ui.printMessage("Competition result registered successfully!");
        } catch (IllegalArgumentException e) {
            ui.printMessage("Error: Invalid swim discipline. Use Butterfly/Crawl/Backstroke/Breaststroke.");
        } catch (Exception e) {
            ui.printMessage("Error during registration: " + e.getMessage());
        }
    }

    private void viewTop5Swimmers() {
        String swimDisciplineStr = ui.getStringInput("Swim discipline (Butterfly/Crawl/Backstroke/Breaststroke): ");
        String disciplineStr = ui.getStringInput("Member discipline (Junior/Senior): ");

        try {
            SwimDiscipline swimDiscipline = SwimDiscipline.valueOf(swimDisciplineStr.toUpperCase());
            Discipline memberDiscipline = Discipline.valueOf(disciplineStr.toUpperCase());
            if (memberDiscipline == Discipline.VETERAN) {
                ui.printMessage("Error: Veteran category not supported for top 5 swimmers.");
                return;
            }
            List<TrainingResult> top5 = resultController.getTop5TrainingResults(swimDiscipline, memberDiscipline);
            if (top5.isEmpty()) {
                ui.printMessage("No results found for " + swimDiscipline + " in " + memberDiscipline + " category.");
            } else {
                ui.printMessage("Top 5 swimmers for " + swimDiscipline + " (" + memberDiscipline + "):");
                for (TrainingResult result : top5) {
                    ui.printMessage(result.toString());
                }
            }
        } catch (IllegalArgumentException e) {
            ui.printMessage("Error: Invalid swim discipline or member discipline. Use Butterfly/Crawl/Backstroke/Breaststroke and Junior/Senior.");
        }
    }

    private void showMembers(List<Member> members) {
        if (members.isEmpty()) {
            ui.printMessage("No members found.");
        } else {
            for (Member member : members) {
                ui.printMessage(member.toString());
            }
        }
    }
}