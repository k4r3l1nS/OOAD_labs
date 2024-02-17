package com.k4r3l1ns.strategy.impl;

import com.k4r3l1ns.strategy.Encodeable;

public class ShiftByTwo implements Encodeable {
    @Override
    public String encode(String source) {

        var charArray = source.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            charArray[i] += 2;
        }

        return String.copyValueOf(charArray);
    }

    @Override
    public String decode(String source) {

        var charArray = source.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            charArray[i] -= 2;
        }

        return String.copyValueOf(charArray);
    }
}
