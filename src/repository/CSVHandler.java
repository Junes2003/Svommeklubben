package repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVHandler {
    public List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try {
            Scanner fileReader = new Scanner(new File(fileName));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                lines.add(line);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + fileName, e);
        }
        return lines;
    }

    public void appendToFile(String fileName, String content) {
        try (PrintStream out = new PrintStream(new FileOutputStream(fileName, true))) {
            out.println(content);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Could not write to file: " + fileName, e);
        }
    }
}