package com.design.pattern.delegate.simple;

public class EmployeeB extends Employee {
    protected String goodAt = "设计";

    @Override
    void doingWork(String task) {
        System.out.println("我是员工B，我擅长" + goodAt + ",现在开始做" + task + "工作");
    }
}
