package com.k4r3l1ns.model;

import com.k4r3l1ns.strategy.Encodeable;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Getter
public class Text {

    private String text;
    private String encodedText;
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
