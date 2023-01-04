package com.design.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader extends Employee {


    private Map<String, Employee> employeeMap = new HashMap<>();

    public Leader() {
        employeeMap.put("爬虫", new EmployeeA());
        employeeMap.put("海报图", new EmployeeB());
    }

    @Override
    void doingWork(String task) {
        if (!employeeMap.containsKey(task)) {
            System.out.println("任务超出能力范围,无法完成");
            return;
        }
        employeeMap.get(task).doingWork(task);
    }
}
