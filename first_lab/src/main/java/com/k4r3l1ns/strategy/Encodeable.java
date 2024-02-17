package com.k4r3l1ns.strategy;

public interface Encodeable {

    String encode(String source);
    String decode(String source);
}
