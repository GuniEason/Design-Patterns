package com.p6.pattern.proxy.statics;

import com.p6.pattern.service.ICourse;
import com.p6.pattern.service.impl.JavaRecord;

import javax.xml.bind.util.JAXBSource;

public class TeachProxy {

    private JavaRecord javaRecord;

    public TeachProxy(JavaRecord javaRecord) {
        this.javaRecord = javaRecord;
    }

    public void record(){
        System.out.println("java老师结束");
        javaRecord.record();
        System.out.println("java老师布置作业");

    }
}
