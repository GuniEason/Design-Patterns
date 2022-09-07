package com.p6.pattern.factory.methodfactory;

import com.p6.pattern.service.ICourse;
import com.p6.pattern.service.impl.PythonRecord;

public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonRecord();
    }
}
