package com.p6.pattern.visitor.kpi;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.visitor.kpi
 * @className CTOVisitor
 * @author: zhuyf
 * @Date:2022/12/09 10:19
 * @Description: //
 */
public class CTOVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + "代码行数：" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + "产品数量：" + manager.getProductNum());
    }
}
