import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MemberCSVLoader {

    public static List<Member> loadMembersFromCSV(String fileName) {
        List<Member> members = new ArrayList<>();

        try (InputStream is = MemberCSVLoader.class.getClassLoader().getResourceAsStream(fileName);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String line;
            int lineCount = 0;

            while ((line = br.readLine()) != null) {
                lineCount++;
                if (line.trim().isEmpty()) continue;

                String[] values = line.split(",");
                if (values.length >= 9) {
                    try {
                        int memberID = Integer.parseInt(values[0].trim());
                        String name = values[1].trim();
                        String dateOfBirth = values[2].trim();
                        String memberType = values[3].trim();
                        String swimmerType = values[4].trim();
                        int ageGroup = Integer.parseInt(values[5].trim());
                        int teamID = Integer.parseInt(values[6].trim());
                        String parentsNumber = values[7].trim();
                        String parentName = values[8].trim();

                        if (parentsNumber.equals("0")) parentsNumber = "";

                        Member member = new Member(memberID, name, dateOfBirth, memberType, swimmerType,
                                ageGroup, parentsNumber, parentName);
                        members.add(member);

                    } catch (NumberFormatException e) {
                        System.err.println("Fejl ved parsing af linje: " + line);
                    }
                } else {
                    System.err.println("Springer linje over, da den ikke har nok felter: " + line);
                }
            }

            if (lineCount == 0) {
                System.out.println("CSV filen er tom!");
            }

        } catch (IOException | NullPointerException e) {
            System.err.println("Fejl ved indlæsning af fil: " + fileName);
            e.printStackTrace();
        }

        return members;
    }
}
