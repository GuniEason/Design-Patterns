package com.design.test.proxy;

import com.design.pattern.proxy.cglib.CglibProxy;
import com.design.pattern.service.impl.JavaRecord;

public class ProxyTest {

    public static void main(String[] args) {
        /**
         * 静态代理
         */
//        TeachProxy proxy = new TeachProxy(new JavaRecord());
//        proxy.record();

        /**
         * jdk代理
         */
//        TeacherJdkProxy proxy = new TeacherJdkProxy();
//        ICourse javaInstance = (ICourse) proxy.getInstance(new JavaRecord());
//        javaInstance.record();
//        System.out.println("#################");
//        ICourse pythonInstance = (ICourse) proxy.getInstance(new PythonRecord());
//        pythonInstance.record();

        /**
         * Cglib代理
         */
        CglibProxy proxy = new CglibProxy();
        JavaRecord javaRecord = (JavaRecord) proxy.getInstance(JavaRecord.class);
        javaRecord.record();

//        PythonRecord pythonRecord = (PythonRecord) proxy.getInstance(PythonRecord.class);
//        pythonRecord.record();


    }
}
