package main.java.com.k4r3l1ns.strategy.impl;

import main.java.com.k4r3l1ns.strategy.Encodeable;

public class ShiftByFive implements Encodeable {
    @Override
    public String encode(String source) {

        var charArray = source.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            charArray[i] += 5;
        }

        return String.copyValueOf(charArray);
    }

    @Override
    public String decode(String source) {
        var charArray = source.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            charArray[i] -= 5;
        }

        return String.copyValueOf(charArray);
    }
}
