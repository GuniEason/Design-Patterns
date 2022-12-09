package com.p6.test.interpreter;

import com.p6.pattern.interpreter.calculate.GPCalculator;

/**
 * Created by Tom.
 */
public class InterpreterTest {

    public static void main(String[] args) {
        System.out.println("result: " + new GPCalculator("10 + 30").calculate());
        System.out.println("result: " + new GPCalculator("10 + 30 - 20").calculate());
        System.out.println("result: " + new GPCalculator("100 * 2 + 400 * 1 + 66").calculate());
    }

}
