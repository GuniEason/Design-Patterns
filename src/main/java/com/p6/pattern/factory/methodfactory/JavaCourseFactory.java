package com.p6.pattern.factory.methodfactory;

import com.p6.pattern.service.ICourse;
import com.p6.pattern.service.impl.JavaRecord;

public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaRecord();
    }
}
