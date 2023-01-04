package com.design.test.template.general;

import com.design.pattern.template.general.AbstractClass;
import com.design.pattern.template.general.ConcreteClassA;
import com.design.pattern.template.general.ConcreteClassB;


public class Test {
    public static void main(String[] args) {
        AbstractClass abc = new ConcreteClassA();
        abc.templateMehthod();
        abc = new ConcreteClassB();
        abc.templateMehthod();
    }
}
