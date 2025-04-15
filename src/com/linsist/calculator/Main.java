package com.linsist.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数字: ");
        int a = input.nextInt();
        System.out.println("请输入运算符: ");
        String operator = input.next();
        System.out.println("请输入第二个数字: ");
        int b = input.nextInt();

        Calculator calc = new Calculator();
        try {
            int result = calc.calculate(a, b, operator);
            System.out.println("结果是" + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("错误：" + e.getMessage());
        }
    }
}