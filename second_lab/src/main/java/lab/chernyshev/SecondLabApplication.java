package lab.chernyshev;

import java.util.Scanner;

public class SecondLabApplication {

    private static final int FILE_COUNT = 4;

    private static final String SOURCE_DIRECTORY_PATH = "source/";
    private static final String OUTPUT_DIRECTORY_PATH = "output/";

    private static final String FILENAMES_EXAMPLE1 = "file1.txt file2.txt file3.txt output1.txt";
    private static final String FILENAMES_EXAMPLE2 = "file1.txt file2.txt file3.txt output2.txt";

    public static void main(String[] args) {

        // Подразумеваемый лабой способ - ввод с консоли
//        Scanner scanner = new Scanner(System.in);

        Scanner scanner = new Scanner(FILENAMES_EXAMPLE1);
        String[] filenames = scanFilenames(scanner);

        FileContentProcessor fileContentProcessor1 = new ApplicationOne();
        fileContentProcessor1.processFileContent(
                SOURCE_DIRECTORY_PATH + filenames[0],
                SOURCE_DIRECTORY_PATH + filenames[1],
                SOURCE_DIRECTORY_PATH + filenames[2],
                OUTPUT_DIRECTORY_PATH + filenames[3]
        );

        scanner = new Scanner(FILENAMES_EXAMPLE2);
        filenames = scanFilenames(scanner);

        FileContentProcessor fileContentProcessor2 = new ApplicationTwo();
        fileContentProcessor2.processFileContent(
                SOURCE_DIRECTORY_PATH + filenames[0],
                SOURCE_DIRECTORY_PATH + filenames[1],
                SOURCE_DIRECTORY_PATH + filenames[2],
                OUTPUT_DIRECTORY_PATH + filenames[3]
        );
    }

    private static String[] scanFilenames(Scanner scanner) {

        String[] filenames = new String[FILE_COUNT];
        for (int index = 0; index < FILE_COUNT && scanner.hasNext(); ++index) {
            filenames[index] = scanner.next();
        }

        return filenames;
    }
}