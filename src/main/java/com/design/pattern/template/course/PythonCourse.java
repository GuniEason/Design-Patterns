package com.design.pattern.template.course;


public class PythonCourse extends AbstractCourse {

    @Override
    protected void checkHomework() {
        System.out.println("检查Python作业");
    }
}
