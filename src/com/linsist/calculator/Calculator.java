package com.linsist.calculator;

public class Calculator {
    public int calculate(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return (a + b);
            case "-":
                return (a - b);
            case "*":
                return (a * b);
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("除数不能为0");
                }
                return (a / b);
            case "%":
                if (b == 0) {
                    throw new ArithmeticException("除数不能为0");
                }
                return (a % b);
            default:
                throw new IllegalArgumentException("无效的运算符" + operator);
        }
    }
}
