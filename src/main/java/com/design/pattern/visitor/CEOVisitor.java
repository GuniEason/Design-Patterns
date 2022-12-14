package com.design.pattern.visitor;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.visitor.kpi
 * @className CEOVisitor
 * @author: zhuyf
 * @Date:2022/12/09 10:21
 * @Description: //
 */
public class CEOVisitor implements IVisitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + "KPI：" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + "KPI：" + manager.kpi);
    }
}
