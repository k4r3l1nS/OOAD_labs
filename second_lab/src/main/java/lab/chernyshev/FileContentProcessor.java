package lab.chernyshev;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public abstract class FileContentProcessor {
    private static final String path = "second_lab/src/main/resources/";
    protected abstract String processingMethod(
            FileReader file1,
            FileReader file2,
            FileReader file3,
            String fileName1,
            String fileName2,
            String fileName3
    );

    public void processFileContent(
            String fileName1,
            String fileName2,
            String fileName3,
            String fileName4
    ) {
        try {
            FileReader fileReader1 = new FileReader(Paths.get(path, fileName1).toString());
            FileReader fileReader2 = new FileReader(Paths.get(path, fileName2).toString());
            FileReader fileReader3 = new FileReader(Paths.get(path, fileName3).toString());
            FileWriter fileWriter = new FileWriter(Paths.get(path, fileName4).toString());
            fileWriter.write(processingMethod(fileReader1, fileReader2, fileReader3, fileName1, fileName2, fileName3));
            fileReader1.close();
            fileReader2.close();
            fileReader3.close();
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        }
    }
}