import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LoadMembersFromCSV {

    public static List<Member> loadMembersFromCSV(String filePath) {
        List<Member> members = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            lines.remove(0);

            for (String line : lines) {
                String[] fields = line.split(",");
                int memberID = Integer.parseInt(fields[0]);
                String name = fields[1];
                LocalDateTime dateOfBirth = LocalDateTime.parse(fields[2]);
                String memberType = fields[3];
                String swimmerType = fields[4];
                int ageGroup = Integer.parseInt(fields[5]);
                int teamId = Integer.parseInt(fields[6]);
                int parentsNumber = Integer.parseInt(fields[7]);
                String parentsName = fields.length > 8 ? fields[8] : "";

                Member member = new Member(memberID, name, dateOfBirth, memberType, swimmerType,
                        ageGroup, teamId, parentsNumber, parentsName);
                members.add(member);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return members;
    }
}
