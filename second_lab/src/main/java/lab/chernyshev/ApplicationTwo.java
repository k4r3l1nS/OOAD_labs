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

            processFile(file2, fileName2, result, regex, words);
            processFile(file3, fileName3, result, regex, words);

            return result.toString();

        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        }
        return null;
    }

    private void processFile(
            FileReader file,
            String filename,
            StringBuilder result,
            String regex,
            List<String> words
    ) {
        try {
            BufferedReader bufferedReader;
            String line;
            bufferedReader = new BufferedReader(file);
            StringBuilder fileContent = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            if (checkAllWordsInArray(words, Arrays.asList(fileContent.toString().split(regex)))) {
                result.append(filename).append("\n");
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        }
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
