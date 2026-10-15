
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileUtility {
    private static final String FILE_NAME = "one.txt";

    public FileUtility() {
        try {
            File file = new File(FILE_NAME);
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<String> readLines() {
        try {
            return Files.readAllLines(Path.of(FILE_NAME));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    public void writeLines(List<String> lines) {
        try {
            Files.write(
                Path.of(FILE_NAME),
                lines,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
