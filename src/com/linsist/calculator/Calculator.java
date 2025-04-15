package com.linsist.calculator;

public class Calculator {
    public int calculate(int a, int b, String operator) {
        Operation op;
        switch (operator) {
            case "+":
                op = new Addition(); break;
            case "-":
                op = new Subtraction(); break;
            case "*":
                op = new Multiplication(); break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("除数不能为0");
                }
                op = new Division(); break;
            case "%":
                if (b == 0) {
                    throw new ArithmeticException("除数不能为0");
                }
                op = new Modulus(); break;
            default:
                throw new IllegalArgumentException("无效的运算符" + operator);
        }
        return op.execute(a, b);
    }
}
