package com.design.pattern.proxy.statics;

import com.design.pattern.service.impl.JavaRecord;

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
