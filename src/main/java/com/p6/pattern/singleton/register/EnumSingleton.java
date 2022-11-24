package com.p6.pattern.singleton.register;

/**
 * 枚举式单例
 * 优点： 线程安全，不会被反射破坏
 * 缺点：大批量创建时造成线程浪费(初始化创建实例)
 */
public enum EnumSingleton {

    INSTANCE;

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
