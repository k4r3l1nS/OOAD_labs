package lab.chernyshev;

public class SecondLabApplication {

    public static void main(String[] args) {

        FileContentProcessor fileContentProcessor1 = new ApplicationOne();
        fileContentProcessor1.processFileContent(
                "source/file1.txt",
                "source/file2.txt",
                "source/file3.txt",
                "output/ApplicationOneOutput.txt"
        );

        FileContentProcessor fileContentProcessor2 = new ApplicationTwo();
        fileContentProcessor2.processFileContent(
                "source/file1.txt",
                "source/file2.txt",
                "source/file3.txt",
                "output/ApplicationTwoOutput.txt");
    }
}