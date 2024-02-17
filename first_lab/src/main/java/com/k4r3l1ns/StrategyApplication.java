package com.k4r3l1ns;

import com.k4r3l1ns.model.Text;
import com.k4r3l1ns.strategy.impl.ShiftByFive;
import com.k4r3l1ns.strategy.impl.ShiftByOne;
import com.k4r3l1ns.strategy.impl.ShiftByTwo;

import java.io.File;

public class StrategyApplication {

    private static final String SOURCE_FILEPATH =
            "/home/k4r3l1ns/Desktop/OOAD_labs/first_lab/src/main/resources/data.txt";

    public static void main(String[] args) {

        Text text1 = new Text(new File(SOURCE_FILEPATH), new ShiftByOne());
        Text text2 = new Text(new File(SOURCE_FILEPATH), new ShiftByTwo());
        Text text5 = new Text(new File(SOURCE_FILEPATH), new ShiftByFive());

        System.out.println("Исходный текст:");
        System.out.println(text1.getText() + "\n");

        System.out.println("Кодировка 1:");
        System.out.println(text1.getEncodedText() + "\n");

        System.out.println("Пример декодирования");
        System.out.println(text1.getEncodingStrategy().decode(text1.getEncodedText()) + "\n");

        System.out.println("Кодировка 2:");
        System.out.println(text2.getEncodedText() + "\n");

        System.out.println("Пример декодирования");
        System.out.println(text2.getEncodingStrategy().decode(text2.getEncodedText()) + "\n");

        System.out.println("Кодировка 3:");
        System.out.println(text5.getEncodedText() + "\n");


        System.out.println("Пример декодирования");
        System.out.println(text5.getEncodingStrategy().decode(text5.getEncodedText()) + "\n");

    }
}