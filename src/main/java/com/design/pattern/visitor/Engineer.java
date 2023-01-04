package com.design.pattern.visitor;

import java.util.Random;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.visitor.kpi
 * @className Engineer
 * @author: zhuyf
 * @Date:2022/12/09 10:14
 * @Description: //
 */
public class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    //考核指标是代码量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
