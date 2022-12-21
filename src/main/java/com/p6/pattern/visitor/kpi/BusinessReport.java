package com.p6.pattern.visitor.kpi;

import java.util.ArrayList;
import java.util.List;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.visitor.kpi
 * @className BusinessReport
 * @author: zhuyf
 * @Date:2022/12/09 10:23
 * @Description: //
 */
public class BusinessReport {

    private List<Employee> employees = new ArrayList<>();

    public BusinessReport() {
        employees.add(new Manager("产品经理A,"));
        employees.add(new Manager("产品经理B,"));
        employees.add(new Engineer("程序员A,"));
        employees.add(new Engineer("程序员B,"));
        employees.add(new Engineer("程序员C,"));
        employees.add(new Engineer("程序员D,"));
        employees.add(new Engineer("程序员E,"));
    }

    public void showReport(IVisitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
