package com.design.pattern.factory.methodfactory;

import com.design.pattern.service.ICourse;
import com.design.pattern.service.impl.JavaRecord;

public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaRecord();
    }
}
