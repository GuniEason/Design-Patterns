package com.p6.test.factory;

import com.p6.pattern.factory.SimpleFactory;
import com.p6.pattern.service.ICourse;
import com.p6.pattern.service.impl.JavaRecord;

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
