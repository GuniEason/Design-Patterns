package com.design.pattern.factory.methodfactory;

import com.design.pattern.service.ICourse;
import com.design.pattern.service.impl.PythonRecord;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonRecord();
    }
}
