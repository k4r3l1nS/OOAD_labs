package main.java.com.k4r3l1ns.strategy.impl;

import main.java.com.k4r3l1ns.strategy.Encodeable;

import java.util.Arrays;

public class ShiftByOne implements Encodeable {
    @Override
    public String encode(String source) {

        var charArray = source.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            charArray[i] += 1;
        }

        return String.copyValueOf(charArray);
    }

    @Override
    public String decode(String source) {
        var charArray = source.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            charArray[i] -= 1;
        }

        return String.copyValueOf(charArray);
    }
}
