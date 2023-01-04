package com.design.pattern.delegate.simple;

public class EmployeeA extends Employee {
    protected String goodAt = "编程";

    @Override
    void doingWork(String task) {
        System.out.println("我是员工A，我擅长" + goodAt + ",现在开始做" + task + "工作");
    }
}
