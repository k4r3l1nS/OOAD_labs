package lab.chernyshev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ApplicationTwo extends FileContentProcessor {
    @Override
    protected String processingMethod(
            FileReader file1,
            FileReader file2,
            FileReader file3,
            String fileName1,
            String fileName2,
            String fileName3
    ) {

        try {

            StringBuilder file1Content = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(file1);
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                file1Content.append(line).append("\n");
            }
            String regex = "\\s|\\n";
            List<String> words = Arrays.asList(file1Content.toString().split(regex));

            bufferedReader = new BufferedReader(file2);
            StringBuilder file2Content = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                file2Content.append(line).append("\n");
            }
            if (checkAllWordsInArray(words, Arrays.asList(file2Content.toString().split(regex)))) {
                result.append(fileName2).append("\n");
            }
            bufferedReader = new BufferedReader(file3);
            StringBuilder file3Content = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                file3Content.append(line).append("\n");
            }
            if (checkAllWordsInArray(words, Arrays.asList(file3Content.toString().split(regex)))) {
                result.append(fileName3).append("\n");
            }
            return result.toString();
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        }
        return null;
    }
    private boolean checkAllWordsInArray(List<String> wordsToCheck, List<String> wordsArray) {
        for (String word : wordsToCheck) {
            if (!wordsArray.contains(word)) {
                return false;
            }
        }
        return true;
    }
}
