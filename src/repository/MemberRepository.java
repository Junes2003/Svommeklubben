package repository;

import models.Member;
import models.Discipline;
import models.Status;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private final CSVHandler csvHandler;
    private final String fileName = "files/MemberInfo.csv";

    public MemberRepository(CSVHandler csvHandler) {
        this.csvHandler = csvHandler;
    }

    public List<Member> getMembers() {
        List<String> memberStrings = csvHandler.readFile(fileName);
        List<Member> members = new ArrayList<>();
        for (String line : memberStrings) {
            String[] data = line.split(",");
            try {
                int memberID = Integer.parseInt(data[0]);
                String name = data[1];
                LocalDate dateOfBirth = LocalDate.parse(data[2]);
                Discipline discipline = Discipline.valueOf(data[3].toUpperCase());
                Status status = Status.valueOf(data[4].toUpperCase());
                boolean isCompetitive = Boolean.parseBoolean(data[5]);
                int age = Integer.parseInt(data[6]);
                int teamID = Integer.parseInt(data[7]);
                String parentsNumber = data.length > 8 ? data[8] : "";
                String parentsName = data.length > 9 ? data[9] : "";

                members.add(new Member(name, discipline, status, isCompetitive, memberID, age, teamID, dateOfBirth, parentsNumber, parentsName));
            } catch (Exception e) {
                System.err.println("Error parsing line: " + line + " (" + e.getMessage() + ")");
            }
        }
        return members;
    }

    public void addMember(Member member) {
        csvHandler.appendToFile(fileName, toCSV(member));
    }

    private String toCSV(Member member) {
        return String.format("%d,%s,%s,%s,%s,%b,%d,%d,%s,%s",
                member.getMemberID(), member.getName(), member.getDateOfBirth(),
                member.getDiscipline(), member.getStatus(), member.isCompetitive(),
                member.getAge(), member.getTeamID(), member.getParentsNumber(), member.getParentsName());
    }
}
