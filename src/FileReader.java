import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private final String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Member> readFile() {
        List<Member> members = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNext()) {
                String[] line = fileReader.nextLine().split(",");

                int id = Integer.parseInt(line[0]);
                String name = line[1];
                String[] dateParts = line[2].split("-");
                int year = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int day = Integer.parseInt(dateParts[2]);
                LocalDate dob = LocalDate.of(year,month,day);
                String memberType = line[3];
                String swimmerType = line[4];
                int ageGroup = Integer.parseInt(line[5]);
                int teamID = Integer.parseInt(line[6]);
                String parentsNumber = line[7];
                String parentsName = line[8];

                members.add(new Member());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return members;
    }
}