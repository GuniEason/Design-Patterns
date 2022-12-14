package com.design.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherJdkProxy implements InvocationHandler {

    private Object object;


    public Object getInstance(Object object){
        this.object = object;
        Class<?> aClass = object.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.object, args);
        after();
        return invoke;
    }

    private void after() {
        System.out.println("执行结束");
    }

    private void before() {
        System.out.println("准备开始");
    }
}
