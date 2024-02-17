package lab.chernyshev;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileContentProcessor fileContentProcessor1 = new ApplicationOne();
        fileContentProcessor1.processFileContent(
                "file1.txt",
                "file2.txt",
                "file3.txt",
                "ApplicationOneOutput.txt");
        FileContentProcessor fileContentProcessor2 = new ApplicationTwo();
        fileContentProcessor2.processFileContent(
                "file1.txt",
                "file2.txt",
                "file3.txt",
                "ApplicationTwoOutput.txt");

    }
}