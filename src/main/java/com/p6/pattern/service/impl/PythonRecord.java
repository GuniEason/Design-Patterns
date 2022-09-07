package com.p6.pattern.service.impl;

import com.p6.pattern.service.ICourse;

public class PythonRecord implements ICourse {

    @Override
    public void record() {
        System.out.println("Python录播");

    }
}
