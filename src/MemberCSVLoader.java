import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MemberCSVLoader {

    public static List<Member> loadMembersFromCSV(String filePath) {
        List<Member> members = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;  // Til debugging, tæller linjer, der bliver læst

            while ((line = br.readLine()) != null) {
                lineCount++;  // Tæller linjer
                // Skippe kommentarer (valgfrit) eller tomme linjer
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] values = line.split(",");
                if (values.length >= 9) {
                    try {
                        int memberID = Integer.parseInt(values[0].trim());
                        String name = values[1].trim();
                        String dateOfBirth = values[2].trim();  // Vi kan beholde denne som String
                        String memberType = values[3].trim();
                        String swimmerType = values[4].trim();
                        int ageGroup = Integer.parseInt(values[5].trim());
                        int teamID = Integer.parseInt(values[6].trim());
                        String parentsNumber = values[7].trim();
                        String parentName = values[8].trim();

                        // Hvis telefonnummeret er "0", sæt det som tomt
                        if (parentsNumber.equals("0")) {
                            parentsNumber = "";
                        }

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

        } catch (IOException e) {
            System.err.println("Fejl ved indlæsning af fil: " + filePath);
            e.printStackTrace();
        }

        return members;
    }
}
