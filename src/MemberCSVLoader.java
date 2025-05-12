import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MemberCSVLoader {

    public static List<Member> loadMembersFromCSV(String filename) {
        List<Member> members = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");

                Member m = new Member();
                m.setMemberID(Integer.parseInt(tokens[0]));
                m.setName(tokens[1]);
                m.setDateOfBirth(LocalDate.parse(tokens[2]));
                m.setMemberType(tokens[3]);
                m.setSwimmerType(tokens[4]);
                m.setAge(Integer.parseInt(tokens[5]));
                m.setTeamID(Integer.parseInt(tokens[6]));
                m.setParentsNumber(tokens[7].isEmpty() ? null : tokens[7]);
                m.setParentsName(tokens[8].isEmpty() ? null : tokens[8]);

                members.add(m);
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }

        return members;
    }
}