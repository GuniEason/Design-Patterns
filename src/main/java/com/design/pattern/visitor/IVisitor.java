package com.design.pattern.visitor;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.visitor.kpi
 * @className IVisitor
 * @author: zhuyf
 * @Date:2022/12/09 10:13
 * @Description: //
 */
public interface IVisitor {

    void visit(Engineer engineer);

    void visit(Manager manager);


}
