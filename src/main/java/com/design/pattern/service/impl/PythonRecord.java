package com.design.pattern.service.impl;

import com.design.pattern.service.ICourse;

public class PythonRecord implements ICourse {

    @Override
    public void record() {
        System.out.println("Python学习");

    }
}
