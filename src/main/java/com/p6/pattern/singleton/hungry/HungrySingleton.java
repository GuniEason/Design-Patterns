package com.p6.pattern.singleton.hungry;

/**
 * 单例模式：确保任何情况下都绝对只有一个实例，并提供一个全局访问点
 * 饿汉式：在每次加载时创建实例
 * 优点:无锁（效率相对高）
 * 缺点:对于不需要立即创建实例的对象来说  浪费内存  （chushih）
 */
public class HungrySingleton {
    private static final HungrySingleton  singleton = new HungrySingleton();

    //私有构造方法  隐藏构造方法
    private HungrySingleton(){

    }

    //全局访问点
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
