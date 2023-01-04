package com.design.pattern.service.impl;

import com.design.pattern.service.ICourse;

public class JavaRecord implements ICourse {

    @Override
    public void record() {
        System.out.println("JAVA学习");

    }
}
