package com.p6.pattern.visitor.kpi;

import java.util.Random;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.visitor.kpi
 * @className Employee
 * @author: zhuyf
 * @Date:2022/12/09 10:11
 * @Description: //
 */
public abstract class Employee {

    public String name;

    public int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(IVisitor visitor);
}
