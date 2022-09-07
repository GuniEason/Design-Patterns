package com.p6.pattern.proxy.jdk;

import com.p6.pattern.service.ICourse;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherJdkProxy implements InvocationHandler {

    private Object object;


    public ICourse getInstance(Object object){
        this.object = object;
        Class<?> aClass = object.getClass();
        return (ICourse) Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.object, args);
        after();
        return invoke;
    }

    private void after() {
        System.out.println("老师布置作业");
    }

    private void before() {
        System.out.println("老师上课结束");
    }
}
