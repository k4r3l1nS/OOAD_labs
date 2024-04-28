package main.java.com.k4r3l1ns.model;

import main.java.com.k4r3l1ns.strategy.Encodeable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Text {

    private String text;
    private String encodedText;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEncodedText() {
        return encodedText;
    }

    public void setEncodedText(String encodedText) {
        this.encodedText = encodedText;
    }

    public Encodeable getEncodingStrategy() {
        return encodingStrategy;
    }

    public void setEncodingStrategy(Encodeable encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    Encodeable encodingStrategy;

    public Text(File sourceFile, Encodeable encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
        this.read(sourceFile);
        this.encodedText = encodingStrategy.encode(text);
    }

    private void read(File file) {

        StringBuilder textBuilder = new StringBuilder();

        try {

            Scanner scanner = new Scanner(new FileInputStream(file));
            while (scanner.hasNextLine()) {
                textBuilder.append(scanner.nextLine());
            }

            text = textBuilder.toString();
        } catch(FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}
