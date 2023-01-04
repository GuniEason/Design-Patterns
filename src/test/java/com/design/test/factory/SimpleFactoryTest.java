package com.design.test.factory;

import com.design.pattern.factory.SimpleFactory;
import com.design.pattern.service.ICourse;
import com.design.pattern.service.impl.JavaRecord;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        try {
            ICourse iCourse = SimpleFactory.create(JavaRecord.class);
            iCourse.record();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
