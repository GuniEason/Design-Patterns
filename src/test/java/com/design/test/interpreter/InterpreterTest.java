package com.design.test.interpreter;

import com.design.pattern.interpreter.calculate.GPCalculator;


public class InterpreterTest {

    public static void main(String[] args) {
        System.out.println("result: " + new GPCalculator("10 + 30").calculate());
        System.out.println("result: " + new GPCalculator("10 + 30 - 20").calculate());
        System.out.println("result: " + new GPCalculator("100 * 2 + 400 * 1 + 66").calculate());
    }

}
