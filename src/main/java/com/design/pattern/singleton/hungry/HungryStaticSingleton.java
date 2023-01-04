package com.design.pattern.singleton.hungry;

/**
 * 单例模式：确保任何情况下都绝对只有一个实例，并提供一个全局访问点
 * 饿汉式：在每次加载时创建实例 static代码块进行实例化
 * 优点:无锁（效率相对高）
 * 缺点:对于不需要立即创建实例的对象来说  浪费内存
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
