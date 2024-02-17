package lab.chernyshev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationOne extends FileContentProcessor {
    @Override
    protected String processingMethod(FileReader file1, FileReader file2, FileReader file3, String fileName1, String fileName2, String fileName3) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;
        BufferedReader bufferedReader = new BufferedReader(file1);
        result.append(fileName1).append(":\n");
        while ((line = bufferedReader.readLine()) != null) {
            result.append(line.toUpperCase()).append("\n");
        }
        bufferedReader = new BufferedReader(file2);
        result.append(fileName2).append(":\n");
        while ((line = bufferedReader.readLine()) != null) {
            result.append(line.toUpperCase()).append("\n");
        }
        bufferedReader = new BufferedReader(file3);
        result.append(fileName3).append(":\n");
        while ((line = bufferedReader.readLine()) != null) {
            result.append(line.toUpperCase()).append("\n");
        }
        return result.toString();
    }
}
