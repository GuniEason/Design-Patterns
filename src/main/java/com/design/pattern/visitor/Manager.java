package com.design.pattern.visitor;

import java.util.Random;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.visitor.kpi
 * @className Manager
 * @author: zhuyf
 * @Date:2022/12/09 10:15
 * @Description: //
 */
public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    //考核新产品数量
    public int getProductNum() {
        return new Random().nextInt(10);
    }
}
