package com.linsist.calculator;

public class Modulus implements Operation {
    @Override
    public int execute(int a, int b) {
        return a % b;
    }
}
