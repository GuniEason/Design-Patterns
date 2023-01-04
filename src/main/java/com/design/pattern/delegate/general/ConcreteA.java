package com.design.pattern.delegate.general;

public class ConcreteA implements Task {
    @Override
    public void doTask() {
        System.out.println("执行 , 由A实现");
    }
}