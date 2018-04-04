import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileProcessingExample {
    public static void main(String[] arg0){
        try {
            List<String> l = Files.lines(Paths.get("D:\\R&D\\functionalProgramming\\src\\properties.xml"))
                    .filter(line->line.contains("name"))
                    .map(line->line.trim()
                            .replaceAll("name","")
                            .replaceAll("<","")
                            .replaceAll(">","")
                            .replaceAll("/",""))
                    .collect(Collectors.toList());
            System.out.println(l);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
