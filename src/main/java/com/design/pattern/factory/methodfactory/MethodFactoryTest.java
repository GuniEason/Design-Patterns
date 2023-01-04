package com.design.pattern.factory.methodfactory;

/**
 * 方法工厂模式测试
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.create().record();
        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.create().record();

    }
}
